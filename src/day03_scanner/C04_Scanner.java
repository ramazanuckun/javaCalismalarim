package day03_scanner;

import java.util.Scanner;

public class C04_Scanner {
    public static void main(String[] args) {

        //kullanıcıdan ismini isteyin
        //girilen ismi
        //ismini ismail şeklide yazdırın

        //insanların dünyasından kod'larımızın dünyasına class a deger almak için
        // scanner class'ını kullanırız
        //1-scanner objesi oluşturalım
        Scanner scan=new Scanner(System.in);

        //2-Kullanıcıya ne istediğimizi söyleyelim
        System.out.println("Lütfen isminizi giriniz");

        //3-Oluşturdugunuz scan objesi ile kullanıcının girdiği değeri alıp
        //oluşturacağınız uygun bir variable a atayalim

        String kullanıcıİsmi=scan.next();

        System.out.println("isminiz:"+kullanıcıİsmi);


    }
}
