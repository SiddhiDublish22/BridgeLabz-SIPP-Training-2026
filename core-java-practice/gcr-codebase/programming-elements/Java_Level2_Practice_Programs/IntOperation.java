import java.util.Scanner;
class IntOperation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        System.out.println((a + b * c) + ", " + (a * b + c) + ", " + (c + a / b) + ", " + (a % b + c));
    }
}