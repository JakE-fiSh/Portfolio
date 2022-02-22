//
//  Player.swift
//  Turret Shot
//
//  Created by 90307297 on 2/17/22.
//

import Foundation

class Player:MovingObject{
    var aliveStatus: Bool //True if the player is alive
    var shotStatus: Bool  //True if it shot
    var moveStatus: Bool  //True if it moved
    var playerNum: Int    //Player label
    var shots: [Shot]
    
    init(xP: Int, yP: Int, xO: Int, yO: Int, n: Int){
        self.playerNum = n
        self.aliveStatus = true
        self.moveStatus = true
        self.shotStatus = true
        
        shots = []
        
        super.init(xP: xP, yP: yP, xO: xO, yO: yP)
    }
    
    
}
