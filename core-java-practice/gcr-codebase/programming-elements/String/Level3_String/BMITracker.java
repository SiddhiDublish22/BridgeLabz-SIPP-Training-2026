import java.util.Scanner;

public class BMITracker {

  static String getStatus(double bmi) {
    if (bmi < 18.5)
      return "Underweight";
    else if (bmi < 25)
      return "Normal";
    else if (bmi < 30)
      return "Overweight";
    else
      return "Obese";
  }

  static String[][] calculateBMI(double[][] data) {
    String[][] result = new String[10][4];

    for (int i = 0; i < 10; i++) {
      double weight = data[i][0];
      double heightCm = data[i][1];
      double heightM = heightCm / 100;

      double bmi = weight / (heightM * heightM);

      result[i][0] = String.valueOf(heightCm);
      result[i][1] = String.valueOf(weight);
      result[i][2] = String.valueOf(Math.round(bmi * 100.0) / 100.0);
      result[i][3] = getStatus(bmi);
    }

    return result;
  }

  static void display(String[][] arr) {
    System.out.println("Height\tWeight\tBMI\tStatus");

    for (int i = 0; i < arr.length; i++) {
      System.out.println(arr[i][0] + "\t" + arr[i][1] + "\t" + arr[i][2] + "\t" + arr[i][3]);
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    double[][] data = new double[10][2];

    for (int i = 0; i < 10; i++) {
      System.out.print("Enter weight of person " + (i + 1) + ": ");
      data[i][0] = sc.nextDouble();

      System.out.print("Enter height in cm of person " + (i + 1) + ": ");
      data[i][1] = sc.nextDouble();
    }

    String[][] result = calculateBMI(data);
    display(result);
  }
}