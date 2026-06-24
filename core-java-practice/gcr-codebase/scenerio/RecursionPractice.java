import java.util.*;

public class RecursionPractice {

  static void towerOfHanoi(int n, char source, char helper, char destination) {
    if (n == 1) {
      System.out.println("Move disk 1 from " + source + " to " + destination);
      return;
    }

    towerOfHanoi(n - 1, source, destination, helper);
    System.out.println("Move disk " + n + " from " + source + " to " + destination);
    towerOfHanoi(n - 1, helper, source, destination);
  }

  static int sumOfDigits(int n) {
    if (n == 0) {
      return 0;
    }

    return n % 10 + sumOfDigits(n / 10);
  }

  static String reverseString(String str) {
    if (str.length() == 0) {
      return "";
    }

    return reverseString(str.substring(1)) + str.charAt(0);
  }

  static int binarySearch(int[] arr, int low, int high, int key) {
    if (low > high) {
      return -1;
    }

    int mid = (low + high) / 2;

    if (arr[mid] == key) {
      return mid;
    } else if (key < arr[mid]) {
      return binarySearch(arr, low, mid - 1, key);
    } else {
      return binarySearch(arr, mid + 1, high, key);
    }
  }

  static boolean checkBalanced(String str) {
    int count = 0;

    for (int i = 0; i < str.length(); i++) {
      if (str.charAt(i) == '(') {
        count++;
      } else if (str.charAt(i) == ')') {
        count--;
      }

      if (count < 0) {
        return false;
      }
    }

    return count == 0;
  }

  public static void main(String[] args) {
    towerOfHanoi(3, 'A', 'B', 'C');

    System.out.println("Sum of digits: " + sumOfDigits(1234));

    System.out.println("Reverse string: " + reverseString("hello"));

    int[] arr = { 10, 20, 30, 40, 50 };
    int index = binarySearch(arr, 0, arr.length - 1, 30);

    System.out.println("Element found at index: " + index);

    String brackets = "(())";
    System.out.println("Balanced parentheses: " + checkBalanced(brackets));
  }
}
