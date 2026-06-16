import java.util.Scanner;

public class WordLength2D {

  static String[] splitWords(String text) {
    return text.split(" ");
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter Text: ");
    String text = sc.nextLine();

    String[] words = splitWords(text);

    String[][] arr = new String[words.length][2];

    for (int i = 0; i < words.length; i++) {
      arr[i][0] = words[i];
      arr[i][1] = String.valueOf(words[i].length());
    }

    System.out.println("Word\tLength");

    for (int i = 0; i < arr.length; i++) {
      System.out.println(arr[i][0] + "\t" +
          Integer.parseInt(arr[i][1]));
    }
  }
}