package day03_scanner;

import java.util.Scanner;

public class C06_Scanner {
    public static void main(String[] args) {

        /*kullanıcıdan ismini soyismini ve yaşını alıp
        girilen bilgiler=ramazan uçkun 41 şeklinde yazdırın
         */
        Scanner scan=new Scanner(System.in);

        System.out.println("Lütfen isminizi giriniz");
        /* String verileri scanner ile alırken next():ilk boşluğa  kadar olan kısmı (1 kelime)alır
        nextLine():saıtırın sonuna kadar ne kadar yazarsak alır
        Not:eger ardarda birden fazla string deger alacaksak nexLine()kullanmalıyız
         */
        String isim=scan.nextLine();
        System.out.println("lütfen soyisminizi giriniz");

        String soyisim=scan.nextLine();


        //Girilen bilgiler=Ramazan Uçkun  41 Şeklinde yazdırılır

        System.out.println("lütfen yaşınızı girinizi");

        double yas=scan.nextDouble();

        System.out.println("girilen bilgiler="+isim+","+soyisim+","+yas);
        
    }

}