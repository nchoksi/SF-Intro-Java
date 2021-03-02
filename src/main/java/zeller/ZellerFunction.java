package zeller;

enum Month {
  JANUARY, FEBRUARY, MARCH, APRIL, MAY, JUNE, JULY,
  AUGUST, SEPTEMBER, OCTOBER, NOVEMBER, DECEMBER;
}

public class ZellerFunction {
  public static int dayOfWeek(int day, Month m, int year) {
    return dayOfWeek(day, m.ordinal() + 1, year);
  }

  // NO default arguments...
  public static int dayOfWeek(int day, int month, int year) {
    if (month < 3) {
      month += 12;
      year--;
    }
    return (day + (13 * (month + 1) / 5) + year + year / 4 - year / 100 + year / 400) % 7;
  }

  // method overloading: same name, same class, different formal parameter type list
  public static int dayOfWeek(int day, int month) {
    return dayOfWeek(day, month, 2021);
  }

  public static void main(String[] args) {
    System.out.println(dayOfWeek(1, 3));
    System.out.println(dayOfWeek(1, 1, 2000));
    // no named parameters
//    dayOfWeek(month=1, day=12, year=2021);
    System.out.println(dayOfWeek(1, Month.JANUARY, 2000));
//    Month.JANUARY.
  }
}
