import java.util.*;

class InsufficientFundsException extends Exception {
  InsufficientFundsException(String msg) {
    super(msg);
  }
}

public class HospitalBillingSystem {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    try {
      int bill = 1000;
      int items = 0;

      int ans = bill / items;
      System.out.println("Bill per item: " + ans);
    } catch (ArithmeticException e) {
      System.out.println("Error: division by zero not possible");
    }

    try {
      int[] patient = { 101, 102, 103 };

      System.out.println(patient[5]);
    } catch (ArrayIndexOutOfBoundsException e) {
      System.out.println("Error: invalid patient index");
    }

    try {
      String amount = "abc";

      int payment = Integer.parseInt(amount);
      System.out.println(payment);
    } catch (NumberFormatException e) {
      System.out.println("Error: bad input format");
    }

    try {
      int balance = 500;
      int payment = 1000;

      if (payment > balance) {
        throw new InsufficientFundsException("Payment failed because balance is low");
      } else {
        System.out.println("Payment successful");
      }
    } catch (InsufficientFundsException e) {
      System.out.println(e.getMessage());
    }
  }
}
