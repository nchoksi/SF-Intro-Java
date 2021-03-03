package inheritance;

public class CatV1 implements Feedable, Pettable {
  @Override
  public String favoriteFood() {
    return "Fish";
  }

  @Override
  public void feed(String food) {
    System.out.println("CatV1 eating " + food);
  }

  @Override
  public void pet() {
    System.out.println("Puurrr purrr, scratch");
  }
}
