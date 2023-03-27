//
//  HomeViewModel.swift
//  iosApp
//
//  Created by Abraham Sánchez Juárez on 14/03/23.
//  Copyright © 2023 orgName. All rights reserved.
//

import Foundation
import shared

extension HomeScreen{
    @MainActor class HomeViewModel: ObservableObject{
       private let getMoviesUseCase = GetMoviesUseCase.init()
       @Published private(set) var movies:[Movie] = []
       @Published private(set) var isLoading: Bool = false
       
       private var currentPage = 1
       
       private(set) var loadFinished: Bool = false
       
       func loadMovies() async{
           await Task.sleep(1 * 1_000_000_000)
           if isLoading {
               return
           }
           do{
               let movies = try await getMoviesUseCase.invoke(page: Int32(currentPage))
               isLoading = true
               loadFinished = movies.isEmpty
               
               currentPage += 1
               self.movies = self.movies + movies
           }catch{
               isLoading = false
               loadFinished = true
               print("MSJ->\(error.localizedDescription)")
           }
       }
    }
}
