package Day08ifSatandmens;

import java.util.Scanner;

public class C01_ifElseİfsatatements {
    public static void main(String[] args) {

        // Soru 5) Kullanicidan gun ismini yazmasini isteyin.
        // Girilen isim gecerli bir gun ise gun isminin 1.,2. ve 3.harflerini
        // ilk harf buyuk diger ikisi kucuk olarak yazdirin,
        // gun ismi gecerli degilse “Gecerli gun ismi giriniz” yazdirin

Scanner scan=new Scanner(System.in);


        System.out.println( "lütfen bir gin ismi giriniz");
        String gun=scan.nextLine().toLowerCase();

        if (gun.equals("pazartesi")){
            System.out.println("paz");
        }else if (gun.equals("salı")){
            System.out.println("sal");
        }else if (gun.equals("çarşamba")){
            System.out.println("çar");
        }else if (gun.equals("persembe")){
            System.out.println("per");
        }else if (gun.equals("cuma")){
            System.out.println("cum");
        }else if (gun.equals("cumartesi")){
            System.out.println("cum");
        }else if (gun.equals("pazar")){
            System.out.println("paz");
        }else {
            System.out.println("lütfen gecerli bir gün adı yazınız");
        }



    }
}
