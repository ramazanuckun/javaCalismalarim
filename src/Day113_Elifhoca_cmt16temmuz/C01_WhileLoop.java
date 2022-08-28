package Day113_Elifhoca_cmt16temmuz;

import java.util.Scanner;

public class C01_WhileLoop {
    public static void main(String[] args) {

        //girilen sayinin basamaklarini toplamini bulalim
        Scanner scan=new Scanner(System.in);

        int sayi=scan.nextInt();

        basamakToplami(sayi);
        System.out.println(basamakToplami(sayi));//return oldugu icin yazdirma kisminda yazdirmak icin kullaniyoruz
    }

   public static int basamakToplami(int sayi) {

        int toplam=0;

        while (sayi!=0){

            toplam+=sayi%10;

            sayi/=10;

        }






        return toplam;


    }
}
