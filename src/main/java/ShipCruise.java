public class ShipCruise extends Ship {
  private int propellerEngine;
  private int steeringWheel;
  private int anchor;

  public ShipCruise(int capacity, int speed, ShipStatus shipStatus, ShipLocation shipLocation, int propellerEngine, int steeringWheel, int anchor) {
    super(capacity, speed, shipStatus, shipLocation);
    this.setName("Cruise");
    this.propellerEngine = propellerEngine;
    this.steeringWheel = steeringWheel;
    this.anchor = anchor;
  }
}
