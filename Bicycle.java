public class Bicycle {
        
  private int cadence;
  private int gear;
  private int speed;
      
  private int id;
  
  private static int numberOfBicycles = 0;

      
  public Bicycle(int startCadence,
                 int startSpeed,
                 int startGear) {
      gear = startGear;
      cadence = startCadence;
      speed = startSpeed;

      id = ++numberOfBicycles;
  }

  public int getID() {
      return id;
  }

  public static int getNumberOfBicycles() {
      return numberOfBicycles;
  }

  public int getCadence() {
      return cadence;
  }
      
  public void setCadence(int newValue) {
      cadence = newValue;
  }
      
  public int getGear(){
      return gear;
  }
      
  public void setGear(int newValue) {
      gear = newValue;
  }
      
  public int getSpeed() {
      return speed;
  }
      
  public void applyBrake(int decrement) {
      speed -= decrement;
  }
      
  public void speedUp(int increment) {
      speed += increment;
  }
  
  public static void main(String[] args) {
    Bicycle[] bikeShop = new Bicycle[20];
    for (int i = 0; i < bikeShop.length; i++) {
      bikeShop[i] = new Bicycle(1, 0, 1);
    }
    System.out.println(Bicycle.getNumberOfBicycles());
    bikeShop[0].gear = 4;
    System.out.println(bikeShop[0].gear);
  }
}