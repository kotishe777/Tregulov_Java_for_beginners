package lesson22.p1;

import lesson22.p2.Human;

class Student extends Human {
    public static void main(String[] args) {
        Student s = new Student();
        System.out.println(s.getName());
        System.out.println(Student.salary);
//        s.work();
        Student.rest();
    }
}