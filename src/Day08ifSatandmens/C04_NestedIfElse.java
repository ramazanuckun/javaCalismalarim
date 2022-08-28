package Day08ifSatandmens;

import java.util.Scanner;

public class C04_NestedIfElse {
    public static void main(String[] args) {
/*Soru12)Kullanıcıdan 4 basamakli bir sayi girmesini isteyin.
Girdiği sayi 5’e   bölünüyorsa son rakamını kontrol edin.
Son rakamı 0 ise ekrana “5’e bölünen çift sayı” yazdırın.
Son rakamı 0 değil ise “5’e bölünen tek sayı” yazdırın.
Girdiği sayi 5’e bölünmüyorsa ekrana “Tekrar deneyin” yazdırın.*/



        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen dört basamaklı bir tam sayı giriniz");
        int sayi= scan.nextInt();

// sayınını 5 e bölünüp bölünmemesi
        //sayının son basamagının sıfır olup olmamasıi

        if (sayi<1000||sayi>9999){
            System.out.println("lütfen dört basamaklı bir sayı giriniz");
        }else if (sayi%5==0) {
            if (sayi%10==0){
            System.out.println("sayi 5 e bölünen çift sayi");
        }else {
                System.out.println("5 e bölünen tek sayi");
            }

        } else {
        System.out.println("tekrar deneyin");


        }



    }
}
