package Day21_Arrays;

import java.util.Arrays;

public class C10_split {
    public static void main(String[] args) {

        /*split bir aray degil bir string methodu
        aray dondurdugu icin burada anlatiliyor
        herhangi string ile split ile istedigimiz gibi bolup bir aray haline getiriyoruz.
         */

        String str="John";

        String[]kelimer=str.split(" ");
        System.out.println(Arrays.toString(kelimer));
String[]kelimelerNe=str.split("ne");
        System.out.println(Arrays.toString(kelimelerNe));

        String[]karakterler=str.split("");
        System.out.println(Arrays.toString(karakterler));
    }
}
