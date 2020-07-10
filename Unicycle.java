import java.time.Year;

class Unicycle {
  static public int WHEELS = 1;
  public String owner;
  public String color;
  public Year makeYear;
  
  public Unicycle(String ownerVal) {
    owner = ownerVal;
    color = "black";
    makeYear = Year.now();
  }
  public Unicycle(String ownerVal, String colorVal) {
    owner = ownerVal;
    color = colorVal;
    makeYear = Year.now();
  }
  public Unicycle(String ownerVal, String colorVal, Year yearVal) {
    owner = ownerVal;
    color = colorVal;
    makeYear = yearVal;
  }
  public int getWheels() {
    return WHEELS;
  }
  public static int getWheelsStat() {
    return WHEELS;
  }
  /*
  * static method cannot access instance values
  public static String describeUnicycle() {
    System.out.format("%s has a %t %s unicycle", owner, makeYear, color);
  }
  */
  public void describeUnicycle() {
    System.out.format("%s has a %s %s unicycle.%n", owner, makeYear.toString(), color);
  }
  public static void greetUnicycle() {
    System.out.println("Hello there! I like your unicycle!");
  }
  public String getColor() {
    return color;
  }
  public void setColor(String colorVal) {
    color = colorVal;
  }

  public static class Horn {
    public static void honk() {
      System.out.printf("BEEP%n");
    }
    public Horn() {
      System.out.printf("beep beep ");
      honk();
    }
  }

  public class Wheel {
    int diameter;
    public Wheel(int val) {
      diameter = val;
    }
    public int getWidth() {return diameter;}
  }

  public static void main(String[] args) {
    // getColor(); Error cannot make static ref to instance.
    greetUnicycle();
    /*
    System.out.format("#Wheels %d%n", getWheels());
    * Doesn't work even though wheels variable is static
    * because getWheels is instance method
    */
    System.out.format("# Wheels: %d%n", getWheelsStat());
    String owner = "Matt";
    String color = "green";
    Year makeYear = Year.of(1923);
    Unicycle misterSpinny = new Unicycle(owner, color, makeYear);
    misterSpinny.describeUnicycle();
    misterSpinny.setColor("rainbow");
    misterSpinny.describeUnicycle();
    
    Horn.honk(); // static class does not require instance
    new Unicycle.Horn();
    /*
    Wheel myWheel = new Wheel(36);
    * Error inner class must be attached to instance
    */
    Unicycle.Wheel mrWheel = misterSpinny.new Wheel(36);
    System.out.println("misterSpinny's wheel diam " + mrWheel.getWidth());
  }
}