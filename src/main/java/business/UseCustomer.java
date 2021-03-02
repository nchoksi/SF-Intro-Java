package business;

//import static business.Customer.isValidCustomerName;
//import static business.Customer.sellToCustomer;

public class UseCustomer {
  public static void main(String[] args) {
    System.out.println("is Fred a valid customer name? "
//      + /*business.*//*Customer.*/isValidCustomerName("Fred"));
      + /*business.*/Customer.isValidCustomerName("Fred"));

    System.out.println("max credit limit is " + Customer.maxCreditLimit);
//    System.out.println("max credit limit is " + Customer.MAX_CREDIT_LIMIT);
    Customer.maxCreditLimit = 20_000;
//    Customer.MAX_CREDIT_LIMIT = 20_000;
    System.out.println("max credit limit is " + Customer.maxCreditLimit);
//    System.out.println("max credit limit is " + Customer.MAX_CREDIT_LIMIT);

    String custOneName = "Fred's hardware";
    String custOneAddress = "Over here";
    int custOneCredit = 4_000;

    boolean success = Customer.sellToCustomer(
        custOneName, custOneAddress, custOneCredit,
        3_000, "Large jackhammer");
    if (success) {
      System.out.println("Buy beer with the commission!");
    }
  }

}
