package lesson12.homework12;

import lesson11.Student;

public class Homework12 {

    public static void methodFirst(Student studentFirst, Student studentSecond) {
        if (studentFirst.name.equals(studentSecond.name) && studentFirst.course == studentSecond.course &&
                studentFirst.grade == studentSecond.grade) {
            System.out.println("Student first is equal to student second");
        } else {
            System.out.println("Student first is not equal to student second");
        }
    }

    public static void methodSecond(Student studentFirst, Student studentSecond) {
        if (studentFirst.name.equals(studentSecond.name)) {
            if (studentFirst.course == studentSecond.course) {
                if (studentFirst.grade == studentSecond.grade) {
                    System.out.println("Students are equal");
                } else {
                    System.out.println("Students have equal names, courses but different grades");
                }
            } else {
                System.out.println("Students have equal names but different courses");
            }
        } else {
            System.out.println("Students have different names");
        }
    }

    public static void main(String[] args) {
        Student studentFirst = new Student("John", 4, 10.00);
        Student studentSecond = new Student("John", 4, 12.00);
        methodFirst(studentFirst, studentSecond);
        methodSecond(studentFirst, studentSecond);
    }

}
