package lambda_functional_programming01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class tekrar03 {
    public static void main(String[] args) {

        String[] names = {"metin", "yusuf", "dilek", "mehmet"};
        Stream<String> arrayAsStream = Arrays.stream(names);
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
        buyukHarfleYazdir(liste);
        System.out.println();
        uzunluklarinaGoreSirala(liste);
        System.out.println();
        uzunluklarinaGoreTerstensirala(liste);
        System.out.println();
        sonkaraktereTekrarsizSirala(liste);
        System.out.println();
        // uzunluguBestenBuyukOlanıSıl(liste);
     //   uzunkuksekizileonarasiYadaoIleBiten(liste);
        onIkiUzunluk(liste);
        System.out.println(xilebasliyormu(liste));

        System.out.println(rileBitenVarmi(liste));
        System.out.println(allMatchAnyMatchNoneMatch(List.of(names)));

    }

    //1) Tüm elemanları büyük harf ile yazdıran bir method oluşturun.
    public static void buyukHarfleYazdir(List<String> list) {

        list.stream().map(String::toUpperCase).forEach(Utils::ayniSatirdaBosluklaYazdir);


    }

    //2) Elemanları uzunluklarına göre sıralayıp yazdıran bir method oluşturun
    public static void uzunluklarinaGoreSirala(List<String> list) {
        list.stream().sorted(Comparator.comparing(String::length)).forEach(Utils::ayniSatirdaBosluklaYazdir);

    }

    //3) Elemanları uzunluklarına göre ters sıralayıp yazdıran bir method oluşturun.
    public static void uzunluklarinaGoreTerstensirala(List<String> list) {

        list.stream().sorted(Comparator.comparing(String::length).reversed()).forEach(Utils::ayniSatirdaBosluklaYazdir);


    }

    public static void sonkaraktereTekrarsizSirala(List<String> list) {

        list.stream().distinct().sorted(Comparator.comparing(method::sonKarakter)).forEach(Utils::ayniSatirdaBosluklaYazdir);
    }
//public static void uzunluguBestenBuyukOlanıSıl(List<String>list){
    //      list.removeIf(t->t.length()>5);
    //   System.out.println(list);
//}
//8) Uzunluğu 8 ile 10 arası olan yada 'o' ile biten elemanları silen bir method oluşturun

//public static void uzunkuksekizileonarasiYadaoIleBiten(List<String>list){
  //      list.removeIf(t->(t.length()>7 && t.length()<11 || t.endsWith("o")));
  //  System.out.println(list);
//}

    //9) Tüm elemanların uzunluklarının 12'den
    // az olup olmadığını kontrol eden bir method oluşturun.

    public static boolean onIkiUzunluk(List<String>list){
return list.stream().allMatch(t->t.length()<5);
    }
public static boolean xilebasliyormu(List<String>list){

        return list.stream().noneMatch(t->t.startsWith("A")||t.startsWith("a"));
}
public static boolean rileBitenVarmi(List<String>list){

        return list.stream().anyMatch(t->t.endsWith("r"));
}
public static boolean allMatchAnyMatchNoneMatch(List<String>list){
 boolean anyMatch=list.stream().anyMatch(t->"yusuf".equals(t));
    System.out.println(anyMatch);
boolean allmatch=list.stream().allMatch(t->"yusuf".equals(t));

boolean allmac=list.stream().allMatch(t->t.startsWith("m") ||t.startsWith("d")||t.startsWith("y"));
return allmac;

}

}
