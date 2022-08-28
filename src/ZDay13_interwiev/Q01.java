package ZDay13_interwiev;

import java.util.Scanner;

public class Q01 {
    public static void main(String[] args) {



        /*  soru1: Check if the integer is an Armstrong numbers to 4 digit
numbers(4 digit-> exclusive)
    Armstrong sayi:herhangi bir 3 basamakli sayinin rakamlarinin kupleri
     toplami o sayiyi veriyorsa sayi  Armstrong sayidir
        (0, 1, 153, 370, 371, 407)
        153 = 1*1*1 + 5*5*5 + 3*3*3 = 153
        370 = 3*3*3 + 7*7*7 + 0*0*0 = 370

      soru2: Birden baslayarak girilen sayıya kadar her bir tamsayının
      amstrong sayı olup olmadıgını
      gösteren program yazınız */


        Scanner scanner=new Scanner(System.in);
        System.out.println("sayi giriniz");
        int sayi= scanner.nextInt();
        armstrong(sayi);
        girilenSayiyaKadarOlanArmstrongSayilar(sayi);

    }

    private static void girilenSayiyaKadarOlanArmstrongSayilar(int sayi) {

        for (int i = 1; i <=sayi ; i++) {

            armstrong(i);
        }

    }

    private static void armstrong(int sayi) {

        int sayininKuplerToplami=0;
        int basamakSayisi=0;
        int girilenSayi=sayi;//sonucu sayinin kupler toplami ile kiyaslamak icin bunu yaptik
        while (sayi>0){


            basamakSayisi=sayi%10;//her 10 a boldugunde sayi atanacak ve rakamalara alicagim

            sayininKuplerToplami+=(basamakSayisi*basamakSayisi*basamakSayisi);

            sayi=sayi/10;



        }
        if (girilenSayi==sayininKuplerToplami){

            System.out.println("Girdiginiz sayi armstrong bir sayidir");
        }else System.out.println("Girilen sayi armstrong bir sayi degildir");
        System.out.println();


    }

    /*

     */
}
