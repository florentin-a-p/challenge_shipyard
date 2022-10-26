import java.util.Scanner;

public class Main {
  private static Scanner scanner = new Scanner(System.in);
  private static ShipList shipList = new ShipList();

  public static void main(String[] args) {
    boolean quit = false;
    int choice = 0;

    while (!quit) {
      System.out.println("Enter your choice: ");
      printInstructions();
      choice = scanner.nextInt();
      scanner.nextLine();

      switch (choice) {
        case 1:
          printShip();
          break;
        case 2:
          addShip();
          break;
        case 3:
          checkStatusLocation();
          break;
        case 4:
          changeStatusLocation();
          break;
        case 5:
          quit = true;
          break;
      }
    }
  }

  public static void printInstructions() {
    System.out.println("\nPress ");
    System.out.println("\t 1 - To print the list of ships.");
    System.out.println("\t 2 - To place new ship creation.");
    System.out.println("\t 3 - To check ship status & location.");
    System.out.println("\t 4 - To change ship status & location.");
    System.out.println("\t 5 - To quit.");
  }

  public static void printShipType() {
    System.out.println("\nPress ");
    System.out.println("\t 1 - Motorboat.");
    System.out.println("\t 2 - Sailing Ship.");
    System.out.println("\t 3 - Cruise.");
  }

  public static void printShip() {
    for (int i=0; i<shipList.size(); i++) {
      System.out.println("ID: " + (i+1) + ", " +
          "Name: " + shipList.get(i+1).getName() + ", " +
          "Status: " + shipList.get(i+1).getShipStatus() + ", " +
          "Location: " + shipList.get(i+1).getShipLocation());
    }
  }

  public static void addShip() {
    System.out.println("Enter the type of ship you want to build: ");
    printShipType();
    int shipChoice = scanner.nextInt();

    System.out.println("Enter capacity (in pax): ");
    int capacity = scanner.nextInt();
    System.out.println("Enter speed: ");
    int speed = scanner.nextInt();

    Ship ship = null;
    ShipStatus status = ShipStatus.PROCUREMENT;
    ShipLocation location = ShipLocation.STOCKYARD;

    switch(shipChoice) {
      case 1:
        System.out.println("Enter propeller engine: ");
        int propellerEngine = scanner.nextInt();
        ship = new ShipMotor(capacity,speed,status,location,propellerEngine);
        break;
      case 2:
        System.out.println("Enter steering wheel: ");
        int steeringWheel = scanner.nextInt();
        System.out.println("Enter sail: ");
        int sail = scanner.nextInt();
        System.out.println("Enter anchor: ");
        int anchor = scanner.nextInt();
        ship = new ShipSail(capacity,speed,status,location,steeringWheel,sail,anchor);
        break;
      case 3:
        System.out.println("Enter propeller engine: ");
        propellerEngine = scanner.nextInt();
        System.out.println("Enter steering wheel: ");
        steeringWheel = scanner.nextInt();
        System.out.println("Enter anchor: ");
        anchor = scanner.nextInt();
        ship = new ShipCruise(capacity,speed,status,location,propellerEngine,steeringWheel,anchor);
        break;
    }

    int id = shipList.size() + 1;
    shipList.put(id,ship);
  }

  public static void checkStatusLocation() {
    System.out.println("Enter ship ID: ");
    int id = scanner.nextInt();
    System.out.println("Your ship " + shipList.get(id).getName() + " is in " + shipList.get(id).getShipStatus() + " and at " + shipList.get(id).getShipLocation());
  }

  public static void checkStatusLocation(int id) {
    System.out.println("Your ship " + shipList.get(id).getName() + " is in " + shipList.get(id).getShipStatus() + " and at " + shipList.get(id).getShipLocation());
  }

  public static void changeStatusLocation() {
    System.out.println("Enter ship ID: ");
    int id = scanner.nextInt();
    checkStatusLocation(id);
    System.out.println("Enter new status: ");

    System.out.println("\nPress ");
    System.out.println("\t 1 - PROCUREMENT.");
    System.out.println("\t 2 - ASSEMBLY.");
    System.out.println("\t 3 - PAINT.");
    System.out.println("\t 4 - TEST.");
    System.out.println("\t 5 - DELIVERED.");

    int statusChoice = scanner.nextInt();
    switch(statusChoice) {
      case 1:
        shipList.get(id).setShipStatus(ShipStatus.PROCUREMENT);
        shipList.get(id).setShipLocation(ShipLocation.STOCKYARD);
        break;
      case 2:
        shipList.get(id).setShipStatus(ShipStatus.ASSEMBLY);
        shipList.get(id).setShipLocation(ShipLocation.ASSEMBLY_HALL);
        break;
      case 3:
        shipList.get(id).setShipStatus(ShipStatus.PAINT);
        shipList.get(id).setShipLocation(ShipLocation.PAINTING_BOOTH);
        break;
      case 4:
        shipList.get(id).setShipStatus(ShipStatus.TEST);
        shipList.get(id).setShipLocation(ShipLocation.TESTING_PIER);
        break;
      case 5:
        shipList.get(id).setShipStatus(ShipStatus.DELIVERED);
        shipList.get(id).setShipLocation(ShipLocation.CUSTOMER);
        break;
    }
  }
}
