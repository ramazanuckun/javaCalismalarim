package Day23_arayList;

import java.util.ArrayList;
import java.util.List;

public class C03_indexOf {
    public static void main(String[] args) {

        List<String> urunler = new ArrayList<>();
        urunler.add("Nutella");
        urunler.add("Ikram");
        urunler.add("Cekirdek");
        urunler.add("Cay");

        System.out.println(urunler.indexOf("Ikram"));//1 //indexof :0. indexten baslar liste degismez sadece bize bilgi verir
        System.out.println(urunler);

        urunler.lastIndexOf("Ikram");  /*
        lastidexof=urunu aramaya son.index ten baslar arama bitip urun
         bulundugunda ikiside bulunan urunun index ini verir*/
urunler.add("Ikram");
        System.out.println(urunler);
        System.out.println(urunler.indexOf("Ikram"));
        System.out.println(urunler.lastIndexOf("Ikram"));
        //iki ikram olursa son ekleneni gtr last index methodu
        System.out.println(urunler.indexOf("faste"));
        System.out.println(urunler.lastIndexOf("faste"));//olmayan urun
    }}