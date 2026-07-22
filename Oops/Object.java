class Student {
    String name;
    int id;
}
public class Object {
    public static void main(String[] args) {

        Student s1 = new Student();
        s1.name = "Siddhi";
        s1.id = 101;

        Student s2 = new Student();
        s2.name = "Siddhi";
        s2.id = 101;

        System.out.println(s1 == s2);

        System.out.println(s1.name == s2.name);
        System.out.println(s1.name.equals(s2.name));
    }
}