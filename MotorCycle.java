import gear.*;
import gear.clothing.*;

public class MotorCycle {
  Sunglasses shades = null;
  BikerGang myGang = null;
  public void addHelmet() {
    Helmet.putOn();
  }
  public void addSunglasses() {
    shades = new Sunglasses();
  }
  public void joinGang(String name) {
    myGang = new BikerGang(name);
  }
  public static void main(String[] args) {
    String squad = "TomCruisers";
    BikerGang bg = new BikerGang(squad);
    /*
    System.out.println(bg.gang);
    * private variable inaccessible by different class
    */
    System.out.println(bg.getName());
    // handshake(); Not local
    // BikerGang.handshake(); Not visible

    MotorCycle mc = new MotorCycle();
    mc.joinGang(squad);
    mc.addHelmet();
    mc.addSunglasses();
    System.out.println(mc.shades.getTint() + " sunglasses");

    // Shirt not accessible from 'import gear.*;'
    Shirt tee = new Shirt("denim");
    System.out.println(tee.getShirt()); 
  }
}