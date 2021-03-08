package inheritance;

public class TestInterfaceCat {
  public static void main(String[] args) {
    CatV1 c1 = new CatV1();
    Feedable f1 = c1;
    f1.feed(f1.favoriteFood());
    Pettable p1 = c1;
    p1.pet();
  }
}
