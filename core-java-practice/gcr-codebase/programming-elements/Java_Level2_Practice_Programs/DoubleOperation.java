import java.util.Scanner;
class DoubleOperation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        System.out.println((a + b * c) + ", " + (a * b + c) + ", " + (c + a / b) + ", " + (a % b + c));
    }
}