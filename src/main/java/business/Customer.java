package business;

public class Customer {
  // instance fields (only exist after creating an object)
  // MUST specify an object to get at a field
  private String name; // "private" -> visible inside "top level" enclosing curly braces.
  private String address;
  private int credit;

//  class Thing{}
  public Customer(String name, String address, int credit) {
    // new operation creates the data structure, call an object
    // sets all fields to zero, then calls the "matching" constructor (initializer :)
    // new object has a "hidden" variable name, "this"
    if (name != null && Customer.isValidCustomerName(name) &&
    address != null && credit >= 0 && credit <= Customer.maxCreditLimit) {
      this.name = name;
      this.address = address;
      this.credit = credit;
    } else {
      throw new IllegalArgumentException("Bad customer values");
    }
  }

  public static boolean isValidCustomerName(String s) {
    return s != null && s.length() > 2;
  }

  public/* static */void setCreditLimit(Customer this, int limit) {
    if (limit <= Customer.maxCreditLimit && limit >= 0) {
      this.credit = limit;
    } else {
      throw new IllegalArgumentException("Bad credit limit value");
    }
  }

//  public static void setCreditLimit(Customer c, int limit) {
//    if (limit <= Customer.maxCreditLimit && limit >= 0) {
//      c.credit = limit;
//    } else {
//      throw new IllegalArgumentException("Bad credit limit value");
//    }
//  }

  public static boolean sellToCustomer(Customer c, int price, String item) {
    return sellToCustomer(c.name, c.address, c.credit, price, item);
  }

//  public static String asText(Customer c) {
  public /*static*/ String asText(Customer this) {
    return "Customer: name=" + this.name + " address=" + this.address + " credit=" + this.credit;
  }

  public static boolean sellToCustomer(
      String name, String address, int cred,
      int price, String item) {
    if (price < cred) {
      System.out.println("Yup, sell the " + item);
      return true;
    }
    return false;
  }

  public static int maxCreditLimit = 10_000;
//  public static final int MAX_CREDIT_LIMIT = 10_000;
}
