package lesson27;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionsLearning3 {

    void abc() throws FileNotFoundException {
        try {
            File f = new File("D:\\Projects\\LearningProjects\\Java_Learning\\src\\main\\java\\lesson27\\test9.txt");
            FileInputStream fis = new FileInputStream(f);
        } catch (FileNotFoundException e) {
            System.out.println("Exception is caught and partially processed");
            throw e;
        } finally {
            System.out.println("This is finally block");
        }
    }

    void def() {
        try {
            int [] array = {1, 2, 3};
            System.out.println(array[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            throw e;
        } finally {
            System.out.println("This is finally block");
        }
    }

    void ghi(){
        try{
            abc();
        }
        catch (FileNotFoundException e){
            System.out.println("Exception is caught and completely processed");
        }
    }

    public static void main(String[] args) {
    }
}
