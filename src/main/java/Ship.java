public class Ship {
  private int capacity;
  private int speed;
  private String name;
  private ShipStatus shipStatus;
  private ShipLocation shipLocation;

  public Ship(int capacity, int speed, ShipStatus shipStatus, ShipLocation shipLocation) {
    this.capacity = capacity;
    this.speed = speed;
    this.shipStatus = shipStatus;
    this.shipLocation = shipLocation;
  }

  public int getCapacity() {
    return capacity;
  }

  public void setCapacity(int capacity) {
    this.capacity = capacity;
  }

  public int getSpeed() {
    return speed;
  }

  public void setSpeed(int speed) {
    this.speed = speed;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ShipStatus getShipStatus() {
    return shipStatus;
  }

  public void setShipStatus(ShipStatus shipStatus) {
    this.shipStatus = shipStatus;
  }

  public ShipLocation getShipLocation() {
    return shipLocation;
  }

  public void setShipLocation(ShipLocation shipLocation) {
    this.shipLocation = shipLocation;
  }
}
