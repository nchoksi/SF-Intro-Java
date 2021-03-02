package exceptions;

import java.io.FileNotFoundException;

public class TryACheckedException {
  public static void dodgy() throws FileNotFoundException {
//    try {
      if (Math.random() > 0.5) {
        throw new FileNotFoundException("Bad value");
      }
//    } catch (FileNotFoundException iae) {
//      System.out.println("Uh oh that didn't work");
//    }
    System.out.println("Continuing dodgy method");
  }

  public static void main(String[] args) throws FileNotFoundException {
    System.out.println("about to call");
//    try {
      dodgy();
//    } catch (FileNotFoundException iae) {
//      System.out.println("Uh oh that didn't work");
//    }
    System.out.println("returned from call");
  }
}
