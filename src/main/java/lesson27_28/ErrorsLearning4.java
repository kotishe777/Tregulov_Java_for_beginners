package lesson27_28;

import java.io.FileNotFoundException;
import java.io.IOException;

public class ErrorsLearning4 {
    public static void main(String[] args) throws Exception {
        Animal12 a = new Mouse();
        try {
            a.run();
        } catch (IOException e){
            System.out.println("Exception is caught");
        }
    }
}

class Animal12{

    Animal12() throws FileNotFoundException {
    }

    void run() throws IOException, ArrayIndexOutOfBoundsException {
        System.out.println("Animal runs");
    }

    void run(int a) throws Exception {
        System.out.println("Animal runs");
    }
}

class Mouse extends Animal12 {

    Mouse() throws Exception, IOException, ArrayIndexOutOfBoundsException {
        super();
    }

    void run() throws ArrayIndexOutOfBoundsException, NullPointerException { // throws Exception can't be used
        System.out.println("Mouse runs");
    }
}

class Human{
    String name;
    int age;

    Human (String name, int age) throws Exception {
        if (age < 0){
            throw new Exception("Invalid age");
        }
        this.name = name;
        this.age = age;
    }
}
