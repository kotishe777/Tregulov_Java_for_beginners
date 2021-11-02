package lesson27;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class TryCatchLearning3 {
    public static void main(String[] args) {
        try {
            File f = new File("C:\\Users\\kateryna.cherkashyna\\IdeaProjects\\Java_Learning\\src\\main\\java\\lesson27\\test10.txt");
            FileInputStream fis = new FileInputStream(f);
        }
        catch (FileNotFoundException e){
            System.out.println("Exception 1 is caught");
        }
        catch (NullPointerException e){
            System.out.println("Exception 2 is caught");
        }
        catch (IOException e){
            System.out.println("Exception 3 is caught");
        }
        catch (RuntimeException e){
            System.out.println("Exception 4 is caught");
        }
        catch (Exception e){
            System.out.println("Exception 5 is caught");
        }
        catch (Throwable e){
            System.out.println("Exception 6 is caught");
        }
    }
}
