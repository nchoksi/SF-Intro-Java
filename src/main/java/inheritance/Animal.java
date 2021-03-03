package inheritance;

public class Animal {
  int weight;
  int numberOfLegs;
// IF ZERO explicit constructors, compiler generates "default"
// public Animal() {}

//  public Animal() {
//    System.out.println("Yikes making an improperly initialized animal!!!");
//  }
//
  public Animal(int weight, int numberOfLegs) {
    this.weight = weight;
    this.numberOfLegs = numberOfLegs;
    System.out.println("Initializing Animal...");
  }

  public void feed(/*Animal this,*/ String food) {
    System.out.println("Yummy (in animal speak) I love " + food);
  }

  public String favoriteFood() {
    return "Air";
  }
}
