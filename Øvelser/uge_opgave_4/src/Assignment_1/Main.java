package Assignment_1;
import java.util.ArrayList;
public class Main {
    public static void main(String [] args) {
        //3 students with different names and age
        Student s1 = new Student("Louise", 25);
        Student s2 = new Student("Olga", 32);
        Student s3 = new Student("Lukas", 23);

        //ArrayList
        ArrayList<Student> students = new ArrayList<Student>();
        students.add(s1);
        students.add(s2);
        students.add(s3);

        //Print alle students with a loop
        System.out.println("~~~~~~~~~~~STUDENTS~~~~~~~~~~~");
        for (Student student : students) {
            student.printInfo();
        }
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        //Find the oldest
        Student oldest = findOldest(students);
        System.out.println("\n~~~~~~~~OLDEST STUDENT~~~~~~~~");
        oldest.printInfo();
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }

    //Methode: find the oldest
    static Student findOldest(ArrayList<Student> students) {
        Student oldest = students.get(0);
        for (Student s : students) {
            if (s.age > oldest.age) {
                oldest = s;
            }
        }
        return oldest;
    }
}
