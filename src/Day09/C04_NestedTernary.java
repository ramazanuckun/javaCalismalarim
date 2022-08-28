package Day09;

import java.util.Scanner;

public class C04_NestedTernary {
    public static void main(String[] args) {

      // /klncıdan bir harf istyin
        // küçük harf ise consola küçük harf
        //      büyük harf ise büyük harf
        //  yoksa girdiğiniz karakter degil


        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen bir harf giriniz");
        char harf=scan.next().charAt(0);
        /*
        String sonuc= (harf>='a' && harf <='z') ? ("Kucuk Harf") :
                ("Buyuk harf veya gecersiz karakter");
         */
        String sonuc= (harf>='a' && harf <='z') ? ("Kucuk Harf") :
                ((harf>='A' && harf<='Z' ) ? "Buyuk harf" : "Gecersiz karakter");
        String sonuc2= harf>='a' && harf <='z' ? "Kucuk Harf" :
                harf>='A' && harf<='Z'  ? "Buyuk harf" : "Gecersiz karakter";
        System.out.println(sonuc);
        System.out.println(sonuc2);






    }
}
