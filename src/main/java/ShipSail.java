public class ShipSail extends Ship {
  private int steeringWheel;
  private int sail;
  private int anchor;

  public ShipSail(int capacity, int speed, ShipStatus shipStatus, ShipLocation shipLocation, int steeringWheel, int sail, int anchor) {
    super(capacity, speed, shipStatus, shipLocation);
    this.setName("Sailing Ship");
    this.steeringWheel = steeringWheel;
    this.sail = sail;
    this.anchor = anchor;
  }
}
