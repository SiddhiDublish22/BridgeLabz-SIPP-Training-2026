import java.util.Scanner;

public class StudentGradeCalculator {

  static String grade(double per) {

    if (per >= 90)
      return "A+";

    else if (per >= 80)
      return "A";

    else if (per >= 70)
      return "B";

    else if (per >= 60)
      return "C";

    else if (per >= 50)
      return "D";

    return "Fail";
  }

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int n;

    System.out.print(
        "Enter Number of Students: ");

    n = sc.nextInt();

    System.out.println(
        "\nPhy\tChem\tMath\tTotal\tPer\tGrade");

    for (int i = 1; i <= n; i++) {

      int phy = (int) (Math.random() * 100);
      int chem = (int) (Math.random() * 100);
      int math = (int) (Math.random() * 100);

      int total = phy + chem + math;

      double per = total / 3.0;

      System.out.println(
          phy + "\t" +
              chem + "\t" +
              math + "\t" +
              total + "\t" +
              Math.round(per * 100.0) / 100.0 +
              "\t" +
              grade(per));
    }
  }
}