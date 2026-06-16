import java.util.Scanner;

public class CharacterType {

    static String checkCharacter(char ch) {

        if (ch >= 'A' && ch <= 'Z') {
            ch = (char) (ch + 32);
        }

        if (ch >= 'a' && ch <= 'z') {

            if (ch == 'a' || ch == 'e' || ch == 'i' ||
                    ch == 'o' || ch == 'u')
                return "Vowel";

            return "Consonant";
        }

        return "Not a Letter";
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter String: ");
        String str = sc.nextLine();

        System.out.println("Character\tType");

        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i) + "\t\t" +
                    checkCharacter(str.charAt(i)));
        }
    }
}