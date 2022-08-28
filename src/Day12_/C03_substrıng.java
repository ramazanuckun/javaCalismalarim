package Day12_;

import java.util.Locale;

public class C03_substrıng {
    public static void main(String[] args) {

String isim="suleyman";
String soyİsim="Karanfil";
String kartNo="1234 5678 98765432";
        System.out.println(isim.substring(3));//eyman
        System.out.println(soyİsim.substring(soyİsim.length()-3));//fil

        System.out.println(isim.substring(2,4));//le
        //isim ve soyısmni ilk harfi büyük harf geriye kalan yıldız
        //kredi kartı ilk dort harfi gorünsün geriye kalan *


        String isimİlkHarf=isim.substring(0,1).toUpperCase(Locale.ROOT);
        String isimGeriyeKalanlar=isim.substring(1).replaceAll("\\w","*");

        String soyİsimİlkHarf=soyİsim.substring(0,1).toUpperCase();

String soyİsimGeriyeKalanlar=soyİsim.substring(1).replaceAll("\\w","*");
String kkİlk4=kartNo.substring(0,4);
String kkGeriyeKalanlar="**** **** ****";

        System.out.println(isimİlkHarf+isimGeriyeKalanlar+" "+soyİsimİlkHarf+soyİsimGeriyeKalanlar+"\n"+kkİlk4+kkGeriyeKalanlar);







    }

}
