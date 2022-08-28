package lambda_functional_programming01;

import dAY41_abstractClass_Interface.DAraba;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class tekrar02 {
    public static void main(String[] args) {

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
        ardisik(liste);
        System.out.println();
        System.out.println();
        ardisikCiftListElamanlariBoslukBirakarak(liste);
        System.out.println();
        tekKareMethod(liste);
        System.out.println();
        tekTekrarsizKupu(liste);
        System.out.println();
        tekrarsizCiftElamanlarinToplami01(liste);
        System.out.println();
        tekrarsizCiftKuplerininCarpimi(liste);
        System.out.println();
        enBuyukDegerListeden(liste);
        System.out.println();
        enkucukDegerListeden(liste);
        System.out.println();
        tekrarsizBestenBuyukElamanlarinYaridegerleriniSirala(liste);


    }
    //1) Ardışık list elemanlarını aynı satırda aralarında boşluk bırakarak yazdıran bir method oluşturun.(Functional ve method reference)
public static void ardisik(List<Integer>l){

        l.stream().forEach(method::aynisatirBosluk);
}
    //2)Ardışık çift list elementlerini aynı satırda aralarında boşluk bırakarak yazdıran bir method oluşturun.(Functional)
public static void cift(List<Integer>l){
l.stream().filter(method::ardisikcift);
}
public static void ardisikCiftListElamanlariBoslukBirakarak(List<Integer>list){

        list.stream().filter(method::ardisikcift).forEach(Utils::ayniSatirdaBosluklaYazdir);

}
public static void tekKareMethod(List<Integer>list){
 list.stream().filter(method::tekler).map(method::kareAl).forEach(Utils::ayniSatirdaBosluklaYazdir);
}
public static void tekTekrarsizKupu(List<Integer>list){
        list.stream().distinct().filter(method::tekler).map(method::kupAl).forEach(Utils::ayniSatirdaBosluklaYazdir);

}
public static void tekrarsizCiftElamanlarinToplami01(List<Integer>list){

  //    Integer toplam=  list.stream().distinct().filter(method::ardisikcift).map(method::kareAl).reduce(Math::addExact).get();
    //Integer toplam=  list.stream().distinct().filter(method::ardisikcift).map(method::kareAl).reduce(Integer::sum).get();
    Integer toplam=  list.stream().distinct().filter(method::ardisikcift).map(method::kareAl).reduce(0,Math::addExact);

    System.out.println(toplam);


    }
    public static void tekrarsizCiftKuplerininCarpimi(List<Integer>list){

        Integer carpim=list.stream().distinct().filter(method::ardisikcift)
                .map(method::kupAl).reduce(Math::multiplyExact).get();
        System.out.println(carpim);
    }
    public static void enBuyukDegerListeden(List<Integer>list){
       Integer max= list.stream().reduce(Math::max).get();
        System.out.println(max);
    }
    public static void enkucukDegerListeden(List<Integer>list){

        Integer min=list.stream().distinct().reduce(Integer::min).get();
        System.out.println(min);
    }
    //ters siralama//10) Ters sıralama ile tekrarsız ve 5'ten büyük elemanların yarı
    // değerlerini(elamanın ikiye bölüm sonucunu) bulan bir method oluşturun.
    public static void tekrarsizBestenBuyukElamanlarinYaridegerleriniSirala(List<Integer>list){

        System.out.println("list.stream().distinct().\n                filter(t->t>5)\n                .map(method::yarisiniAl)\n                .sorted(Comparator.reverseOrder())\n                .collect(Collectors.toList()) = " + list.stream().distinct().
                filter(t -> t > 5)
                .map(method::yarisiniAl)
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList()));


    }
}
