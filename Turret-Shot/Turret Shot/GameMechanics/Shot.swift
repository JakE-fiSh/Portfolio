//
//  Shot.swift
//  Turret Shot
//
//  Created by 90307297 on 2/17/22.
//

import Foundation

class Shot:MovingObject{
    private var owner: Player
    

    init(o: Player){
        self.owner = o;
        
        super.init(xP: o.xPosition + o.xOrientation, yP: o.yPosition + o.yOrientation, xO: o.xOrientation, yO: o.yOrientation)
        
      }
}
