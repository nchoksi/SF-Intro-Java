package zeller;

public class Zeller {

  public static void main(String[] args) {
    int day = 1;
    int month = 1;
    int year = 2000;

    // Zeller's congruence (Wikipedia)
//    if (month < 3) {
//      month += 12;
//      year -= 1;
//    }
    year = (month < 3) ? year - 1 : year;
    month = (month < 3) ? month + 12 : month;
    int dow = (day + (13 * (month + 1) / 5) + year + year / 4 - year / 100 + year / 400) % 7;

//    switch (dow) {
//      case 0:
//        System.out.println("Saturday");
//        break;
//      case 1:
//        System.out.println("Sunday");
//        break;
//      case 2:
//        System.out.println("Monday");
//        break;
//      case 3:
//        System.out.println("Tuesday");
//        break;
//      case 4:
//        System.out.println("Wednesday");
//        break;
//      case 5:
//        System.out.println("Thursday");
//        break;
//      case 6:
//        System.out.println("Friday");
//        break;
//    }
    String dayName = switch (dow) {
      case 0 -> "Saturday";
      case 1 -> "Sunday";
      case 2 -> "Monday";
      case 3 -> "Tuesday";
      case 4 -> "Wednesday";
      case 5 -> "Thursday";
      case 6 -> "Friday";
      default -> "Unknown day number";
    };
    System.out.println("Day is " + dayName);
  }
}
