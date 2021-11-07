package lesson27_28;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileLearning {
    public static void main(String[] args) throws Exception{
        File f = new File("C:\\Users\\kateryna.cherkashyna\\IdeaProjects\\Java_Learning\\src\\main\\java\\lesson27\\test10.txt");

        FileInputStream fis = new FileInputStream(f);
        fis.read();
        FileOutputStream fos = new FileOutputStream(f);
        fos.write(100);
    }
}
