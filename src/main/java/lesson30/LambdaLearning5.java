package lesson30;

import java.util.ArrayList;
import java.util.function.Predicate;

public class LambdaLearning5 {
}

class Student4{
    String name;
    char sex;
    int age;
    int course;
    double avgGrade;

    public Student4(String name, char sex, int age, int course, double avgGrade) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.course = course;
        this.avgGrade = avgGrade;
    }
}

class StudentInfo4 {

    void printStudent(Student4 student){
        System.out.println("Student name: " + student.name + ", sex: " + student.sex + ", age: " + student.age
                + ", course: " + student.course + ", average grade: " + student.avgGrade + ".");
    }

    void testStudents(ArrayList<Student4> list, Predicate<Student4> t){
        for (Student4 s : list){
            if (t.test(s)){
                printStudent(s);
            }
        }
    }

    public static void main(String[] args) {
        ArrayList <Student4> list = new ArrayList<>();
        Student4 s1 = new Student4("John", 'm', 22, 3, 8.3);
        Student4 s2 = new Student4("Mike", 'm', 28, 2, 6.4);
        Student4 s3 = new Student4("Olena", 's', 19, 1, 8.9);
        Student4 s4 = new Student4("Petr", 'm', 35, 4, 7);
        Student4 s5 = new Student4("Maria", 's', 23, 3, 9.1);
        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s4);
        list.add(s5);

        StudentInfo4 si = new StudentInfo4();
        si.testStudents(list, (Student4 st) -> { return st.avgGrade > 8.5;});
        System.out.println("_________________________________________________________________________________________");
        si.testStudents(list, st -> st.avgGrade < 9);
        System.out.println("_________________________________________________________________________________________");
        si.testStudents(list, (Student4 st) -> st.age > 25);
        System.out.println("_________________________________________________________________________________________");
        si.testStudents(list, (Student4 st) -> { return st.age < 27;});
        System.out.println("_________________________________________________________________________________________");
        si.testStudents(list, (Student4 st) -> { return st.sex == 'm';});
        System.out.println("_________________________________________________________________________________________");
        si.testStudents(list, (Student4 st) -> { return st.avgGrade > 7.2 && st.age < 23 && st.sex == 'f';});
        System.out.println("_________________________________________________________________________________________");
        for (Student4 s : list){
            System.out.println(s.name);
        }
        System.out.println("_________________________________________________________________________________________");
        list.removeIf(x -> x.name.endsWith("a"));
        for (Student4 s : list){
            System.out.println(s.name);
        }
    }
}