import java.util.Scanner;

class PurchasePrice {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    double price = input.nextDouble();
    int qty = input.nextInt();
    System.out.println(price * qty);
  }
}