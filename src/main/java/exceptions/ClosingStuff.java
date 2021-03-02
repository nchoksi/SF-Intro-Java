package exceptions;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ClosingStuff {
  public static void main(String[] args) {
    // try-with-resources
    // multiple resources close in reverse order from opening.
    try (
        FileReader fr = new FileReader("data.txt");
        BufferedReader br = new BufferedReader(fr);
    ) {

    } catch (IOException fnfe) {
      System.out.println("oops");
    }


    // BAD don't do it this "legacy" way
//    FileReader fr = null;
//    try {
//      fr = new FileReader("data.txt");
//    } catch(FileNotFoundException fnfe) {
//      System.out.println("oops");
//    } finally {
//      if (fr != null) {
//        try {
//          fr.close();
//        } catch (IOException e) {
//          e.printStackTrace();
//        }
//      }
//    }
  }
}
