package Day111_ElifHocaCmt;

import java.util.Locale;
import java.util.Scanner;

public class C01_stringManipulation {
    public static void main(String[] args) {

        //Kullanicidan ismini ve soyisimi girmesini isteyin, sonrasinda konsola tam ismini buyuk harfler ile yazdirin


        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen isminizi ve soyisminizi giriniz");
        String firstName=scan.nextLine(),
                lastName=scan.nextLine();//multiple declaration
String fullName=firstName.concat(""+lastName).toUpperCase(Locale.ROOT);
        System.out.println("fullName = " + fullName);

Scanner scann=new Scanner(System.in);




    }
}
