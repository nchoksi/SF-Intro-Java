package exceptions;

public class TryAnException {
  public static void dodgy() {
//    try {
    if (Math.random() > 0.5) {
      throw new IllegalArgumentException("Bad value");
    }
//    } catch (IllegalArgumentException iae) {
//      System.out.println("Uh oh that didn't work");
//    }
    System.out.println("Continuing dodgy method");
  }

  public static void main(String[] args) {
    System.out.println("about to call");
    try {
      dodgy();
    } catch (IllegalArgumentException iae) {
      System.out.println("Uh oh that didn't work");
    }
    System.out.println("returned from call");
  }
}
