package day03_scanner;

public class C02_Swap {
    public static void main(String[] args) {
        //verilen sayı1 ve sayı2 variable larının degerlerinin degiştiren swap-program yazınız,
        //örn:sayı11
        //sayı2:20
        //kod calısınca sayı1:20
       // sayı2:10

        int sayı1=10;
        int sayı2=20;
        int sayı3=0;

        // sayı3 geçici kovamız
        //adım-sayı2 yı boş kovaya koyalım

        sayı3=sayı2;    //10    20   20

        //adım 2 1.sayıyı 2.sayıyıa ata

        sayı2=sayı1;   //20   10   20

        // adım 3 boş kovadaki sayıyı sayı1 e ata

        sayı1=sayı3;     // 20   10   20

        System.out.println("swap'tan sonra:"+sayı1);
        System.out.println("swap'tan sonra:"+sayı2);

    }


    }
