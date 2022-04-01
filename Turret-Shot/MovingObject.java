public class MovingObject{
  private int xPosition;
  private int yPosition;
  ////////ORIENTATION/////////
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
  private int yOrientation;
  private int xOrientation;

  public MovingObject(){
    xPosition = 0;
    yPosition = 0;
    yOrientation = 0;
    xOrientation = 0;
  }

  public MovingObject(int xP, int yP, int xO, int yO){
    this.xPosition = xP;
    this.yPosition = yP;
    this.yOrientation = yO;
    this.xOrientation = xO;
  }

  public int getXPosition(){
    return xPosition;
  }
  public int getYPosition(){
    return yPosition;
  }
  public int getXOrientation(){
    return xOrientation;
  }
  public int getYOrientation(){
    return yOrientation;
  }
  
  public void setXPosition(int x){
    this.xPosition = x;
  }
  public void setYPosition(int y){
    this.yPosition = y;
  }
  public void setXOrientation(int x){
    this.xOrientation = x;
  }
  public void setYOrientation(int y){
    this.yOrientation = y;
  }
}