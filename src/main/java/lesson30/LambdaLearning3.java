package lesson30;

import java.util.ArrayList;

public class LambdaLearning3 {
}

class Student3{
    String name;
    char sex;
    int age;
    int course;
    double avgGrade;

    public Student3(String name, char sex, int age, int course, double avgGrade) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.course = course;
        this.avgGrade = avgGrade;
    }
}

class StudentInfo3 {

    void printStudent(Student3 student){
        System.out.println("Student name: " + student.name + ", sex: " + student.sex + ", age: " + student.age
                + ", course: " + student.course + ", average grade: " + student.avgGrade + ".");
    }

    void testStudents(ArrayList<Student3> list, StudentChecks3 sc){
        for (Student3 s : list){
            if (sc.test(s)){
                printStudent(s);
            }
        }
    }

    public static void main(String[] args) {
        ArrayList <Student3> list = new ArrayList<>();
        Student3 s1 = new Student3("John", 'm', 22, 3, 8.3);
        Student3 s2 = new Student3("Mike", 'm', 28, 2, 6.4);
        Student3 s3 = new Student3("Olena", 's', 19, 1, 8.9);
        Student3 s4 = new Student3("Petr", 'm', 35, 4, 7);
        Student3 s5 = new Student3("Maria", 's', 23, 3, 9.1);
        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s4);
        list.add(s5);

        StudentInfo3 si = new StudentInfo3();
        si.testStudents(list, (Student3 st) -> { return st.avgGrade > 8.5;});
        System.out.println("_________________________________________________________________________________________");
        si.testStudents(list, st -> st.avgGrade < 9);
        System.out.println("_________________________________________________________________________________________");
        si.testStudents(list, (Student3 st) -> st.age > 25);
        System.out.println("_________________________________________________________________________________________");
        si.testStudents(list, (Student3 st) -> { return st.age < 27;});
        System.out.println("_________________________________________________________________________________________");
        si.testStudents(list, (Student3 st) -> { return st.sex == 'm';});
        System.out.println("_________________________________________________________________________________________");
        si.testStudents(list, (Student3 st) -> { return st.avgGrade > 7.2 && st.age < 23 && st.sex == 'f';});
    }
}

interface StudentChecks3{

    boolean test(Student3 s);
}
