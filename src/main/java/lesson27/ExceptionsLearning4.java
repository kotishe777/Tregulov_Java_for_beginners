package lesson27;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionsLearning4 {
    FileInputStream fis1, fis2;

    public void abc() {
        try {
            fis1 = new FileInputStream("D:\\Projects\\LearningProjects\\Java_Learning\\src\\main\\java\\lesson27\\test10.txt");
            try {
                fis1 = new FileInputStream("test9.txt");
            } catch (FileNotFoundException e) {
                System.out.println("File test9 is not found");
            }
        } catch (FileNotFoundException e) {
            System.out.println("File test10 is not found");
        } finally {
            System.out.println("There is outer finally block");
            try {
                fis1.close();
                fis2.close();
            } catch (IOException e) {
                System.out.println("The exception is found in finally block");
            }
        }
    }

    public static void main(String[] args) {
        ExceptionsLearning4 t = new ExceptionsLearning4();
        t.abc();
    }
}
