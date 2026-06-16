public class VariableTask {
  static int x; //no usage
  int y; //1 usage

  static void m1(){
    System.out.println("m1");
    System.out.println(x);
  }

  void m2(){
    System.out.println("m2");
    System.out.println(x);
  }

public static void main(String[] args) {
  int x=10;
  System.out.println(x);
  VariableTypes obj = new VariableTypes();
  System.out.println(obj.x);
  m1();
  obj.m2();
}

}
