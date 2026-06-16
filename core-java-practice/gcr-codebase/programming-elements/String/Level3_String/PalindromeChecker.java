import java.util.Scanner;

public class PalindromeChecker {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.print("Enter text: ");
    String str = sc.nextLine();

    boolean palindrome = true;

    int start = 0;
    int end = str.length() - 1;

    while (start < end) {

      if (str.charAt(start) != str.charAt(end)) {
        palindrome = false;
        break;
      }

      start++;
      end--;
    }

    if (palindrome)
      System.out.println("Palindrome");
    else
      System.out.println("Not Palindrome");
  }
}