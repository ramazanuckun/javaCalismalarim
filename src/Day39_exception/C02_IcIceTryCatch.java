package Day39_exception;

import javax.imageio.IIOException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class C02_IcIceTryCatch {
    public static void main(String[] args) {

int k = 0;
        try {
            FileInputStream fis=new FileInputStream("src/Day39_exception/Test.txt");
            
            
            while (true){
                try {
                    if (!((k=fis.read())!=-1)) break;
                } catch (IOException e) {
                    System.out.println("dosya okunamadi");
                }

                System.out.print((char)k );
            }

        } catch (FileNotFoundException e) {
            System.out.println("dosya bulunamadi veya dosya bozuk");
        }
    }
}
