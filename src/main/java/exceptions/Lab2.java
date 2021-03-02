package exceptions;

import java.io.*;

public class Lab2 {
  public static double getNumberFromFile(BufferedReader in) throws IOException {
    try {
      String line = in.readLine();
      if (line == null) throw new IOException("End of File");
      return Double.parseDouble(line);
    } catch (NumberFormatException nfe) {
      return 0;
    }
  }

  public static void main(String[] args) /*throws Throwable*/ {
    BufferedReader kbd = new BufferedReader(new InputStreamReader(System.in));

    boolean success = false;
    BufferedReader fr = null;
    while (!success) {
      try {
        System.out.print("Please enter filename: ");
        String fileName = kbd.readLine();
        fr = new BufferedReader(new FileReader(fileName));
        success = true;
      } catch (FileNotFoundException fnfe) {
        System.out.println("Oops, that's not a file I can find");
      } catch (IOException ioe) {
        System.out.println("keyboard failure");
        System.exit(-1);
      }
    }

    final BufferedReader fr2 = fr;
    double sum = 0;
    try (fr2) { // Java 9 allows final resource, *not* initialized here
      while (true) {
        double num = getNumberFromFile(fr);
        System.out.println("> " + num);
        sum += num;
      }
    } catch (IOException ioe) {
      // do nothing, this is valid, end of file
//    } finally {
//      try {
//        fr.close();
//      } catch (IOException e) {
//        e.printStackTrace();
//      }
    }
    System.out.println("All finished, sum is " + sum);
  }
}
