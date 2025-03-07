import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Alice", 90, 20));
        students.add(new Student("Bob", 90, 22));
        students.add(new Student("Charlie", 85, 21));
        students.add(new Student("David", 90, 19));

        Collections.sort(students, new StudentComparator());

        for (Student student : students) {
            System.out.println(student);
        }
    }
}