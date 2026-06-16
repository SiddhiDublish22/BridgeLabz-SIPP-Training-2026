import java.util.Scanner;

public class CharacterFrequency {

  static String[][] findFrequency(String text) {
    int[] freq = new int[256];

    for (int i = 0; i < text.length(); i++) {
      freq[text.charAt(i)]++;
    }

    int count = 0;

    for (int i = 0; i < text.length(); i++) {
      if (freq[text.charAt(i)] > 0) {
        count++;
        freq[text.charAt(i)] = -freq[text.charAt(i)];
      }
    }

    String[][] result = new String[count][2];

    for (int i = 0; i < text.length(); i++) {
      if (freq[text.charAt(i)] < 0) {
        result[--count][0] = String.valueOf(text.charAt(i));
        result[count][1] = String.valueOf(-freq[text.charAt(i)]);
        freq[text.charAt(i)] = 0;
      }
    }

    return result;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter text: ");
    String text = sc.nextLine();

    String[][] result = findFrequency(text);

    System.out.println("Character\tFrequency");
    for (int i = 0; i < result.length; i++) {
      System.out.println(result[i][0] + "\t\t" + result[i][1]);
    }
  }
}