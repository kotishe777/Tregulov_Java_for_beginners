package lesson22;

public class Human2 {
    String name;
    String surname;

    Human2(){}

    Human2(String n, String s){
        name = n;
        surname = s;
    }

    Human2(String n){
        this(n, null);
    }
}

class Student2 extends Human2{
    int course;

//    Student2(){ //equal default constructor
//        super();
//    }

    Student2(){
        this(5);
        System.out.println("Hi");
    }

    Student2(int i){
        super("Rick");

    }

    Student2(String name, String surname, int course){
        super.name = name;
        super.surname = surname;
        this.course = course;
    }

    public static void main(String[] args) {
        Student2 s1 = new Student2();
        Student2 s2 = new Student2("Nikki", "Heat", 3);
        System.out.println(s2.surname);
    }

}
