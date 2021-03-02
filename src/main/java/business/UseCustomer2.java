package business;

//import static business.Customer.isValidCustomerName;
//import static business.Customer.sellToCustomer;

public class UseCustomer2 {
  public static void main(String[] args) {
    Customer c1 = new Customer("Fred's Hardware", "Over here", 4_000);
//    c1.name = "Fred's hardware";
//    c1.address = "Over here";
//    c1.credit = 4_000;

    boolean success = Customer.sellToCustomer(c1, 3_000, "Large jackhammer");
    if (success) {
      System.out.println("Buy beer with the commission!");
//      System.out.println("We just sold stuff to " + Customer.asText(c1));
      System.out.println("We just sold stuff to " + c1.asText());
    }

    Customer c2 = new Customer("Alice", "Over there", 5_000);
    System.out.println(c2.asText());
//    c2.credit = -10;
//    Customer.setCreditLimit(c2, 7_000);
    c2.setCreditLimit(7_000);
//    System.out.println(Customer.asText(c2));
    System.out.println(c2.asText());

    System.out.println(c2.asText());
  }

}
