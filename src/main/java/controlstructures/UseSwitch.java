package controlstructures;

public class UseSwitch {
  public static void main(String[] args) {

    int monthName = 7;
    switch(monthName) {
      case 1:
        System.out.println("January");
        break;
      case 2:
        System.out.println("February");
        break;
      case 3:
        System.out.println("March");
        break;
      default:
        System.out.println("Oh, not finished writing this yet");
        break;
    }

    System.out.println("Finished");
  }
}
