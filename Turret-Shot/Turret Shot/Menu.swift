//
//  ContentView.swift
//  Turret Shot
//
//  Created by 90307297 on 2/11/22.
//

import SwiftUI



struct MenuView: View {
    @State var instructionsToggle = false
    
    var body: some View {
        NavigationView{
            ZStack{
                
                Image("TempBackground")
                    .padding(/*@START_MENU_TOKEN@*/.all, -350.0/*@END_MENU_TOKEN@*/)
                
                VStack{
                    Spacer()
                    
                    Text("Turret Shot")
                        .font(/*@START_MENU_TOKEN@*/.title/*@END_MENU_TOKEN@*/)
                        .dynamicTypeSize(/*@START_MENU_TOKEN@*/.accessibility1/*@END_MENU_TOKEN@*/)

                    
                    Spacer()
                    Spacer()
                    
                    NavigationLink(destination: {
                        GameView()
                    }, label: {
                        Image("Button")
                            .padding(/*@START_MENU_TOKEN@*/.all, -180.0/*@END_MENU_TOKEN@*/)
                            .scaleEffect(0.5)
                    })
                        
                    
                    Spacer()
                    
                    Image("offSlider")
                        .padding(/*@START_MENU_TOKEN@*/.all, -180.0/*@END_MENU_TOKEN@*/)
                        .onTapGesture {
                            self.instructionsToggle.toggle()
                        }
                        .fullScreenCover(isPresented: $instructionsToggle){
                            
                            InstructionView(otherToggle: $instructionsToggle)
                        }
                        .scaleEffect(0.5)
                }
            }
        }
    }
}



struct MenuView_Previews: PreviewProvider {
    static var previews: some View {
        MenuView()
.previewInterfaceOrientation(.landscapeRight)
    }
}
