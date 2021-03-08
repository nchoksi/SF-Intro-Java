package inheritance;

public class Dog extends Animal {
  String breed;
  public Dog(int weight, String breed) {
    super(weight, 4);
    this.breed = breed;
  }

  @Override
  public void feed(String food) {
    System.out.println("woof woof wag wag, eat too fast " + food);
  }

  @Override
  public String favoriteFood() {
    return "Anything!";
  }
}
