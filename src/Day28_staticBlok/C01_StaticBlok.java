package Day28_staticBlok;

public class C01_StaticBlok {


    static  int sayi;

    static {
        /*
        Static blok class uyelerinin tamamindan once calisir.
        (main method dan bile once)
        static blok class olusturldugunda calisir.geneliklede class ile ilgili on ayarlamalar veya
        static variablara deger atamak icin kullanilir.
static bloklarin class icerisinde nerede oldugu onemli degildir.once static bloklar calisir.
birden fazla static blok varsa yukaridan asagi dogru calisir.
         */
        System.out.println("static blok calistir");
sayi=10;

    }

    public static void main(String[] args) {

        System.out.println("Main method calisti");
        System.out.println(sayi);
    }

    static {
        System.out.println("main blok altindaki static blok calisti");

    }

}
