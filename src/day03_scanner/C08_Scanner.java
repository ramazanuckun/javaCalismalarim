package day03_scanner;

import java.util.Scanner;

public class C08_Scanner {
    public static void main(String[] args) {
        //kullanıcıdan ismini alıp ,ilk harfini  büyük harf olarak yazdırın

        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen isminizi giriniz");
        /*Java scanner clas ında nextChar()method u yoktur.
        bunun yerine String olarak ilk kelime alıp onun da ilk harfini alabiliriz
         */
     char ilkHarf=scan.next().toUpperCase().charAt(0);


        System.out.println("ismin ilk harfi:"+ilkHarf);

    }
}
