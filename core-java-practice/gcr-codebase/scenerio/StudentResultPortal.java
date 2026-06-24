import java.io.*;

public class StudentResultPortal {
    public static void main(String[] args) {

        try {
            FileReader fr = new FileReader("students.txt");
            BufferedReader br = new BufferedReader(fr);

            FileWriter fw = new FileWriter("report.txt", true);
            BufferedWriter bw = new BufferedWriter(fw);

            String line;

            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");

                String name = data[0];
                int marks1 = Integer.parseInt(data[1]);
                int marks2 = Integer.parseInt(data[2]);
                int marks3 = Integer.parseInt(data[3]);

                double average = (marks1 + marks2 + marks3) / 3.0;

                bw.write("Name: " + name + " Average: " + average);
                bw.newLine();
            }

            br.close();
            bw.close();

            System.out.println("Report created successfully");
        } catch (FileNotFoundException e) {
            System.out.println("students.txt file not found");
        } catch (IOException e) {
            System.out.println("File error occurred");
        }
    }
}