package equality;

import java.util.ArrayList;
import java.util.List;

public class StringTests {
  public static void main(String[] args) {
    int x = 3;
    int y = 4;
    if (x == y) {
      System.out.println("Surprise!?");
    } else {
      System.out.println("Yup, I thought not");
    }

    String greet = "Hello";
    String g1 = "He";
    g1 = g1 + "llo";
    System.out.println("greet is " + greet);
    System.out.println("g1 is " + g1);
    System.out.println("greet == g1 " + (greet == g1));
    System.out.println("greet.equals(g1) " + (greet.equals(g1)));

    String greetShout = greet.toUpperCase();
    System.out.println("greet is now: " + greet);
    System.out.println("greetShout is: " + greetShout);

    StringBuilder sb = new StringBuilder("Hello StringBuilder");
    System.out.println("sb is " + sb);
    sb.reverse();
    System.out.println("sb is now " + sb);
    StringBuilder sb2 = new StringBuilder("Hello");
    sb = new StringBuilder("Hello");
    System.out.println("sb is " + sb);
    System.out.println("sb2 is " + sb2);
    System.out.println("sb == sb2 " + (sb == sb2));
    System.out.println("sb.equals(sb2) " + (sb.equals(sb2)));

    List<String> ls = new ArrayList<>();
    ls.add("Fred");
    ls.add("Jim");
    ls.add("Sheila");
    boolean contains = ls.contains("Jim");
    System.out.println("Contains? " + contains);

    System.out.println("sb and sb2 same text? " +
        (sb.toString().equals(sb2.toString())));

    greet = "Hello";
    g1 = "He";
    g1 += "llo";
    System.out.println("greet == g1? " + (greet == g1));
    g1 = g1.intern(); // look for existing "constant" entry, return or create it
    System.out.println("greet == g1? " + (greet == g1));
  }
}
