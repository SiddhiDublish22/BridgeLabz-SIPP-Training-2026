import java.util.Scanner;

class Handshakes {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int n = input.nextInt();
    System.out.println((n * (n - 1)) / 2);
  }
}