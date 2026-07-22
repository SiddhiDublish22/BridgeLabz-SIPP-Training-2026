package ClassAndObject.Level2;

class Student {

    String name;
    int rollNumber;
    int marks;

    String calculateGrade() {

        if (marks >= 90)
            return "A";

        else if (marks >= 75)
            return "B";

        else if (marks >= 60)
            return "C";

        else
            return "Fail";
    }

    void display() {

        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNumber);
        System.out.println("Marks: " + marks);
        System.out.println("Grade: " + calculateGrade());
    }
}

public class StudentDemo {

    public static void main(String[] args) {

        Student s = new Student();

        s.name = "Siddhi";
        s.rollNumber = 11;
        s.marks = 88;

        s.display();
    }
}
