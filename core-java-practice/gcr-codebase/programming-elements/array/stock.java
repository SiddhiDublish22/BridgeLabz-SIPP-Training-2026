//A warehouse stores item quantities in an array. Find the min, max, total_stock, and detect duplicates.
//Extend: rotate the stock array by k positions(simulate daily shift handover), and transpose a 2D shelf.

import java.util.*;

public class stock {
  public static void main(String[] args) {
    
    int[] stock = {45, 20, 60, 20, 90, 15, 60};
    findMinMax(stock);
    findTotal(stock);
    searchItem(stock,90);
    findDuplicates(stock);


    rotateArray(stock, 2);

}

public static void findMinMax(int[] arr){
  int min = arr[0];
  int max = arr[0];

  for(int i=0; i<arr.length; i++){
    if(arr[i] < min){
      min = arr[i];
    }
    if(arr[i] > max){
      max = arr[i];
    }
  }
  System.out.println("Min"+ min);
  System.out.println("Max"+ max);
}

public static void findTotal(int[] arr){
  int total = 0;
  for(int i=0; i<arr.length; i++){
    total += arr[i];
  }
  System.out.println("Total Stock" + total);
}

public static void searchItem(int[] arr, int target){
  boolean found = false;

  for(int i=0; i<arr.length; i++){
    if(arr[i] == target){
      System.out.println("Item found at index: "+ );
      found = true;
      break;
    }
  }
  if(found == false){
    System.out.println("Item not found");
  }
}

public static void findDuplicates(int[] arr){
  System.out.println("Duplicates:");

  for(int i=0; i<arr.length; i++){
    for(int j=i+1; j<arr.length; j++){
      if(arr[i] == arr[j]){
        System.out.println(arr[i]);
        break;
      }
    }
  }
}

public static int[] rotateArray(int[] arr, int k){
  int n = arr.length;
  int[] result = new int[n];

  for(int i=0; i<n; i++){
    int newIndex = (i+k) % n;
    result[newIndex] = arr[i];
  }
  return result;
}

public static void transpose(int[][] matrix){
  System.out.println("Transpose:");
  for(int i=0; i<matrix[0].length; i++){
    for(int j=0; j<matrix.length; j++){
      System.out.print(matrix[j][i] + " ");
    }
    System.out.println();
  }
}
}
