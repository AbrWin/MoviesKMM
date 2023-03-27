//
//  MovieItemLoading.swift
//  iosApp
//
//  Created by Abraham Sánchez Juárez on 27/03/23.
//  Copyright © 2023 orgName. All rights reserved.
//

import SwiftUI

struct ContentLoader: View {
    
    let gridColumns: [GridItem] = Array(repeating: GridItem(.flexible(), spacing: 16), count: 2)
    
    var body: some View {
        LazyVGrid(columns: gridColumns, spacing: 16){
            
            ForEach(0..<6){_ in
            
                VStack(alignment: .leading, spacing: 8){
                    ZStack{
                        ShimmerLoading()
                        Circle()
                            .frame(width: 50, height: 50)
                            .foregroundColor(.black.opacity(0.7))
                        
                        Image(systemName: "play.fill")
                    }
                    .frame(maxWidth: .infinity, idealHeight: .infinity)
                    .clipShape(RoundedRectangle(cornerRadius: 8))
                    
                    ShimmerLoading().frame(height: 25)
                    ShimmerLoading().frame(height: 14)
                    
                    
                }
                .frame(maxWidth: .infinity, maxHeight: 260)
            }
        }.padding(.horizontal, 12)
        
    }
}

struct MovieItemLoading_Previews: PreviewProvider {
    static var previews: some View {
        ContentLoader()
    }
}
