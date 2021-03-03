package datelab;

public class Date {
//      - monthName
//  - dayName
  public static boolean isLeapYear(int year) {
    return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
  }

  private static final int [] dayCounts = { 31, 0, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
  public static int daysInMonth(int month, int year) {
    if (month == 2) {
//      if (/*Date.*/isLeapYear(year)) return 29;
//      else return 30;
      return isLeapYear(year) ? 29 : 28;
    } else {
      return dayCounts[month - 1];
    }
  }
  private static final String [] monthNames = {
      "January", "February", "March", "April", "May", "June",
      "July", "August", "September", "October", "November", "December",
  };
  public static String monthName(int month) {
    return monthNames[month - 1];
  }


}
