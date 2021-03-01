package hello.world;

// java.lang package is special. No need to import
//import java.lang.*;
import java.lang.System;
import java.util.Scanner;

import static java.lang.System.out;

public class Hello {
  public static void main(/*java.lang.*/String[] args) {
//    java.lang.System.out.println("""
//  "hello world!"
//   she said
//  """);
//    java.lang.System.out.println("\"hello world!\" she said");
//    System.out.println("\"hello world!\" she said");
    out.println("\"hello world!\" she said");

    // strong, static, typing

    int x = 99; // int is +- 2billion (32 bin binary)
//    x = 3.14; // not allowed
    Scanner sc = new Scanner(System.in);
    String line = sc.nextLine();
    out.println(line);
    int value = Integer.parseInt(line);
    value = value + 10;
    out.println(value);

    int ninetynine = 99;
    short s = 99;
//    short s = ninetynine;
  }
}

