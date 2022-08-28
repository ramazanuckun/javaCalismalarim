package day11_strıngManipulations;

import java.util.Scanner;

public class C03_contains {
    public static void main(String[] args) {


        /*Soru 1) Kullanicidan email adresini girmesini isteyin,
         mail @gmail.com icermiyorsa  “lutfen gmail adresi giriniz”,
          @gmail.com ile bitiyorsa  “Email adresiniz kaydedildi “ ,
          @gmail.com ile bitmiyorsa lutfen yazimi kontol edin yazdirin
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen e mail adresinizi yazınız");
        String email=scan.nextLine();


        if (!email.contains("gmail")){
            System.out.println("lütfen gmail adresininizi giriniz");
        }else if (email.lastIndexOf("@gmail.com")==(email.length()-10)){
            System.out.println(" email adresinin kaydedildi");
        }else {
            System.out.println("lütfen yazımı kontrol edin");
        }



    }
}
