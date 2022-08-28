package lambda_functional_programming01;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Fp02 {
    public static void main(String[] args) {

        /*
          /*
    1)  t-> "Logic" , (t, u)-> "Logic"
        Bu yapıya "Lambda Expession"
    2) Functional Programming kapsamında "Lambda Expession" kullanılabilir ama önerilmez.
       "Lambda Expession" yerine "Method Reference" tercih edilir.
    3) "Method Reference" kullanımı "Class Name :: Method Name"

       Aynı zamanda kendi class'larınızı da kullanabilirsiniz.
       Örneğin bir Animal class'ınız var ve bu class "eat()" methoduna sahip ==> "Animal :: eat"
     */

        List<Integer> liste = new ArrayList<>();
        liste.add(8);
        liste.add(9);
        liste.add(131);
        liste.add(10);
        liste.add(9);
        liste.add(10);
        liste.add(2);
        liste.add(8);
        System.out.println(liste);
        listElamanlariniYazdirFunctional(liste);
        System.out.println();
        ciftElemanlariYazdirFunctional(liste);
        System.out.println();
        tekElemanlarinKareleriniYazdir(liste);
        System.out.println();
        tekrarsizTekElemanlarinKupunuYazdir(liste);
        System.out.println();
        tekrarsizCiftElamanlarinKareToplami01(liste);
        System.out.println();
        tekrarsizCiftElamanlarinKareToplami02(liste);
        System.out.println();
        tekrarsizCiftElamanlarinKareToplami03(liste);
        System.out.println();
        tekrarsizCiftElamanlarinKuplerininCarpimi(liste);
        System.out.println();
        getMaxElaman(liste);
        System.out.println();
        yedidenBuyukCiftMnimun(liste);
        System.out.println();
        tekrarsizBestenByuklerinYariDegeritersSiralama(liste);
    }

    /*

    //1) Ardışık list elemanlarını aynı satırda aralarında boşluk bırakarak
     yazdıran bir method oluşturun.(Functional ve method reference)
     */

    public static void listElamanlariniYazdirFunctional(List<Integer> list) {
//method referanclari kullanalim
        //    list.stream().forEach(t-> System.out.println(t+ " "));
        //  list.stream().forEach(System.out::print);
        list.stream().forEach(Utils::ayniSatirdaBosluklaYazdir);
        /*
        biz burada sadece methodlar ile calistik
         */


    }


    //2)Ardışık çift list elementlerini aynı satırda aralarında boşluk
    // bırakarak yazdıran bir method oluşturun.(Functional)

    public static void ciftElemanlariYazdirFunctional(List<Integer> list) {
//daha dinamik farkli bir clastan kucuk bir method ile calisiliyor
        list.stream().filter(Utils::ciftElamanlariSec).forEach(Utils::ayniSatirdaBosluklaYazdir);

    }

    //3) Ardışık tek list elemanlarının karelerini aynı satırda aralarında boşluk bırakarak yazdıran bir method oluşturun.(Functional)
    public static void tekElemanlarinKareleriniYazdir(List<Integer> list) {

        list.stream().filter(Utils::tekElamanlariSec).map(Utils::karesiniAl).forEach(Utils::ayniSatirdaBosluklaYazdir);
    }

    //4) Ardışık tek list elemanlarının küplerini tekrarsız olarak aynı satırda aralarında boşluk bırakarak yazdıran bir method oluşturun.

    public static void tekrarsizTekElemanlarinKupunuYazdir(List<Integer> list) {
        list.stream().distinct().filter(Utils::tekElamanlariSec).map(Utils::kupunuAl).forEach(Utils::ayniSatirdaBosluklaYazdir);

    }

    //5) Tekrarsız çift elemanların karelerinin toplamını hesaplayan bir method oluşturun.
    public static void tekrarsizCiftElamanlarinKareToplami01(List<Integer> list) {
        //method refrans
        //Math::addExact==toplama yapacak
//1.yol
        Integer toplam = list.stream().distinct().filter(Utils::ciftElamanlariSec).map(Utils::karesiniAl).reduce(0, Math::addExact);//.get();baslangic degeri atamasakta olur
        System.out.println(toplam);
    }

    public static void tekrarsizCiftElamanlarinKareToplami02(List<Integer> list) {
        //method refrans
        //Math::addExact==toplama yapacak
//2.yol
        Integer toplam = list.stream().distinct().filter(Utils::ciftElamanlariSec).map(Utils::karesiniAl).reduce(Math::addExact).get();// degeri atamasakta olur
        System.out.println(toplam);
    }

    public static void tekrarsizCiftElamanlarinKareToplami03(List<Integer> list) {
        //method refrans
        //Math::addExact==toplama yapacak
//3.yol
        Integer toplam = list.stream().distinct().filter(Utils::ciftElamanlariSec).map(Utils::karesiniAl).reduce(0, Integer::sum);//reper classa baslangic degeri atamasakta olur
        System.out.println(toplam);
    }
//6) Tekrarsız çift elemanların küpünün çarpımını hesaplayan bir method oluşturun.

public  static void tekrarsizCiftElamanlarinKuplerininCarpimi(List<Integer>list){

    Integer carpim=    list.stream().distinct().filter(Utils::ciftElamanlariSec).map(Utils::kupunuAl).reduce(1,Math::multiplyExact);
    System.out.println(carpim);
}
//7) List elemanları arasından en büyük değeri bulan bir method oluşturun.

public static void getMaxElaman(List<Integer>list){

     Integer max=   list.stream().distinct().reduce(Math::max).get();//get oldugu icin baslangic degeri atamaya gerek yok
    System.out.println(max);
}
    //8)List elemanları arasından en küçük değeri bulan bir method oluşturun.(Method Reference)

//9) List elemanları arasından 7'den büyük, çift, en küçük değeri bulan bir method oluşturun.

public static void yedidenBuyukCiftMnimun(List<Integer>list){

      Integer mın=  list.stream().distinct().filter(t->t>7).filter(Utils::ciftElamanlariSec).reduce(Math::min).get();
    System.out.println(mın);




}
//10) Ters sıralama ile tekrarsız ve 5'ten büyük elemanların yarı değerlerini(elamanın ikiye bölüm sonucunu) bulan bir method oluşturun.

    public static void tekrarsizBestenByuklerinYariDegeritersSiralama(List<Integer>list){

  List<Double>sonuc=  list.stream()
          .distinct()
          .filter(t->t>5)
          .map(Utils::yarisiniAl).//her bir elamani degistrmeye yarar
          sorted(Comparator.reverseOrder())//tersten siralama methodu
          .collect(Collectors.toList());//yeni list olusturma methodu
         System.out.println(sonuc);

    }

}