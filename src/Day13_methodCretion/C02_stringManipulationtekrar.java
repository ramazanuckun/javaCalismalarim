package Day13_methodCretion;

import java.util.Scanner;

public class C02_stringManipulationtekrar {
    public static void main(String[] args) {

                /*
        Soru 6) Kullanicidan bir sifre girmesini isteyin.
        Asagidaki sartlari sagliyorsa “Sifre basari ile tanimlandi”,
        sartlari saglamazsa “Islem basarisiz,Lutfen yeni bir sifre girin” yazdirin
        - Ilk harf buyuk harf olmali
        - Son harf kucuk harf olmali
        - Sifre bosluk icermemeli
        - Sifre uzunlugu en az 8 karakter olmali
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen sifrenizi giriniz");
        String sıfree=scan.nextLine();
        int kontrol=0;
        if (sıfree.charAt(0)>='A'&&sıfree.charAt(0)<='Z'){kontrol++;}else {
            System.out.println("ilk harf büyük olmalı");
        }if (sıfree.charAt(sıfree.length()-1)>='a'&&sıfree.charAt(sıfree.length()-1)<='z'){kontrol++;}else {
            System.out.println("son harf kucuk olmalı");
        }if (sıfree.contains(" ")){
            System.out.println("sifre bosluk içermemeli");
        }else {kontrol++;}
        if (sıfree.length()>=0){kontrol++;}else {
            System.out.println("lütfen 8 karakterli bir sifre giriniz");
        }if (kontrol==4){
            System.out.println("sifre basarı ile tamamlandı");
        }else {
            System.out.println("islem basarısız lütfen gecerli bir sifre giriniz");
        }







    }
}
