public class ShipMotor extends Ship {
  private int propellerEngine;

  public ShipMotor(int capacity, int speed, ShipStatus shipStatus, ShipLocation shipLocation, int propellerEngine) {
    super(capacity, speed, shipStatus, shipLocation);
    this.setName("Motorboat");
    this.propellerEngine = propellerEngine;
  }
}
