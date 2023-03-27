//
//  ShimmerLoading.swift
//  iosApp
//
//  Created by Abraham Sánchez Juárez on 27/03/23.
//  Copyright © 2023 orgName. All rights reserved.
//

import SwiftUI

struct ShimmerLoading: View {
    
    @State var startPoing: UnitPoint = .init(x: -1.8, y: -1.2)
    @State var endPoint: UnitPoint = .init(x: 0, y: -0.2)
    private var gradientColors = [
        Color.gray,
        Color.clear,
        Color.gray
    ]
    var body: some View {
        LinearGradient(
            colors: gradientColors,
            startPoint: startPoing,
            endPoint: endPoint)
        .onAppear {
            withAnimation(.easeInOut(duration: 3)
                .repeatForever(autoreverses: false)){
                    startPoing = .init(x: 1, y: 1)
                    endPoint = .init(x: 2, y: 2.2)
                }
            }
    }
}

struct ShimmerLoading_Previews: PreviewProvider {
    static var previews: some View {
        ShimmerLoading()
    }
}
