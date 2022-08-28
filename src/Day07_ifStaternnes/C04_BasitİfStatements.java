package Day07_ifStaternnes;

import java.util.Scanner;

public class C04_BasitİfStatements {
    public static void main(String[] args) {

        /*soru 3 kullanıcıdan gün ismini alın ve hafta içi veya hafata sonu old.yazdırsın
        örn:gün=oazar output="hafata sonu"

        string için eguals methodunu kullan
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen bir gün adı giriniz");
        String girilenGun=scan.next().toLowerCase();

        //pazar,Pazar,PAZAR,pAzAr??? bilemeyiz

        if(girilenGun.equals("pazar")||girilenGun.equals("cumartesi")){
            System.out.println("girilen gün hafta sonu");
        }

        if(girilenGun.equals("pazartesi")||girilenGun.equals("salı")||girilenGun.equals("carsamba")
                ||girilenGun.equals("persembe")||girilenGun.equals("cuma")){
            System.out.println("Girilen hafta ici");
        }


        if(!(girilenGun.equals("pazartesi")||girilenGun.equals("salı")||girilenGun.equals("carsamba")
                ||girilenGun.equals("persembe")||girilenGun.equals("cuma")||girilenGun.equals("cumartesi")
        ||girilenGun.equals("pazar"))){
            System.out.println("lütfen gecerli bir gün giriniz");
        }



    }
}
