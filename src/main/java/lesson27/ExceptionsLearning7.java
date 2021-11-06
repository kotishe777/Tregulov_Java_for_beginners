package lesson27;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionsLearning7 {
    static FileInputStream fis1, fis2;

    public static void main(String[] args) {
        try {
            fis1 = new FileInputStream("D:\\Projects\\LearningProjects\\Java_Learning\\src\\main\\java\\lesson27\\test10.txt");
            System.out.println("test10 file exists and found");
            try {
                fis2.close();
            }
            catch (IOException e){
                System.out.println("Problems with fis2 stream");
            }
        }
        catch (FileNotFoundException e) {
            System.out.println("File test10 is not found");
        }
        catch (NullPointerException e){
            System.out.println("NullPointerException is found");
        }
    }
}
