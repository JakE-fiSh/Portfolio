public class Shot extends MovingObject{
  private Player owner;

  public Shot(Player o){
    super(o.getXPosition() + o.getXOrientation(), o.getYPosition() + o.getYOrientation(), o.getXOrientation(), o.getYOrientation());

    this.owner = o;
  }

}