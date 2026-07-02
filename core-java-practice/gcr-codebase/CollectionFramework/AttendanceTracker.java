import java.util.*;

public class AttendanceTracker {
    public static void main(String[] args) {
        HashMap<String, ArrayList<String>> attendance = new HashMap<>();

        markAttendance(attendance, "Java", "Siddhi");
        markAttendance(attendance, "Java", "Rahul");
        markAttendance(attendance, "Java", "Siddhi");

        markAttendance(attendance, "DBMS", "Aman");
        markAttendance(attendance, "DBMS", "Siddhi");

        displayAttendance(attendance);
    }

    static void markAttendance(HashMap<String, ArrayList<String>> attendance,
                               String subject, String student) {

        attendance.putIfAbsent(subject, new ArrayList<>());

        ArrayList<String> students = attendance.get(subject);

        if (students.contains(student)) {
            System.out.println("Duplicate attendance not allowed: " + student + " in " + subject);
        } else {
            students.add(student);
            System.out.println("Attendance marked: " + student + " in " + subject);
        }
    }

    static void displayAttendance(HashMap<String, ArrayList<String>> attendance) {
        System.out.println("\nAttendance List:");

        for (String subject : attendance.keySet()) {
            ArrayList<String> students = attendance.get(subject);

            System.out.println("\nSubject: " + subject);
            for (String student : students) {
                System.out.println(student);
            }

            System.out.println("Total students: " + students.size());
        }
    }
}