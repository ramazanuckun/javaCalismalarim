package Day09;

import java.util.Scanner;

public class C03_Ternary {
    public static void main(String[] args) {

        //klnıcıdan bir sayi isteyin
       // sayi pozitif ise sayıyı yazdırın
         //       sayi negatif isebir sayi isteyin ve ikisinin carpımını yazdırın
        Scanner scan=new Scanner(System.in);
        System.out.println("ltfn sayi girin");
        double sayi=scan.nextDouble();

        if (sayi>0){
            System.out.println(sayi);
        }else {System.out.println("lütfen bir sayi giriniz");
            double sayi2=scan.nextDouble();
            System.out.println(sayi*sayi2);}

/*if else içerisinde yeni kodlar varsa ternary
yapmamız mümkün olmaz
 */

    }
}
