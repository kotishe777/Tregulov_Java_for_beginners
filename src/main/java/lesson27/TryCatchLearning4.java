package lesson27;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class TryCatchLearning4 {
    public static void main(String[] args) {
        StringBuilder result = new StringBuilder("");
        try {
            File f = new File("D:\\Projects\\LearningProjects\\Java_Learning\\src\\main\\java\\lesson27\\test10.txt");
            System.out.println("File object is created");
            FileInputStream fis = new FileInputStream(f);
            System.out.println("Stream is created");
            int counter = 0;
            while(true){
                counter++;
                result.append(fis.read());
                System.out.println("Information is reading");
                if (counter == 3){
                    fis.close();
                }
            }
        }
        catch(IOException e){
            System.out.println("Exception is caught");
        }
        finally {
            System.out.println("This is finally");
        }
    }
}
