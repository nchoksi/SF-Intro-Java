package varargs;

public class UseVarargs {
//  public static void showItems(String[] values) {
  public static void showItems(String ... values) {
    for (String s : values) {
      System.out.println("> " + s);
    }
  }

  public static void main(String[] args) {
    String [] names = {"Fred", "Jim", "Sheila", "Alice"};
    showItems(names);
    System.out.println("-----------------");
    showItems(new String[]{"Fred", "Jim", "Sheila", "Alice"});
    System.out.println("-----------------");
    showItems("Fred", "Jim", "Sheila", "Alice");
  }
}
