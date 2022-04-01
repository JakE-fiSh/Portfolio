import java.util.ArrayList;

public class Player extends MovingObject{

  private boolean aliveStatus; //True if the player is alive
  private boolean shotStatus; //True if it shot
  private boolean moveStatus; //True if it moved
  private int playerNum; //Player label
  private ArrayList<Shot> shots;

  public Player(int xP, int yP, int xO, int yO, int n){
    super(xP, yP, xO, yO);
    this.aliveStatus = true;
    this.shotStatus = false;
    this.moveStatus = false;
    this.playerNum = n;
    shots = new ArrayList<>();
  }

  public void makeShot(Player o){
    shots.add(new Shot(o));
  }

  public boolean getAliveStatus(){
    return aliveStatus;
  }

  public boolean getShotStatus(){
    return shotStatus;
  }

  public boolean getMoveStatus(){
    return moveStatus;
  }
  
  public int getPlayerNum(){
    return playerNum;
  }

  public ArrayList<Shot> getShots(){
    return shots;
  }

  public void setAliveStatus(boolean stat){
    this.aliveStatus = stat;
  }

  public void setShotStatus(boolean stat){
    this.shotStatus = stat;
  }

  public void setMoveStatus(boolean stat){
    this.moveStatus = stat;
  }
}