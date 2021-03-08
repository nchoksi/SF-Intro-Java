package datelab;

import java.util.ArrayList;
import java.util.List;

public class TestMyDate {
  public static void showAll(List<Date> ld) {
    for (Date d : ld) {
      System.out.println("> " + d);
    }
  }
  public static void main(String[] args) {
    System.out.println("is 2000 a leap year " + Date.isLeapYear(2000));
    System.out.println("Jan 1 2000 is " + new Date(1, 1, 2000));

    List<Date> ld = new ArrayList<>();
    ld.add(new Holiday(1, 1, 2022, "New Year's Day"));
    ld.add(new Date(3, 3,2021));
    showAll(ld);
  }
}
