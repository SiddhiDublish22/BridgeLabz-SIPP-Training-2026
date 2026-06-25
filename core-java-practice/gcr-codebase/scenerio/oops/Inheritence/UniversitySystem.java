//1.A university system has Person → Student → GradStudent. Each level adds attributes (GPA, thesis). Override toString() at each level. Use super() to chain constructors. Make studentId final. Demonstrate that GradStudent IS-A Student IS-A Person.

class Person{
  String name;
  int age;

  Person(String name, int age){
    this.name = name;
    this.age = age;
  }

  public String toString(){
    return "Name"+name+"\nAge"+age;
  }
}

class Student extends Person{
  final int StudentID;
  double gpa;

  Student(String name, int age,int StudentID, double gpa){
    super(name,age);
    this.StudentID = StudentID;
    this.gpa = gpa;
  }

  public String toString(){
    return super.toString()+"\nStudentID"+StudentID+"\ngpa"+gpa;
  }
}

class GradStudent extends Student{
  String thesis;

  GradStudent(String name, int age, int StudentID, double gpa, String thesis){
    super(name,age,StudentID,gpa);
    this.thesis = thesis;
  }

  public String toString(){
    return super.toString()+"\nthesis"+thesis;
  }
}


public class UniversitySystem {
  public static void main(String[] args){

    GradStudent gs = new GradStudent("siddhi",20,101,9.5,"Artifical Intelligence");

    System.out.println(gs);
    System.out.println("\nIS-A-RELATIONSHIP");
    System.out.println("GradStudent is a Student: " + (gs instanceof Student));
    System.out.println("GradStudent is a Person: " + (gs instanceof Person));
  }
}
