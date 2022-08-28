package Day111_ElifHocaCmt;

import java.util.Scanner;

public class C09_stringManipulation {
    public static void main(String[] args) {

        // Kullanicidan isim ve soyismini girmesini isteyin ve hangisinin daha uzun oldugunu yazdirin.

        Scanner scan=new Scanner(System.in);

        System.out.println("lutfen isim ve soy isimini girin:\nisim");
        String isim=scan.next();
        System.out.println("soyisim");
String soyisim=scan.next();


if (isim.length()>soyisim.length()){
    System.out.println("isim uzun");
} else if (isim.length()==soyisim.length() ) {
    System.out.println("esit");

}else System.out.println("soyisiminiz uzun");


    }
}
