package temp;

import java.util.Scanner;

public class FtoC {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter F temp: ");
    String line = sc.nextLine();
//    int f = Integer.parseInt(line);
    double f = Double.parseDouble(line);
    double c = (5 / 9)*(f - 32);
    System.out.println("Celsius temp is " + c);
  }
}
