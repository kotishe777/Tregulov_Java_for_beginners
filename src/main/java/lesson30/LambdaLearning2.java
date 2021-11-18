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
        for (Student2 s : list){
            if (sc.test(s)){
                printStudent(s);
            }
        }
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

        FindStudentsOverGrade fsog = new FindStudentsOverGrade();
        FindStudentsUnderGrade fsug = new FindStudentsUnderGrade();
        FindStudentsOverAge fsoa = new FindStudentsOverAge();
        FindStudentsUnderAge fsua = new FindStudentsUnderAge();
        FindStudentsBySex fsbs = new FindStudentsBySex();
        FindStudentsMixConditions fsmc = new FindStudentsMixConditions();

        si.testStudents(list, fsog);
        System.out.println("_________________________________________________________________________________________");
        si.testStudents(list, fsug);
        System.out.println("_________________________________________________________________________________________");
        si.testStudents(list, fsoa);
        System.out.println("_________________________________________________________________________________________");
        si.testStudents(list, fsua);
        System.out.println("_________________________________________________________________________________________");
        si.testStudents(list, fsbs);
        System.out.println("_________________________________________________________________________________________");
        si.testStudents(list, fsmc);
    }
}

interface StudentChecks{

    boolean test(Student2 s);
}

class FindStudentsOverGrade implements StudentChecks{

    public boolean test(Student2 s){
        return s.avgGrade > 8.5;
    }
}

class FindStudentsUnderGrade implements StudentChecks{

    public boolean test(Student2 s){
        return s.avgGrade < 9;
    }
}

class FindStudentsOverAge implements StudentChecks{

    public boolean test(Student2 s){
        return s.age > 25;
    }
}

class FindStudentsUnderAge implements StudentChecks{

    public boolean test(Student2 s){
        return s.age < 27;
    }
}

class FindStudentsBySex implements StudentChecks{

    public boolean test(Student2 s){
        return s.sex == 'm';
    }
}

class FindStudentsMixConditions implements StudentChecks{

    public boolean test(Student2 s){
        return s.avgGrade > 7.2 && s.age < 23 && s.sex == 'f';
    }
}

