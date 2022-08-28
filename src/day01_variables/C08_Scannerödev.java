package day01_variables;

import java.util.Scanner;

public class C08_Scannerödev {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen sayı1 i girin");

        double sayı1=scan.nextDouble();
        System.out.println("lütfen 2.sayıyı giriniz");
        double sayı2=scan.nextDouble();

        System.out.println("girilen sayıların /" +
                "ortalamasını alınız:"+(sayı1+sayı2)/2);


        String isim;
        boolean ögrenciMi;
        int not;
        double ortalama;
        isim="Nesibe Kübra";
        ögrenciMi=true;
        not=99;
        ortalama=not/2;
        System.out.println("ögrenci bilgileri:"+isim + ögrenciMi +not + ortalama);




    }
}
