package day03_scanner;

import java.util.Scanner;

public class C07_Scanner {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);

        System.out.println("lütfen isminizi giriniz");

        String isim=scan.nextLine();
        System.out.println("lütfen soyisminizi girinizi");
        String soyisim=scan.nextLine();
        System.out.println("lütfen yaşınızı giriniz");
        double yas=scan.nextDouble();
        System.out.println("girilen bilgiler="+isim+"+soyisim+"+yas);

    }
}
