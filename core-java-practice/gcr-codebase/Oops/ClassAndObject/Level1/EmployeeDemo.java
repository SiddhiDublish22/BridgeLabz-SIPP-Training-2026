package ClassAndObject.Level1;

class Employee {
    String name;
    int id;
    double salary;

    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Salary: " + salary);
    }
}

public class EmployeeDemo {
    public static void main(String[] args) {

        Employee e = new Employee();

        e.name = "Siddhi";
        e.id = 101;
        e.salary = 50000;

        e.displayDetails();
    }
}
