public class Student {
    String name;
    int age;
    int grade;

    Student(String name, int age, int grade){
        this.name = name;
        this.age = age;
        this.grade = grade;
    }
}

    double calculateAverageGrade(Student[] students){
        int total = 0;
        for (int i = 0; i < students.length; i++){
            total = total + students[i].grade;
        }
    return (double) total/ students.length;
    }

    int countPassing(Student[] students, int passingGrade){
        int count = 0;
        for (int i = 0; i < students.length; i++){
            if (students[i].grade >= passingGrade){
                count++;
            }
        }
        return count;
    }

    void printGradeDistribution(Student[] students) {
        int top = 0;
        int good = 0;
        int passing = 0;
        int failing = 0;

        for (int i = 0; i < students.length; i++) {
            if (students[i].grade == 12) {
                top = top + 1;
            } else if (students[i].grade == 10 || students[i].grade == 7) {
                good = good + 1;
            } else if (students[i].grade == 4 || students[i].grade == 2) {
                passing = passing + 1;
            } else {
                failing = failing + 1;
            }
        }

        System.out.println("Grade 12: " + top);
        System.out.println("Grade 10/7: " + good);
        System.out.println("Grade 4/2: " + passing);
        System.out.println("Grade 0/-3: " + failing);
    }

    void main (){
        Student [] students = new Student [5];
        students [0] = new Student("Anna", 25, 10);
        students [1] = new Student("Martin", 29, 7);
        students [2] = new Student("Alex", 35, 4);
        students [3] = new Student ("Louise", 25, 02);
        students [4] = new Student ("Besima",29, 10);

        System.out.println("Name: " + students[0].name);
        System.out.println("Name: " + students[1].name);
        System.out.println("Name: " + students[2].name);

        for (int i = 0; i < students.length; i++){
            System.out.println(students[i].name);
        }

        Student[] student = new Student[6];
        student[0] = new Student("Elma", 20, 10);
        student[1] = new Student("Belmin", 22, 7);
        student[2] = new Student("Emily", 21, 12);
        student[3] = new Student("Liam", 23, 4);
        students[4] = new Student("Emma", 19, 12);

        double average = calculateAverageGrade(students);
        System.out.println("Average grade: " + average);

        int passing = countPassing(students, 2);
        System.out.println("Passing students: " + passing);

        printGradeDistribution(students);
    }
