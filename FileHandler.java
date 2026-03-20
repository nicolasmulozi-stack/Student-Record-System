import java.io.*;
import java.util.*;

public class FileHandler {

    public static void saveStudent(Student s) {
        try (FileWriter fw = new FileWriter("students.txt", true)) {
            fw.write(s.toString() + "\n");
        } catch (IOException e) {
            System.out.println("Error writing file.");
        }
    }

    public static void readStudents() {
        try (BufferedReader br = new BufferedReader(new FileReader("students.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println("Student: " + line);
            }
        } catch (IOException e) {
            System.out.println("Error reading file.");
        }
    }
}