package Day14_methodCretion;

public class C03_methodCreation {
    public static void main(String[] args) {

        //input volarak verilen isim ve soyismi
        //ilk harfi  büyük  harfler olacak şeklde
        //ı......K****** seklinde yazdıran bir method yazdırın
        String isim="Enes";
        String soyİsim="Bozkurt";

ismiGizle(isim,soyİsim);



    }

    public static void ismiGizle(String isim, String soyİsim) {

       isim= isim.substring(0,1).toUpperCase()+isim.substring(1).replaceAll("\\w","*");
       soyİsim=soyİsim.substring(0,1).toUpperCase()+soyİsim.substring(1).replaceAll("\\w","*");
        System.out.println(isim+" "+soyİsim);

    }


}
