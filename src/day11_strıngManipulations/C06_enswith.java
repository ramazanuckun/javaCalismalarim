package day11_strıngManipulations;

public class C06_enswith {
    public static void main(String[] args) {

        /*  /*Soru 1) Kullanicidan email adresini girmesini isteyin,
         mail @gmail.com icermiyorsa  “lutfen gmail adresi giriniz”,
          @gmail.com ile bitiyorsa  “Email adresiniz kaydedildi “ ,
          @gmail.com ile bitmiyorsa lutfen yazimi kontol edin yazdirin
         */

        String input="rru.3206@gmail.com";
         if (!input.contains("gmail.com")) {System.out.println("lütfen email adresinizi giriniz");}
         else if(input.endsWith("@gmail.com")){
             System.out.println("e mail adresi kaydedildi");
         }else {
             System.out.println("lütfen yazımı kontrol edin");
         }

    }
}
