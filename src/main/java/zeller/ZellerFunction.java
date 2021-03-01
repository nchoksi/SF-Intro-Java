package zeller;

public class ZellerFunction {
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
  }
}
