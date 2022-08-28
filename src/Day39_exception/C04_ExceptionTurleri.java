package Day39_exception;

import java.util.Locale;

public class C04_ExceptionTurleri {
    public static void main(String[] args) throws InterruptedException {


        String str;//normal lokal variabler olusturulabilir fakat deger atmadan kullanilamaz
      //  System.out.println(str);kirmizi cizgili str alti istersen dene compile time error hata veri

        str=null;
      //  System.out.println(str.toLowerCase(Locale.ROOT));//null degeri var yani degersi sen onu buytecegim cdersen run time error hatasi veriyor
//NullPointerException
        int []arr={1,2,3};//arayde olamayan degeri giresesek verecegi hata

        Object obj="Java java java";
        Integer sayi=(Integer) obj;//ClassCastException

        /*
        String str2="Hava civa";
        Integer sayi2=str2;
        Java bazi durumlarda  izin vermez buna basta hata verdi yukarida ilerde verdi
         */
        Thread.sleep(5000);//kodu bekletir//kod buraya geldimi 5sn bekler ve devam eder
    }
}
