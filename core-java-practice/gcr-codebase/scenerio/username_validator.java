import java.util.*;
public class username_validator{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String name = sc.nextLine();

    if(name.contains(" ")){
      System.out.println("it contains spaces");
    }
    else{
      System.out.println("it doesn't contains spaces");
    }

    System.out.println(name.length());
    System.out.println(name.toUpperCase());

    String rev="";
    for(int i=name.length()-1; i>=0; i--) {
      rev += name.charAt(i);
    }

    if(name.equalsIgnoreCase(rev)){
      System.out.println("Palindrome");
    }
    else{
      System.out.println("Not palindrome");
    }
  }
}