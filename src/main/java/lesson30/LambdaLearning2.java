package lesson30;

import java.util.ArrayList;

public class LambdaLearning2 {
}

class Student2 {
    String name;
    char sex;
    int age;
    int course;
    double avgGrade;

    public Student2(String name, char sex, int age, int course, double avgGrade) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.course = course;
        this.avgGrade = avgGrade;
    }
}

class StudentInfo2 {

    void printStudent(Student2 student){
        System.out.println("Student name: " + student.name + ", sex: " + student.sex + ", age: " + student.age
                + ", course: " + student.course + ", average grade: " + student.avgGrade + ".");
    }

    void testStudents(ArrayList<Student2> list, StudentChecks sc){

    }

    public static void main(String[] args) {
        ArrayList <Student2> list = new ArrayList<>();
        Student2 s1 = new Student2("John", 'm', 22, 3, 8.3);
        Student2 s2 = new Student2("Mike", 'm', 28, 2, 6.4);
        Student2 s3 = new Student2("Olena", 's', 19, 1, 8.9);
        Student2 s4 = new Student2("Petr", 'm', 35, 4, 7);
        Student2 s5 = new Student2("Maria", 's', 23, 3, 9.1);
        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s4);
        list.add(s5);

        StudentInfo2 si = new StudentInfo2();

    }
}

interface StudentChecks{
    boolean testStudent (Student s);
}

class FindStudentsOverGrade implements StudentChecks{
    public boolean testStudent (Student s){
        return s.avgGrade > 8.5;
    }
}

