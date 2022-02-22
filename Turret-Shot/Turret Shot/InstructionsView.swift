//
//  InstructionsView.swift
//  Turret Shot
//
//  Created by 90307297 on 2/13/22.
//

import SwiftUI

enum InstructionButtons: String{
    case about = "About the game"
    case win = "Winning"
    case turn = "Your turn"
    case Moving
    case Shooting
}

struct InstructionView: View{
    @Binding var otherToggle: Bool
    
    let buttons: [InstructionButtons] = [.about, .win, .turn, .Moving, .Shooting]
    
    @State var viewDisplay = ""
    
    //@State var tabButton = Tab(t: .gray)
    
    
    var body: some View{
        VStack{
            
            HStack{
                Text("< Back")
                    .font(.system(size: 20))
                    .foregroundColor(Color.blue)
                    .padding(6.0)
                    .onTapGesture {
                        otherToggle.toggle()
                    }
                Spacer()
            }
            
            ZStack{
                
                VStack{
                    
                    HStack{
                        ForEach(buttons, id: \.self){ item in
                            Button(action:{
                                
                                self.didTap(button: item)
                                
                            }, label:{
                                Text(item.rawValue)
                                    .font(.system(size: 20))
                                    .frame(width: 160, height: 40)
                                    .foregroundColor(.black)
                                    .border(Color.cyan)
                            })
                        }
                    }
                    
                    Spacer()
                }
                
                Rectangle()
                    .padding(.top, 40.0)
                    .foregroundColor(.white)
                    .border(.blue, width: 1)
                
                Text(viewDisplay)
            }
        }
    }
    
    func didTap(button: InstructionButtons){
        switch button{
        case .about:
            viewDisplay = "About the game"
        case .turn:
            viewDisplay = "Your turn"
        case .win:
            viewDisplay = "Winning"
        case .Moving:
            viewDisplay = "Moving"
        case .Shooting:
            viewDisplay = "Shooting"
        }
        
    }
}

class Tab{
    
    var shape = Rectangle()
    @State var touchedColor: Color
    
    init(t: Color){
        touchedColor = t
    }

}

/*
struct InstructionView_Previews: PreviewProvider {
    static var previews: some View {
        InstructionView()
            .previewInterfaceOrientation(.landscapeRight)
    }
}
*/
