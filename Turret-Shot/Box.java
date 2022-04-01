public class Box{

  private String row1;
  private String row2;
  private String row3;
  private String row4;

  public Box(int point, Player p1, Player p2){
    if(point == 9) makeVoid();

    else if(point == 8) horzLines();
      
    else if(point == 7) vertLines();

    else if(point == 6) rightToLeft();

    else if(point == 5) leftToRight();

    else if(point == 2) makePlayer2(p2);

    else if(point == 1) makePlayer1(p1);

    else if(point == 0) makeBox();
  }

  public String getRow1(){
    return row1;
  }

  public String getRow2(){
    return row2;
  }

  public String getRow3(){
    return row3;
  }

  public String getRow4(){
    return row4;
  }

  public String getRow(int num){
    if(num == 1) return row1;

    if(num == 2) return row2;

    if(num == 3) return row3;

    if(num == 4) return row4;

    return "";
  }

  public String makeBox(int count){
    String total = "";
    for(int i = 0; i < count; i++){

    }
    return total;
  }

  public String makeLines(int count){
    String total = "";

    return total;
  }

  public void makeVoid(){
    this.row1 = "         ";
    this.row2 = "         ";
    this.row3 = "         ";
    this.row4 = "         ";
  }

  public void horzLines(){
    this.row1 = "         ";
    this.row2 = "_________";
    this.row3 = "         ";
    this.row4 = "         ";
  }

  public void vertLines(){
    this.row1 = "    |    ";
    this.row2 = "    |    ";
    this.row3 = "    |    ";
    this.row4 = "    |    ";
  }

  public void leftToRight(){
    this.row1 = "      ooo";
    this.row2 = "    ooo  ";
    this.row3 = "  ooo    ";
    this.row4 = "ooo      ";
  }

  public void rightToLeft(){
    this.row1 = "ooo      ";
    this.row2 = "  ooo    ";
    this.row3 = "    ooo  ";
    this.row4 = "      ooo";
  }

  public void makeBox(){
    this.row1 = "+-------+";
    this.row2 = "|       |";
    this.row3 = "|       |";
    this.row4 = "+-------+";
  }

  public void makePlayer1(Player p1){
    int xO = p1.getXOrientation();
    int yO = p1.getYOrientation();

    this.row1 = "+-------+";
    this.row2 = "|Player1|";
    this.row4 = "+-------+";

    if (xO == 0){
      if (yO == 0)
      this.row3 = "|   NA  |";

      else if (yO == -1)
      this.row3 = "|   WW  |"; 

      else if (yO == 1)
      this.row3 = "|   EE  |";
    }

    else if (xO == 1){
      if (yO == 0)
      this.row3 = "|   SS  |";

      else if (yO == 1)
      this.row3 = "|   SE  |";

      else if (yO == -1)
      this.row3 = "|   SW  |";
    }

    else if (xO == -1){
      if (yO == 0)
      this.row3 = "|   NN  |";

      else if (yO == 1)
      this.row3 = "|   NE  |";

      else if (yO == -1)
      this.row3 = "|   NW  |";
    }
    
  }

  public void makePlayer2(Player p2){
    int xO = p2.getXOrientation();
    int yO = p2.getYOrientation();

    this.row1 = "+-------+";
    this.row2 = "|Player2|";
    this.row4 = "+-------+";

    if (xO == 0){
      if (yO == 0)
      this.row3 = "|   NA  |";

      else if (yO == -1)
      this.row3 = "|   WW  |"; 

      else if (yO == 1)
      this.row3 = "|   EE  |";
    }

    else if (xO == 1){
      if (yO == 0)
      this.row3 = "|   SS  |";

      else if (yO == 1)
      this.row3 = "|   SE  |";

      else if (yO == -1)
      this.row3 = "|   SW  |";
    }

    else if (xO == -1){
      if (yO == 0)
      this.row3 = "|   NN  |";

      else if (yO == 1)
      this.row3 = "|   NE  |";

      else if (yO == -1)
      this.row3 = "|   NW  |";
    }
  }

  
}