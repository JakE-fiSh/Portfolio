
public class Board{
  private int[][] positions;
  private Box[][] neatBoard;
  private Player[] players;

  public Board(Player p1, Player p2){
    positions = new int[12][12];
    neatBoard = new Box[12][12];
    players = new Player[2];
    
    players[0] = p1;
    players[1] = p2;

    for(int row = 0; row < positions.length; row++){
      for(int col = 0; col < positions[0].length; col++){
        positions[row][col] = 0;
      }
    }

    for(int row = 0; row < positions.length; row++){
      for(int col = 0; col < positions[0].length; col++){
        if(row == 0 || row == positions.length -1) positions[row][col] = 9;
        else if((row == 1 || row == positions.length -2) && (col < 4 || col > positions[0].length -5)) positions[row][col] = 9;
        else if((row == 2 || row == positions.length -3) && (col < 3 || col > positions[0].length -4)) positions[row][col] = 9;
        else if((row == 3 || row == positions.length -4) && (col < 2 || col > positions[0].length -3)) positions[row][col] = 9;
        else if((row == 4 || row == positions.length -5) && (col < 1 || col > positions[0].length -2)) positions[row][col] = 9;
        else if((row > 4 && row < positions.length -5) && (col == 0 || col == positions[0].length -1)) positions[row][col] = 9;
      }
    }
    for(int row = 0; row < positions.length; row++){
      for(int col = 0; col < positions[0].length; col++){
        if(row == 0 || row == positions.length -1){

          if (positions[row][col] == 9 && row == 0 && positions[row +1][col] == 0) 
          positions[row][col] = 8; //Mark horizontial walls

          else if (positions[row][col] == 9 && row == positions.length -1 && positions[row -1][col] == 0)

          positions[row][col] = 8; //Mark horizontial walls
        }
        else if (col == 0 || col == positions[0].length -1){

          if (positions[row][col] == 9 && col == 0 && positions[row][col +1] == 0) //Marks vertical walls
          
          positions[row][col] = 7;
          
          else if (positions[row][col] == 9 && col == positions[0].length -1 && positions[row][col -1] == 0) //Marks vertical walls
          
           positions[row][col] = 7;
        }
        else {

          if ((positions[row][col] == 9 && positions[row][col +1] == 0 && positions[row -1][col] == 0) || (positions[row][col] == 9 && positions[row][col -1] == 0 && positions[row +1][col] == 0)) //Marks right to left walls

          positions[row][col] = 6;

          else if ((positions[row][col] == 9 && positions[row][col +1] == 0 && positions[row +1][col] == 0) || (positions[row][col] == 9 && positions[row][col -1] == 0 && positions[row -1][col] == 0)) //Marks left to right walls

          positions[row][col] = 5;

          else if (row == p1.getYPosition() && col == p1.getXPosition()) //Mark player 1 position

          positions[row][col] = 1;

          else if (row == p2.getYPosition() && col == p2.getXPosition()) //Mark player 2 position

          positions[row][col] = 2;
        }
      }
    }

    makeBoard();
  }

  public int[][] getPositions(){
    return this.positions;
  }

  public void makeBoard(){
    for(int row = 0; row < positions.length; row++){
      for(int col = 0; col < positions[0].length; col++){
        neatBoard[row][col] = new Box(positions[row][col], players[0], players[1]);
      }
    }
  }

  public void movePlayerMark(Player p){
    
  }

  public void moveShotMark(Player p){
    
  }

  public boolean checkSpot(Player p, int y, int x){
    return positions[p.getXPosition() + x][p.getYPosition() + y] == 0;
  }

  public String toString(){
    String all = "";

    for(int row = 0; row < neatBoard.length; row++){
      for(int rows = 0; rows < 5; rows++){
        for(int col = 0; col < neatBoard[0].length; col++){
          all += neatBoard[row][col].getRow(rows);
        }
        all += "\n";
      }
    }

    return all;
  }
  
}