package datelab;

public class Date {
  private int day;
  private int month;
  private int year;

  // legal but probly not nice style
//  private int a = 3, b, c = 99;

  public Date(int day, int month, int year) {
    if (validDate(day, month, year)) {
      this.day = day;
      this.month = month;
      this.year = year;
    } else {
      throw new IllegalArgumentException("Bad values for a date");
    }
  }

  public static boolean validDate(int day, int month, int year) {
    return (month >= 1 && month <= 12
        && day >= 1 && day <= daysInMonth(month, year));
  }

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

  private static final String [] dayNames = {
      "Saturday", "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday",
  };
  public static String dayName(int day) {
    return dayNames[day];
  }

  public String asText(Date this) {
    return "Date: " + this.day + "/" + this.month + "/" + this.year;
  }

  public int dayOfWeek(Date this) {
    int month = this.month;
    int year = this.year;
    if (month < 3) {
      month += 12;
      year -= 1;
    }
    return (this.day + (13 * (month + 1) / 5) + year + year / 4 - year / 100 + year / 400) % 7;
  }

  public void tomorrow(Date this) {
    this.day++;
    if (this.day > daysInMonth(this.month, this.year)) {
      this.day = 1;
      this.month++;
      if (this.month > 12) {
        this.month = 1;
        this.year++;
      }
    }
  }
  // Equality test!!!

}
