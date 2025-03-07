import java.util.Comparator;

public class StudentComparator implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        if (s1.getGrade() != s2.getGrade()) {
            return Integer.compare(s2.getGrade(), s1.getGrade()); // Descending order of grades
        } else {
            return Integer.compare(s1.getAge(), s2.getAge()); // Ascending order of age
        }
    }
}