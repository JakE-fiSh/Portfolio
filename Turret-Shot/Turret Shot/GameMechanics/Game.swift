//
//  Game.swift
//  Turret Shot
//
//  Created by 90307297 on 2/16/22.
//

import Foundation
import SwiftUI

class Game{
    
    var p1: Player
    var p2: Player
    var gameBoard: Board
    
    init(){
        p1 = Player(xP: 3, yP: 6, xO: 0, yO: 1, n: 1)
        p2 = Player(xP: 9, yP: 6, xO: 0, yO: -1, n: 2)
        
        gameBoard = Board(player1: p1, player2: p2)
    }
    
    func startGame(){
        
        
        //while p1.aliveStatus && p2.aliveStatus{
            gameBoard.printTwoDArray()
            
            playerTurn(p: p1)
            
            playerTurn(p: p2)
        //}
         
    }
    
    func playerTurn(p: Player){
        
    }
}
