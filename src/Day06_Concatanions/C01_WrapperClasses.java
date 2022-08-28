package Day06_Concatanions;

import java.util.Scanner;

public class C01_WrapperClasses {
    public static void main(String[] args) {

        /*Wrabber calss javanın hazır metodları kullanabilmemiz için
        primivite turlerini herbiri içibn açtığı class lardır
         */
        // int---->Integer
        //char---->Character
        //diğerleri primitive ile aynı sadece baş harfi büyük
        String str="java ile hayat cok güzel";
        System.out.println(str.toUpperCase());//JAVA İLE HAYAT COK GÜZEL
boolean guzelmi=true;
// boolen prime olduğundan hazır method uyoktur

Boolean buGuzelMi=true;

buGuzelMi.toString();

        System.out.println(Short.MIN_VALUE);
        System.out.println(Short.MAX_VALUE);


        String ogrNo="123456";

        //kullanıcıdan bir şifre isteyen
        //eger sifre sadece rakamlardan oluşuyorsa kabul etmeyyelim

        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen 5 basamaklı bir şirfre giriniz");
        String sifre=scan.nextLine();
        Integer sifreSayı=Integer.parseInt(sifre);
        System.out.println("girilen sifrenin 3 fazlası:"+(sifre+3));
        System.out.println("Integer sifre:"+(sifreSayı+3));

        //Wrapper class'lar ilerde kullanabileceğimiz pekçok faydalı hazır metodu içerir


    }
}
