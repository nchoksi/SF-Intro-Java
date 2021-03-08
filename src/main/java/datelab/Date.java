package datelab;

import java.util.Objects;

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

//  public String asText(@NotNull Date this) {
//  public String asText() {
  @Override
  public String toString() {
    return "Date: " + this.day + "/" + this.month + "/" + this.year;
  }

//  public int dayOfWeek(Date this) {
  public int dayOfWeek() {
    int month = this.month;
    int year = this.year;
    if (month < 3) {
      month += 12;
      year -= 1;
    }
    return (this.day + (13 * (month + 1) / 5) + year + year / 4 - year / 100 + year / 400) % 7;
  }

//  public void tomorrow(Date this) {
  public void tomorrow() {
//    this.day++;
    day++;
//    if (this.day > Date.daysInMonth(this.month, this.year)) {
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
  // Java says "if you implement equals, you really should!!! implement hashcode
//  public boolean equals(/*Date this, */Object other) {
  public boolean equals(Object other) {
//    if (other instanceof Date)
    if (other.getClass() == Date.class) { // or " == this.getClass()"
      Date oDate = (Date)other;
      return oDate.day == this.day
          && oDate.month == this.month
          && oDate.year == this.year;
    } else return false;
  }

  public int hashCode() {
    return Objects.hash(day, month, year);
  }
}










