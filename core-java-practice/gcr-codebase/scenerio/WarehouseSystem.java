import java.util.*;

public class WarehouseSystem {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int[] stock = { 10, 20, 30, 20, 50 };

    int max = stock[0];
    int min = stock[0];
    int total = 0;

    for (int i = 0; i < stock.length; i++) {
      if (stock[i] > max) {
        max = stock[i];
      }

      if (stock[i] < min) {
        min = stock[i];
      }

      total += stock[i];
    }

    System.out.println("Maximum stock: " + max);
    System.out.println("Minimum stock: " + min);
    System.out.println("Total stock: " + total);

    System.out.println("Duplicate stock:");
    for (int i = 0; i < stock.length; i++) {
      for (int j = i + 1; j < stock.length; j++) {
        if (stock[i] == stock[j]) {
          System.out.println(stock[i]);
        }
      }
    }

    System.out.print("Enter k value: ");
    int k = sc.nextInt();

    k = k % stock.length;

    System.out.println("Rotated stock array:");
    for (int i = stock.length - k; i < stock.length; i++) {
      System.out.print(stock[i] + " ");
    }

    for (int i = 0; i < stock.length - k; i++) {
      System.out.print(stock[i] + " ");
    }

    int[][] shelf = {
        { 1, 2, 3 },
        { 4, 5, 6 }
    };

    System.out.println("\nTranspose of shelf grid:");
    for (int i = 0; i < shelf[0].length; i++) {
      for (int j = 0; j < shelf.length; j++) {
        System.out.print(shelf[j][i] + " ");
      }
      System.out.println();
    }
  }
}
