package lesson30;

import java.util.ArrayList;

public class LambdaLearning1 {
}

class Student{
    String name;
    char sex;
    int age;
    int course;
    double avgGrade;

    public Student(String name, char sex, int age, int course, double avgGrade) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.course = course;
        this.avgGrade = avgGrade;
    }
}

class StudentInfo {

    void printStudent(Student student){
        System.out.println("Student name: " + student.name + ", sex: " + student.sex + ", age: " + student.age
                + ", course: " + student.course + ", average grade: " + student.avgGrade + ".");
    }

    void printStudentsOverGrade(ArrayList<Student> list, double avgGrade){
        for (Student s : list){
            if (s.avgGrade > avgGrade){
                printStudent(s);
            }
        }
    }

    void printStudentsUnderGrade(ArrayList<Student> list, double avgGrade){
        for (Student s : list){
            if (s.avgGrade < avgGrade){
                printStudent(s);
            }
        }
    }

    void printStudentsOverAge(ArrayList<Student> list, int age){
        for (Student s : list){
            if (s.age > age){
                printStudent(s);
            }
        }
    }

    void printStudentsUnderAge(ArrayList<Student> list, int age){
        for (Student s : list){
            if (s.age < age){
                printStudent(s);
            }
        }
    }

    void printStudentsBySex(ArrayList<Student> list, char sex){
        for (Student s : list){
            if (s.sex == sex){
                printStudent(s);
            }
        }
    }

    void printStudentsMixConditions(ArrayList<Student> list, double avgGrade, int age, char sex){
        for (Student s : list){
            if (s.avgGrade > avgGrade && s.age < age && s.sex == sex){
                printStudent(s);
            }
        }
    }

    public static void main(String[] args) {
        ArrayList <Student> list = new ArrayList<>();
        Student s1 = new Student("John", 'm', 22, 3, 8.3);
        Student s2 = new Student("Mike", 'm', 28, 2, 6.4);
        Student s3 = new Student("Olena", 's', 19, 1, 8.9);
        Student s4 = new Student("Petr", 'm', 35, 4, 7);
        Student s5 = new Student("Maria", 's', 23, 3, 9.1);
        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s4);
        list.add(s5);

        StudentInfo si = new StudentInfo();
        si.printStudentsOverGrade(list, 8.5);
        System.out.println("_________________________________________________________________________________________");
        si.printStudentsUnderGrade(list, 9);
        System.out.println("_________________________________________________________________________________________");
        si.printStudentsOverAge(list, 25);
        System.out.println("_________________________________________________________________________________________");
        si.printStudentsUnderAge(list, 27);
        System.out.println("_________________________________________________________________________________________");
        si.printStudentsBySex(list, 'm');
        System.out.println("_________________________________________________________________________________________");
        si.printStudentsMixConditions(list, 7.2, 23, 'f');
    }
}

