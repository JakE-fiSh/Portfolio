//
//  GameView.swift
//  Turret Shot
//
//  Created by 90307297 on 2/16/22.
//

import SwiftUI
import SpriteKit
import GameKit

struct GameView: View{
    
    var newGame: Game = Game()
    @State var startLable: String = "Start"
    
    var body: some View {
        ZStack{
            Rectangle()
                .foregroundColor(.cyan)
                .edgesIgnoringSafeArea(/*@START_MENU_TOKEN@*/.all/*@END_MENU_TOKEN@*/)            
            
            VStack{
                
                VStack(spacing: 5){
                    ForEach(newGame.gameBoard.positions, id: \.self){ rows in
                        HStack(spacing: 5){
                            ForEach(rows, id:\.self){ item in
                                if (item == 9){
                                    Rectangle()
                                        .frame(width: 10, height: 10)
                                }
                                
                                else if (item == 1){
                                    Rectangle()
                                        .frame(width: 10, height: 10)
                                        .foregroundColor(.blue)
                                }
                                
                                else if (item == 2){
                                    Rectangle()
                                        .frame(width: 10, height: 10)
                                        .foregroundColor(.red)
                                }
                                
                                else {
                                    Rectangle()
                                        .frame(width: 10, height: 10)
                                        .foregroundColor(.brown)
                                }
                            }
                        }
                    }
                }
                
                HStack{
                    
                    Button("Move", action: {
                        
                    })
                    
                    Spacer()
                    
                    Text("Shoot")
                        .padding(/*@START_MENU_TOKEN@*/.all/*@END_MENU_TOKEN@*/)
                        
                }
            }
        }
    }
}


struct GameView_Previews: PreviewProvider {
    static var previews: some View {
        GameView()
            .previewInterfaceOrientation(.landscapeRight)
    }
}

