package lesson25;

public class PolymorphismLearning2 {
    public static void main(String[] args) {
        JumpAble j = new Man();
        Man m = new Man();
        Student s = new Student();

        if (j instanceof JumpAble){
            System.out.println("j is JumpAble");
        }

        if (m instanceof Human){
            System.out.println("m is Human");
        }

//        if (s instanceof Human){
//            System.out.println("s is Human");
//        }

        if (s instanceof JumpAble){
            System.out.println("s is JumpAble");
        }
    }
}

interface JumpAble{}

class Human implements JumpAble{}

class Man extends Human{}

class Student{}
