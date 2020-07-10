public class BikerGang {
  private String name;
  public BikerGang(String initName) {
    name = initName;
  }
  public String getName() {
    return name;
  }
  public void setGang(String newName) {
     name = newName;
  }
  private static void handshake() {
    System.out.println("secret handshake");
  }
  public static void main(String[] args) {
    BikerGang bg = new BikerGang("A-Team");
    System.out.println(bg.name);
    // private variable accessible by local class 
    handshake();
  }
}