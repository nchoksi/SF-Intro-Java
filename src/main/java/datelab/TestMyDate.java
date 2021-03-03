package datelab;

public class TestMyDate {
  public static void main(String[] args) {
    System.out.println("is 2000 a leap year " + Date.isLeapYear(2000));
    System.out.println("Jan 1 2000 is " + new Date(1, 1, 2000));
  }
}
