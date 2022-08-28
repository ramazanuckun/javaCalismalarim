package Day23_arayList;

import java.util.ArrayList;
import java.util.List;

public class C06_contains {
    public static void main(String[] args) {

        List<String> urunler = new ArrayList<>();
        urunler.add("Nutella");
        urunler.add("Ikram");
        urunler.add("Cekirdek");
        urunler.add("Cay");

        urunler.contains("Nutella");
        System.out.println(urunler.contains("Nutella"));

        List<String>urunler2=new ArrayList<>();
        urunler2.add("Nutella");
        urunler2.add("Ikram");
        System.out.println(urunler.containsAll(urunler2));//true

        //fakat urun birde olamayan hobby eklersek urunler 2 ye
        urunler2.add("Hobby");

        System.out.println(urunler.containsAll(urunler2));//false //cunlu hoobby urun 1 de yok

    }
}
