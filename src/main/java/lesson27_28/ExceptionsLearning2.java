package lesson27_28;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionsLearning2 {

    static int abc() {
        try {
            File f = new File("D:\\Projects\\LearningProjects\\Java_Learning\\src\\main\\java\\lesson27\\test9.txt");
            FileInputStream fis = new FileInputStream(f);
            return 5;

        } catch (FileNotFoundException e) {
            System.out.println("Exception is caught");
            return 6;

        } finally {
            System.out.println("This is finally block");
            return 7;
        }
    }

    static StringBuilder def() {
        StringBuilder a = new StringBuilder("hi");
        try {
            File f = new File("D:\\Projects\\LearningProjects\\Java_Learning\\src\\main\\java\\lesson27\\test9.txt");
            FileInputStream fis = new FileInputStream(f);

        } catch (FileNotFoundException e) {
            System.out.println("Exception is caught");
            System.out.println("a variable in catch block = " + a);
            return a;

        } finally {
            a.append("!!!");
            System.out.println("This is finally block");
            System.out.println("a variable in finally block = " + a);
        }
        return a;
    }

    public static void main(String[] args) {
        System.out.println(abc());
        System.out.println("_____________________________________________________");
        System.out.println(def());
    }
}
