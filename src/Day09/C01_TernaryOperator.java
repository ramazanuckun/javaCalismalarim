package Day09;

import java.util.Scanner;

public class C01_TernaryOperator {
    public static void main(String[] args) {

        // Soru3 ) Kullanicidan bir sayi alin ve sayinin mutlak degerini yazdirin

        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen bir sayı giriniz");
        double sayi=scan.nextDouble();

        System.out.println(sayi>=0? sayi:(-1*sayi));




    }
}
