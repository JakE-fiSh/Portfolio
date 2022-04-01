import java.util.Scanner;
//import java.util.ArrayList;

public class Game{
  private Player p1;
  private Player p2;
  private String input;
  private Scanner keyboard;
  private Board gameBoard;
  
  public Game(){
    p1 = new Player(3, 5, 0, 1, 1);
    p2 = new Player(8, 6, 0, -1, 2);

    input = "";

    keyboard = new Scanner(System.in);

    gameBoard = new Board(p1, p2);
  }

  public void startGame(){

    while(p1.getAliveStatus() && p2.getAliveStatus()){

      System.out.println(gameBoard);

      playerTurn(p1);

      playerTurn(p2);

    }

    if(p1.getAliveStatus()) System.out.println("Player 1 WINS!");
    else System.out.println("Player 2 WINS!");
  }


////////For a specific players turn////////////
  public void playerTurn(Player p){

    do{

      System.out.println("Player " + p.getPlayerNum() + ": ");

      sayAction(p);

      this.input = keyboard.nextLine();

      while(checkInput(input, p) == false){
        System.out.println("Not valid reponse. Please try again.");

        this.input = keyboard.nextLine();
      }
      
      if(input.equals("M")){
        moveing(p);
      }

      if(input.equals("S")){
        shooting(p);
      }

    } while(p.getShotStatus() == false || p.getMoveStatus() == false);

    p.setShotStatus(true);
    p.setMoveStatus(true);
  }

  ////////Doing the move action////////
  public void moveing(Player p){
    sayDirections();

    input = keyboard.nextLine();
    
    while(checkDirection(p, input) == false){
      System.out.println("Not valid reponse. Please try again.");

      this.input = keyboard.nextLine();
    }

    
  }

  ////////Doing the shoot action/////////
  public void shooting(Player p){
    sayDirections();

  }


  ///// Checks if the message is a valid one
  public boolean checkInput(String inp, Player turnOwner){
    if (inp.equals("S") && turnOwner.getShotStatus() == false) return true;
    if (inp.equals("M") && turnOwner.getMoveStatus() == false) return true;

    return false;
  }

  ///// Checks if the message is a valid direction
  public boolean checkDirection(Player p, String inp){
    if(inp.equals("N") && gameBoard.checkSpot(p, -1, 0)) return true;

    if(inp.equals("S") && gameBoard.checkSpot(p, 1, 0)) return true;

    if(inp.equals("E") && gameBoard.checkSpot(p, 0, 1)) return true;

    if(inp.equals("W") && gameBoard.checkSpot(p, 0, -1)) return true;

    return false;
  }
  
  ///// Prints the instructions for players
  public void sayAction(Player turnOwner){
    if(turnOwner.getMoveStatus() == false) System.out.println("Type \"M\" to do move action");

    if(turnOwner.getShotStatus() == false) System.out.println("Type \"S\" to do shoot action");
  }

  ///// Prints the instructions for a direction for players
  public void sayDirections(){
    System.out.println("Type \"S\" for downwards");
    System.out.println("Type \"N\" for upwards");
    System.out.println("Type \"E\" for the right");
    System.out.println("Type \"W\" for the left");
  }
}