package Day08ifSatandmens;

import java.util.Scanner;

public class C05_NestedIfElsestaemans {
    public static void main(String[] args) {
        /*Soru 11) Nested If kullanarak asagidaki soruyu cozen kodu yaziniz.
        Kullanicidan bir sifre girmesini isteyin
        Eger ilk harf buyuk harf ise “A” olup olmadigini kontrol edin. Ilk harf A ise
       “Gecerli Sifre”  degilse “Gecersiz Sifre” yazdirin.
        Eger ilk harf kucuk harf ise “z” olup olmadigini kontrol edin. Ilk harf z ise
       “Gecerli Sifre”  degilse “Gecersiz Sifre” yazdirin.

         */
    //ilk harf büyük mü küçük mü
        // ilk harf A veya Z mi


        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen bir sifre giriniz");
        String sifre=scan.nextLine();
        char ilkHarf=sifre.charAt(0);

        if (ilkHarf>='A'&& ilkHarf<='Z') {//ilk harfi harf olan kelimeler
            if (ilkHarf=='A'){
                System.out.println("Gecerli sifre");
            }else {
                System.out.println("Gecersiz sifre");
            }

        }else if (ilkHarf>='a'&&ilkHarf<='z'){
            if (ilkHarf<='z'){
                System.out.println("Gecerli sifre");}else {
                System.out.println("ecersiz sifre");}

            }else {
            System.out.println("lütfen ilk karakter icin gecerli sadece harf kullanın");
        }












    }
}
