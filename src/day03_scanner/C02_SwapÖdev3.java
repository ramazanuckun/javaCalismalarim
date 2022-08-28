package day03_scanner;

import java.util.Scanner;

public class C02_SwapÖdev3 {
    public static void main(String[] args) {

        int sayı2=50;

        int sayı1 = 30 * 50;
        sayı2=50-30;
//en iyi kod çalışsan kod
        System.out.println("swaptan sonrasayı1:"+sayı1);
        System.out.println("swaptan sonrasayı2:"+sayı2);
//uzun kenar yükseklik isteyerk dikdortgenler  prizması hacmı
        System.out.println("lütfen isiminizi girin");

//  2 sayinin toplami toplam,fark çarp

        String input="sayıların toplamı";
        input="15+15";
        System.out.println("sayiları toplamı:"+ (+15+15));

        String carpım="sayıların carpımı";
        carpım="14568*14587";
        System.out.println("sayiları carrpımı:"+ (14568*14587));


        String bolumu="sayıların carpımı";
        bolumu="10000/100";
        System.out.println("sayiları bolumu:"+ +10000/100);

String kareAlan="kenar";
kareAlan="kenar*kenar";
        System.out.println("Kare nin alanı:"+40*40);

        String kareCevre="kenar";
        kareCevre="kenar*4";
        System.out.println("Kare nin cevresi:"+81.2*4);


//uzun kenar kısa kenaryukseklik giriniz fikdörtgenler prızmasının hacmini hesaplayın

        String prizmaHacim="uzunKenar,kısaKenar,yukseklik";
        prizmaHacim="uzunkenar*kısaKenar*yukseklik";
        System.out.println("prizmaHacim:"+10.5*5.7*2.1);

        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen isiiminizi ve soyisminizi giriniz");
String isim=scan.nextLine();
String soyisim=scan.nextLine();
        System.out.println("isim"+"  "+isim+"  "+soyisim);



    }
}
