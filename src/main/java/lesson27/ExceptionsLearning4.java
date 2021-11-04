package lesson27;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionsLearning4 {
    FileInputStream fis1, fis2;

    public void abc(){
        try {
            fis1 = new FileInputStream("test9.txt");
        }
    }
}
