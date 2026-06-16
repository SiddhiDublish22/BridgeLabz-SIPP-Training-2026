import java.util.Scanner;

public class TrimString {

  static String trimString(String str) {

    int start = 0;
    int end = str.length() - 1;

    while (start <= end && str.charAt(start) == ' ') {
      start++;
    }

    while (end >= start && str.charAt(end) == ' ') {
      end--;
    }

    String result = "";

    for (int i = start; i <= end; i++) {
      result += str.charAt(i);
    }

    return result;
  }

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.print("Enter String: ");
    String str = sc.nextLine();

    String userTrim = trimString(str);
    String builtInTrim = str.trim();

    System.out.println("User Trim = " + userTrim);
    System.out.println("Built-in Trim = " + builtInTrim);
    System.out.println("Equal = " +
        userTrim.equals(builtInTrim));
  }
}