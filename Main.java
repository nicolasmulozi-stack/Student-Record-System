public class Main {
    public static void main(String[] args) {

        Student s1 = new Student("John", 20);
        Student s2 = new Student("Alice", 22);

        FileHandler.saveStudent(s1);
        FileHandler.saveStudent(s2);

        FileHandler.readStudents();
    }
}