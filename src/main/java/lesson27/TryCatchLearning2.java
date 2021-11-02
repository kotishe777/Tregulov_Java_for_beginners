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
        } catch (FileNotFoundException e) {
            System.out.println("The exception is caught:" + e);
        } catch (IOException e) {
            IOException i = e;
            System.out.println("The exception is caught:" + e);
        } finally {
            System.out.println("This is finally block");
        }
        System.out.println("These kode doesn't relate to exception");
    }

    void def() throws FileNotFoundException {
        File f = new File("C:\\Users\\kateryna.cherkashyna\\IdeaProjects\\Java_Learning\\src\\main\\java\\lesson27\\test10.txt");

        FileInputStream fis = new FileInputStream(f);
        System.out.println("These kode doesn't relate to exception");
    }

    void ghi() {
        System.out.println("Hi!");

        abc();

        try {
            def();
        } catch (FileNotFoundException e) {
            System.out.println("__________________________________________");
            System.out.println(e);
            System.out.println("__________________________________________");
            System.out.println(e.getMessage());
            System.out.println("__________________________________________");
            e.printStackTrace();
        }
    }

    void jkl() throws IOException{
        abc();
        def();
    }

    public static void main(String[] args) {
        TryCatchLearning2 t = new TryCatchLearning2();
        t.abc();
        t.ghi();
//        t.def();
    }
}
