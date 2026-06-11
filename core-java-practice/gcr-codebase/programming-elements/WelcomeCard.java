import java.util.*;
public class WelcomeCard {
    static int annualBonus(double salary) {
        return (int)(salary * 0.12);
    }
    
    static void welcomeCard(String name, int age, int rank,double salary, float membershipFee) {
        int bonus = annualBonus(salary);
       System.out.println("welcome card");
       System.out.println(name);
       System.out.println(age);
       System.out.println(rank);
       System.out.println(salary);
       System.out.println(membershipFee);
       System.out.println(bonus);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Name");
        String name = sc.next();
        System.out.print("Enter Age");
        int age = sc.nextInt();
        System.out.print("Enter Rank");
        int rank = sc.nextInt();
        System.out.print("Enter Salary");
        double salary = sc.nextDouble();
        System.out.print("Enter Membership Fee");
        float membershipFee = sc.nextFloat();
        welcomeCard(name, age, rank, salary, membershipFee);
    }
}

