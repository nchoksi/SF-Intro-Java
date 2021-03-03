package inheritance;

public class ZooKeeper {

  public static void feed(Animal a) {
    String favFood = a.favoriteFood();
    a.feed(favFood);

    // Probably yukky design!!!
//    if (a instanceof Cat) {
//      a.feed("Mice");
//    } else if (a instanceof Dog) {
//      a.feed("shoes");
//    }
  }

  public static void main(String[] args) {
    Animal a = new Animal(5, 4);
    a.feed("Worms");
    Animal c = new Cat(5, "Tabby");
    // actual instance behavior chosen from type of OBJECT referred to.
    c.feed("Mice");

    System.out.println("Feeding Animal");
    feed(a);
    System.out.println("Feeding Cat");
    feed(c);
    // Permitted behaviors chosen from type of REFERENCE
//    c.pet();
    if (c instanceof Cat) {
      Cat c1 = (Cat)c;
      c1.pet();
    }
  }
}
