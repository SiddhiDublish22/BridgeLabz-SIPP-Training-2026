package ClassAndObject.Level2;

class PalindromeChecker {

    String text;

    boolean isPalindrome() {

        String rev = "";

        for (int i = text.length() - 1; i >= 0; i--) {

            rev += text.charAt(i);
        }

        return text.equals(rev);
    }

    void displayResult() {

        if (isPalindrome())
            System.out.println("Palindrome");

        else
            System.out.println("Not Palindrome");
    }
}

public class PalindromeDemo {

    public static void main(String[] args) {

        PalindromeChecker p = new PalindromeChecker();

        p.text = "madam";

        p.displayResult();
    }
}
