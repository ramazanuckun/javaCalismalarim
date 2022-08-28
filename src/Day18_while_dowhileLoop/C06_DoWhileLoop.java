package Day18_while_dowhileLoop;

import java.util.Scanner;

public class C06_DoWhileLoop {
    public static void main(String[] args) {


     /*   Soru 4) Kullanicidan toplamak uzere pozitif sayilar isteyin, islemi bitirmek icin 0’a basmasini soyleyin.
                Kullanici yanlislikla negative sayi girerse o sayiyi dikkate almayin ve “Negatif sayi giremezsiniz” yazdirip basa donun
        Kullanici 0’a bastiginda toplam kac pozitif sayi girdigini, yanlislikla kac negative sayi girdigini
        ve girdigi pozitif sayilarin toplaminin kac oldugunu yazdirin.
      */


        Scanner scan=new Scanner(System.in);
        System.out.println(" sayi girin");
        int sayi=0;
        int pozitifSayiAdeti=0;
        int negatifSayiAdeti=0;
        int pozitifSayilarToplami=0;

        do {

            System.out.println("lutfen toplamak uzere pozitif tamsayigriniz");
            sayi=scan.nextInt();
            if (sayi>0){
                pozitifSayilarToplami+=sayi;
                pozitifSayiAdeti++;
            } else if (sayi<0) {
                System.out.println("Negatif sayi giremezsiniz");
                negatifSayiAdeti++;

            }


        }while (sayi!=0);

        System.out.println(pozitifSayiAdeti+ "adet pozitif sayi girdiniz,toplamlari"+ pozitifSayilarToplami);
        System.out.println(negatifSayiAdeti+"adet nrgatif ayi girdiniz fakat toplama dahil edilmedi");








    }}


