package inheritance;

import java.util.Set;

public class Cat extends Animal {
//  public Cat(int weight, int numberOfLegs, String color) {
  public Cat(int weight, String color) {
    // IF there is no explicit call to super(...)
    // COMPILER GENERATES super();
//    super(weight, numberOfLegs);
    super(weight, 4);
    System.out.println("Initializing a cat");
  }

  private static final Set<String> foods =
      Set.of("Mice", "Fish", "Birds");

  @Override
  public void feed(/*Cat this, */String food) {
    if (foods.contains(food)) {
      System.out.println("(in animal speak, yay " + food);
//      super.feed(food); // not possible if parent method is abstract
//      int requiredFood = this.weight; // not allowed for private elements in parent
      int requiredFood = /*this.*/getWeight();
      // protected is visible, provided reference type is sub-type
      int legCount = this.numberOfLegs;
      System.out.println("purr purr purr, eat, wander off");
    } else {
      System.out.println("Claw the bad human servant!");
    }
  }

  @Override
  public String favoriteFood() {
    return "Birds";
  }

  public void pet() {
    System.out.println("purr purr, look cute...");
    System.out.println("short pause");
    System.out.println("scratch and run away!");
  }
}
