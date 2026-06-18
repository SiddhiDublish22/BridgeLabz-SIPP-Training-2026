//build a 'Math_Wizard' utility class: isPrime(n), factorial(n) using iteration, fibonacci(n), gcd(a,b), lcm(a,b) and power(base,exp). Overload factorial to also accept double. Demonstrate scope differences between local and instance variable

import java.util.*;

public class math_wizard {
  int num = 100;
  int lastResult;

  public boolean isPrime(int n) {
    if (n <= 1)
      return false;
    for (int i = 2; i * i <= n; i++) {
      if (n % i == 0)
        return false;
    }
    lastResult = n;
    return true;
  }

  public int factorial(int n) {
    int fact = 1;

    for (int i = 1; i <= n; i++) {
      fact *= i;
    }
    return fact;
  }

  public double factorial(double n) {
    double fact = 1;
    for (double i = 1; i <= n; i++) {
      fact *= i;
    }
    return fact;
  }

  public int fibonacci(int n) {
    if (n <= 1)
      return n;
    return fibonacci(n - 1) + fibonacci(n - 2);
  }

  public int gcd(int a, int b) {
    if (b == 0)
      return a;
    return gcd(b, a % b);
  }

  public int lcm(int a, int b) {
    return (a * b) / gcd(a, b);
  }

  public int power(int base, int exp) {
    int ans = 1;

    for (int i = 1; i <= exp; i++) {
      ans *= base;
    }

    return ans;
  }

  public static void main(String[] args) {
    math_wizard obj = new math_wizard();

    int num = 10;

    System.out.println("Local variable num = " + num);
    System.out.println("Instance variable num = " + obj.num);

    System.out.println("Prime: " + obj.isPrime(7));
    System.out.println("Factorial int: " + obj.factorial(5));
    System.out.println("Factorial double: " + obj.factorial(5.0));
    System.out.println("Fibonacci: " + obj.fibonacci(6));
    System.out.println("GCD: " + obj.gcd(20, 30));
    System.out.println("LCM: " + obj.lcm(20, 30));
    System.out.println("Power: " + obj.power(2, 3));
  }
}