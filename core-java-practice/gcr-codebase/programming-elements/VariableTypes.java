public class VariableTypes{

  static int x; //no usage
  int y; //1 usage

  static void m1(){
    System.out.println("m1");
    System.out.println(x);
    VariableTypes obj = new VariableTypes();
    System.out.println(obj.y);
  }

  void m2(){
    int y = 40;
    System.out.println("m2");
    System.out.println(x);
    System.out.println(y);
    System.out.println(this.y); //current method for object specify, 
  }

  public static void main(String[] args){
    int x = 10;
    int e = 45;
    System.out.println(x);
    System.out.println(VariableTypes.x);
    x=20;
    System.out.println(x);
    VariableTypes.x = 30;
    VariableTypes obj = new VariableTypes();
    System.out.println(obj.y);
    m1();
    obj.m2();
  }
}

//non static class me non static variable direct run krega 