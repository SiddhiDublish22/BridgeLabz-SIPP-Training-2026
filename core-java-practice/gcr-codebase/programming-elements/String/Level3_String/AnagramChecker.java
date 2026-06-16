import java.util.Scanner;

public class AnagramChecker {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.print("Enter first string: ");
    String str1 = sc.nextLine();

    System.out.print("Enter second string: ");
    String str2 = sc.nextLine();

    if (str1.length() != str2.length()) {
      System.out.println("Not Anagram");
      return;
    }

    int[] freq = new int[256];

    for (int i = 0; i < str1.length(); i++) {
      freq[str1.charAt(i)]++;
      freq[str2.charAt(i)]--;
    }

    boolean flag = true;

    for (int i = 0; i < 256; i++) {
      if (freq[i] != 0) {
        flag = false;
        break;
      }
    }

    if (flag)
      System.out.println("Anagram");
    else
      System.out.println("Not Anagram");
  }
}