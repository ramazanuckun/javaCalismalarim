package Day39_exception;

import java.util.Scanner;

public class C05_IllegalArgumentException {
    public static void main(String[] args) {


        /*
        soru kullanici sifirdan kucuk sayi girerse Exception verecek xekilde yazin
         */

        Scanner scan = new Scanner(System.in);
        System.out.print("Yasinizi Giriniz...: ");
        int yas = scan.nextInt();
        ///herhangi bir yerde

        try {
            if (yas<0){//kod nerede firtiliyorsa try ile bir catch ile yakalamaliyiz
                throw new IllegalArgumentException();
            }else {
                System.out.println("Yasiniz");
            }
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
            System.err.println("Yas negatif olamaz");//kirmizi yazdiriyor  .err deyince
        }
    }
}
