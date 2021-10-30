package lesson27;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class TryCatchLearning2 {

    void abc() {
        File f = new File("C:\\Users\\kateryna.cherkashyna\\IdeaProjects\\Java_Learning\\src\\main\\java\\lesson27\\test10.txt");

        try {
            FileInputStream fis = new FileInputStream(f);
            fis.read();
            System.out.println("Bye");
        }
        catch (FileNotFoundException e){
            System.out.println("The exception is caught:" + e);
        }
        catch (IOException e){
            System.out.println("The exception is caught:" + e);
        }
        finally {
            System.out.println("This is finally block");
        }

        System.out.println("These kode doesn't relate to exception");
    }

    public static void main(String[] args) {
    }
}
