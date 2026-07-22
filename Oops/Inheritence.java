class Animal{
  void walk(){
    System.out.println("Animal Walk()");
  }
}

class Monkey extends Animal{
  void monkey(){

  }
}

//@override
void walk(){
  System.out.println("Monkey walk()");
}

public class Inheritence{
  public static void main(String[] args) {
    Animal obj1 = new Animal();
    Monkey obj2 = new Monkey();
    Animal obj3 = new Monkey();
    obj1.walk();
    obj2.walk();
    obj3.walk();
    
    System.out.println("------------------");

    Test ref = new Test();
    ref.m1(obj1); //Animal
    ref.m1(obj2); //Monkey
    ref.m1(obj3); //Animal
    
    //obj1.monkey();
    //obj3.monkey();
  }
}