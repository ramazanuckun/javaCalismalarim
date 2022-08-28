package day11_strıngManipulations;

public class C04_contains {
    public static void main(String[] args) {

        /*Soru 2) Kullanicidan bir cumle isteyin.
         Cumle “buyuk” kelimesi iceriyorsa tum cumleyi buyuk harf olarak,
          “kucuk” kelimesi iceriyorsa tum cumleyi kucuk harf olarak yazdirin,
           iki kelimeyi de icermiyorsa “Cumle kucuk yada buyuk kelimesi icermiyor” yazdirin.
         */


        //ruguirmans de buyuk ve kucuk harf hassasiyeti hakkında bir sey soylenmemis
        //her iki kelimeyide icerme durumu acıklanmamıs
        //bu durumda görevi bize kim verdi ise ona sormak lazım.
        //ek ruguirements:karar ver ébuyukmü yazdırayı kücükmü?
        //cxase sensitive olmasın
       //en basa en sınırlı olanı koymalıyız java yukarıdan asa soldan saga gider

        String cumle="java buyuk dunya kucuk";
        cumle=cumle.toLowerCase();

       if (cumle.contains("kucuk")&&cumle.contains("buyuk")){
           System.out.println("karar ver buyuk mu yazdırayım kücük mü?");
       }


    }
}
