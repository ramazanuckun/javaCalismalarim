package lambda_functional_programming01;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Fp03 {
    public static void main(String[] args) {

        List<String> liste = new ArrayList<>();
        liste.add("Ali");
        liste.add("Ali");
        liste.add("Mark");
        liste.add("Amanda");
        liste.add("Christopher");
        liste.add("Jackson");
        liste.add("Mariano");
        liste.add("Alberto");
        liste.add("Tucker");
        liste.add("Benjamin");
        System.out.println(liste);

        //  lambda_functional_programming
        buyukHarfleYazdir(liste);
        System.out.println();
        // buyukHarfleYazdir2(liste);
        System.out.println();
        uzunlugaGoreYazdir(liste);
        System.out.println();
        uzunlugaGoreTersYazdir(liste);
        System.out.println();
        sonkaraktereTekrarsizsirala(liste);
        System.out.println();
        uzunlukveIlkHarfegoreSiralaYazdir(liste);
        System.out.println();
        //uzunluguBestenbyukOlanlariSil(liste);
        System.out.println();
       // baslangiciAyadasonuNolanisil(liste);
       // sekizileOnarasiveOileBiteniSil(liste);
        System.out.println();
       //ayni methodu asagi satirda yazdiriyoruz
        System.out.println("uzunlugu12denAzMi: "+uzunlugu12denAzMi(liste));
        System.out.println(xIleBaslamiyorMu(liste));
        System.out.println("rIleBitenVarMi: "+rIleBitenVarMi(liste));






    }

    //1) Tüm elemanları büyük harf ile yazdıran bir method oluşturun.
    public static void buyukHarfleYazdir(List<String> list) {

        list.stream().map(String::toUpperCase).forEach(Utils::ayniSatirdaBosluklaYazdir);
        // buyukHarfleYazdir==method yazdirma methodu oldugu icin tekrardan yazdirmaya gerek kalmadi

    }
//2.yol
    //  public static void buyukHarfleYazdir2(List<String>list){
//        list.replaceAll(String::toUpperCase);//kalici olarak degisir cunku mutbel old.icin list inmutubel olsa idi kalici olmazdi onun icin bir yer
    //      System.out.println(list);

    //  }

    //2) Elemanları uzunluklarına göre sıralayıp yazdıran bir method oluşturun
    public static void uzunlugaGoreYazdir(List<String> list) {

        list.stream().
                sorted(Comparator.comparing(String::length))//sadece sorted dersek bas harfe gore siralar onun icin method koymam lazim icine yazilan method siralama kosulunu belitrmek icin dir
                .forEach(Utils::ayniSatirdaBosluklaYazdir);


    }

    //3) Elemanları uzunluklarına göre ters sıralayıp yazdıran bir method oluşturun.

    public static void uzunlugaGoreTersYazdir(List<String> list) {

        list.stream().    //comparator==karsilastima demek
                sorted(Comparator.comparing(String::length).reversed())//reversed==ters silar ama once kosul koymaliyim
                .forEach(Utils::ayniSatirdaBosluklaYazdir);

    }
    //4) Elemanları son karakterlerine göre sıralayıp tekrarsız yazdıran bir method oluşturun.

    public static void sonkaraktereTekrarsizsirala(List<String> list) {

        list.stream().
                distinct().
                sorted(Comparator.comparing(Utils::sonKarakteral)).//siralama olcutu
                forEach(Utils::ayniSatirdaBosluklaYazdir);
    }

    //5) Elemanları önce uzunluklarına göre ve sonra ilk karakterine göre sıralayıp yazdıran bir method oluşturun.
    public static void uzunlukveIlkHarfegoreSiralaYazdir(List<String> list) {


        list.stream().sorted(Comparator.comparing(String::length).
                thenComparing(Utils::ilkKarakteral)).////thenComparing() :==>siralam icin bir kosul daha belirtir
                forEach(Utils::ayniSatirdaBosluklaYazdir);

    }
//6) Uzunluğu 5'ten büyük olan elemanları silen bir method oluşturun.
    //  public static void uzunluguBestenbyukOlanlariSil(List<String>list){
//stream kulanmadik cunku bazi methodlari kullanabilmek icin
//list.removeIf(t->t.length()>5);
    //       System.out.println(list);
    /*not=lis mutable old.icin elamanlari kalici olarak silmmesi icin commet out yapiyoruz

 //   }


     */
    //7) ‘A’, ‘a’ ile başlayan yada ‘N’, ‘n’ ile biten elemanları silen bir method oluşturun.
//1.yol/*
  /*  public static void baslangiciAyadasonuNolanisil(List<String>list){
        list.
                removeIf(t->t.charAt(0)=='A'||t.charAt(0)=='a'||t.charAt(t.length()-1)=='n');//kosul dogru ise onu sil bu methodun yyaptigi is
        System.out.println(list);                                                                   //bu kosullar var ise

    }
 /*   //2.yol
    public static void baslangiciAyadasonuNolanisil2(List<String>list){
        list.
                removeIf(t->t.startsWith("A"))=='A'|| list.stream("a"))=='a'||t.startsWith("N"))=='a');



   */
//8) Uzunluğu 8 ile 10 arası olan yada 'o' ile biten elemanları silen bir method oluşturun
   /*  public static void sekizileOnarasiveOileBiteniSil(List<String>list){

         list.removeIf(t->(t.length()>7 &&t.length()<11) || t.endsWith("o"));
         System.out.println(list);
     }

    */

    //9) Tüm elemanların uzunluklarının 12'den
    // az olup olmadığını kontrol eden bir method oluşturun.
    //9) Tüm elemanların uzunluklarının 12'den az olup olmadığını kontrol eden bir method oluşturun.
    public static boolean uzunlugu12denAzMi(List<String> list){
        return list.stream().allMatch(t->t.length()<12);
    }
    //10) Hiçbir elemanın 'X' ile başlamadığını kontrol eden bir method oluşturun.

    public static boolean xIleBaslamiyorMu(List<String> list){

        return  list.stream().noneMatch(t->t.startsWith("X") || t.startsWith("x"));//elamanlarin hic biri karsilamasin methodu
    }
    //11) Herhangi bir elemanın 'r' ile bitip bitmediğini kontrol eden bir method oluşturun.
    public static boolean rIleBitenVarMi(List<String> list){
//herhangi biri dedigi icin anyMatch kullaniliyor ve sonu dedigi icin endsWith kulaniyoruz
        return list.stream().anyMatch(t->t.endsWith("r"));
}
// current transaction is aborted, commands ignored until end of transaction block
}