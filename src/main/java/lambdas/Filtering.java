package lambdas;

import java.lang.reflect.Array;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Filtering {
  // Predicate<String> { boolean test(String s); }

//  public static boolean test(String s) {
//    return s.length() > 3;
//  }

  public static List<String> getLongString(List<String> input, int threshold) {
    List<String> results = new ArrayList<>();
    for (String s : input) {
      if (s.length() > threshold) {
        results.add(s);
      }
    }
    return results;
  }

//  public static List<String> filter(List<String> input, Predicate<String> test) {
//    List<String> results = new ArrayList<>();
//    for (String s : input) {
//      boolean iLikeThisOne = test.test(s);
//      if (iLikeThisOne) {
//        results.add(s);
//      }
//    }
//    return results;
//  }

  public static <E> List<E> filter(List<E> input, Predicate<E> test) {
    List<E> results = new ArrayList<>();
    for (E s : input) {
      boolean iLikeThisOne = test.test(s);
      if (iLikeThisOne) {
        results.add(s);
      }
    }
    return results;
  }

  public static void main(String[] args) {
    List<String> names = List.of("Fred", "Jim", "Shiela");
    List<String> longNames = filter(names, (String s) -> { return s.length() > 3; });
    int threshold = 4;
    System.out.println(filter(names, (String s) -> { return s.length() > threshold; }));
    System.out.println(filter(names, (String s) -> { return s.length() < 6; }));
    System.out.println(filter(names, (String s) -> { return s.charAt(0) < 'M'; }));

    LocalDate today = LocalDate.now();
    LocalDate yesterday = today.minusDays(1);
    LocalDate tomorrow = today.plusDays(1);

    List<LocalDate> ld = List.of(yesterday, tomorrow, today);
//    System.out.println(filter(ld, (LocalDate d) -> { return d.isAfter(yesterday); }));
//    System.out.println(filter(ld, (d) -> { return d.isAfter(yesterday); }));
    System.out.println(filter(ld, d -> d.isAfter(yesterday)));

    ld = new ArrayList<>(ld);
    // do this with a list of String.
//    ld.sort( .. lambda expression here .. );

    names = new ArrayList<>(names);
    names.add("Alice");
    names.add("Derek");
    names.add("Malcolm");
    System.out.println(names);
    System.out.println(names);
//    names.sort(
//        (String s1, String s2) -> {
//          return s1.compareTo(s2);
//        }
//    );
    names.sort(
//        (s1, s2) -> s1.compareTo(s2)
        String::compareTo // method reference
    );
    names.sort(
        (s1, s2) -> s2.compareTo(s1)
    );
    System.out.println(names);

    names.sort(
        // Might over/underflow!!!
//        (s1, s2) -> s1.length() - s2.length()

        (s1, s2) -> Integer.compare(s1.length(), s2.length())
    );
    System.out.println(names);
  }
}
