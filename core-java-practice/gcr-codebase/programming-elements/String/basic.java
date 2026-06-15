import java.util.*;

public class basic {
  public static void main(String[] args){
    String s = "Siddhi";
    System.out.println(s);
    System.out.println(s.length());
    System.out.println(s.charAt(0));
    System.out.println(s.charAt(1));

    // //string comparison
<<<<<<< HEAD
    // String s1 = "hello";
    // String s2 = "hello";
    // String s3 = new String("hello");
    // System.out.println(s1.equals(s2)); // true //value compare krega 
    // System.out.println(s1 == s2); //avoid this //false //memory compare krega
    // System.out.println(s1 == s3);
=======
    String s1 = "hello";
    String s2 = "hello";
    String s3 = new String("hello");
    System.out.println(s1.equals(s2)); // true
    System.out.println(s1 == s2); //avoid this
    System.out.println(s1 == s3);
>>>>>>> 9c4dae1f1d08863857cd70e2073c02698610e896

    //string immutability
    String s = "hello";
    s.toUpperCase();
    System.out.println(s); //still "hello"

    s=s.toUpperCase();
    System.out.println(s); //"HELLO"

    //reverse string
    String s = "hello";
    String result ="";

    for(int i=s.length()-1; i>=0; i--){
      result = result + s.charAt(i);
    }
    System.out.println(result);

    //palindrom check
    String s = "madam";
    String reversed = "";

    for(int i=s.length()-1; i>=0; i--){
      reversed = reversed + s.charAt(i);
    }
    if(s.equals(reversed)){
      System.out.println("Palindrom");
    }
    else{
      System.out.println("Not palindrom");
    }

    //string to char array
    String s = "hello";
    char[] arr = s.toCharArray();

    for(int i=0; i<arr.length; i++){
      System.out.println(arr[i]);
    }
  }
}
