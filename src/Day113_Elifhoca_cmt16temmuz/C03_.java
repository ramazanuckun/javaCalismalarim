package Day113_Elifhoca_cmt16temmuz;

import java.util.Scanner;

public class C03_ {
    public static void main(String[] args) {

      /*
    Kullanıcıda x girilene kadar ekrana "Program çalışıyor" yazan
    ve x girildiğinde ise "Program bitti" yazan programı yazınız.
    */

            Scanner abc = new Scanner(System.in);
            String okunan ="";
            do {
                System.out.println("harf giriniz : ");
                okunan = abc.next();
                System.out.println("Program calisiyor");
            }while(!okunan.equalsIgnoreCase("x"));
            System.out.println("program bitti");
        }
    }





