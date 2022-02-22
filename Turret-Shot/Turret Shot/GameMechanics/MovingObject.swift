//
//  MovingObject.swift
//  Turret Shot
//
//  Created by 90307297 on 2/17/22.
//

import Foundation

class MovingObject{
    var xPosition: Int
    var yPosition: Int
      ///ORIENTATION
      /*
      0,0 = no direction
      0,-1 = left
      0,1 = right
      -1,0 = up
      1,0 = down
      -1,-1 = up left
      -1,1 = up right
      1,-1 = down left
      1,1 = down right
      */
    var yOrientation: Int
    var xOrientation: Int
    
    init(xP: Int, yP: Int ,xO: Int ,yO: Int){
        xPosition = xP;
        yPosition = yP;
        yOrientation = yO;
        xOrientation = xO;
    }

}
