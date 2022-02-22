//
//  Board.swift
//  Turret Shot
//
//  Created by 90307297 on 2/17/22.
//

import Foundation

class Board{
    var positions: [[Int]]
    var players: [Player]
    
    init(player1: Player, player2: Player){
        positions = Array(repeating: Array(repeating: 0, count: 13), count: 13)
        
        positions[0] = Array(repeating: 9, count: 13)
        positions[1][0...3] = [9,9,9,9]
        positions[1][9...12] = [9,9,9,9]
        positions[2][0...2] = [9,9,9]
        positions[2][10...12] = [9,9,9]
        positions[3][0...1] = [9,9]
        positions[3][11...12] = [9,9]
        
        for i in 4...8{
            positions[i][0] = 9
            positions[i][positions[0].count - 1] = 9
        }
        
        positions[positions.count - 4][0...1] = [9,9]
        positions[positions.count - 4][11...12] = [9,9]
        positions[positions.count - 3][0...2] = [9,9,9]
        positions[positions.count - 3][10...12] = [9,9,9]
        positions[positions.count - 2][0...3] = [9,9,9,9]
        positions[positions.count - 2][9...12] = [9,9,9,9]
        positions[positions.count - 1] = Array(repeating: 9, count: 13)
        
        players = [player1, player2]
        
        positions[player1.yPosition][player1.xPosition] = 1
        positions[player2.yPosition][player2.xPosition] = 2
    }
    
    func printTwoDArray(){
        for row in 0...positions.count - 1{
            for col in 0...positions[0].count - 1{
                print(positions[row][col], terminator: " ")
            }
            print("")
        }
    }
    
}
