package Day39_exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class C01_IOexception {
    public static void main(String[] args) throws FileNotFoundException {


        /* java dan bilgisayarimizdaki bir dosyaya erismek istiyorsak FileInput
          FileInputStream fis=new FileInputStream(); classtan yardim aliriz
          ayni sekilde ekleme ve cikarma class tan src/C01_exception/Test.txt yardim aliriz
         */

        FileInputStream fis=new FileInputStream("src/C01_exception/Test.txt");
        /*
        Goruldugu gibi compile time da altini kirmizi cizen her durum compile time error degildir.
        Java da bazi exception larda Compile time Exception dur
        Ozellikle dosya okuma ve yazma ile ilgili exception lar

        Compile time exception olustugunda java 2 yol oneriri.
        1/try -cath ile cevrelemek
        2/method signature ina throws keyworld ile beklenen exception turunu yazmak.

        throws exceoption,sadece olayin farkinda oldugumuzun deklarasyonudur.
        exception handle edilmesinde hicbir rolu yoktur.
        Yani try catch ile handle -kontrol altina aldgimiz exception larda kod calismaya devam ediyordu.
        Ancak throws exception yazdigimizda java bir exception ile karsilastigimizda
        java hicbirsey yapmamisiz gibi hata mesaji yayinlayip calismayi durdurur.
         */
    }
}
