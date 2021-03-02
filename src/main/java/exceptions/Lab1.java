package exceptions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Lab1 {
  public static double getANumber(String prompt) {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
//    Scanner in = new Scanner(System.in);
    boolean success = false;
    double result = 0;
    while (!success) {
      String line = null;
      try {
        System.out.print(prompt + " ");
//    String line = in.nextLine();
        line = in.readLine();
        result = Double.parseDouble(line);
        success = true;
      } catch (NumberFormatException nfe) {
        System.out.println(line + " doesn't look like a number");
        System.out.println("Please retry");
      } catch (IOException ioe) {
        System.out.println("keyboard failed!!!");
        throw new RuntimeException(ioe);
      }
    }
    return result;
  }

  public static void main(String[] args) {
    double num = getANumber("Please enter a number");
    System.out.println("Interesting, do you like the number " + num);
  }
}
