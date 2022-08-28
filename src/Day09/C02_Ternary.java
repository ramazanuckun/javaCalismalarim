package Day09;

import java.util.Scanner;

public class C02_Ternary {
    public static void main(String[] args) {

  // Soru4 ) Kullanicidan bir sayi alin. Sayi pozitifse “Sayi pozitif” yazdirin,
// negatifse sayinin karesini yazdirin
        Scanner scan=new Scanner(System.in);
        System.out.println("ltfn sy grn");
        double sayi=scan.nextDouble();

        // Eger ternary icindeki sonuclar farkli data turlerinde ise
        // atama yapamayiz, sadece yazdirabiliriz
        // double sonuc = sayi>0 ? "Sayi Pozitif" : (sayi*sayi) ;



        System.out.println(sayi>0?"sayi pozitif":(sayi*sayi));






    }
}
