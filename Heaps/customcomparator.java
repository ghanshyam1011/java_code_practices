package Heaps;
class Student{
    String name;
    int rno;
    double cgpa;
    Student(String name, int rno, double cgpa) {
        this.name = name;
        this.rno = rno;
        this.cgpa = cgpa;
    }
}
public class customcomparator {
    public static void main(String[] args) {
        Student s1 = new Student("Alice", 101, 3.8);
        Student s2 = new Student("Bob", 102, 3.6);
        Student s3 = new Student("Charlie", 103, 3.9);
        // Custom comparator to sort students by CGPA in descending order
        java.util.Comparator<Student> cgpaComparator = (a, b) -> Double.compare(b.cgpa, a.cgpa);
        java.util.List<Student> students = java.util.Arrays.asList(s1, s2, s3);
        students.sort(cgpaComparator);
        for (Student s : students) {
            System.out.println(s.name + " - " + s.cgpa);
        }
    }
}
