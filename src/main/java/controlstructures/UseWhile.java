package controlstructures;

public class UseWhile {
  public static void main(String[] args) {
    int x = 3;
    while (x > 0) {
      System.out.println("x is " + x);
//      x = x - 1;
//      x -= 1;
      x--; // --x differs from x--
    }
    System.out.println("--------------");
    for (int y = 0; y < 4; y++) {
      System.out.println("y is " + y);
    }
    // locally declared vars in a for loop have scope
    // restricted to the loop body and control elements
//    System.out.println(y);
  }
}
