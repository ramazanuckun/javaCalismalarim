package Day23_arayList;

import java.util.ArrayList;
import java.util.List;

public class C04_remova {
    public static void main(String[] args) {

        List<String> urunler = new ArrayList<>();
        urunler.add("Nutella");
        urunler.add("Ikram");
        urunler.add("Cekirdek");
        urunler.add("Cay");
 /*temova method u iki sekilde kullanilir
 1*obje yi yazip silmesini istersek boolen doner
 2*index girersek o index teki elemani siler ve silinen elamani getrr

  */
        System.out.println(urunler);//[Nutella, Ikram, Cekirdek, Cay]
        System.out.println(urunler.remove("Ikram"));//true sildim diyor
        System.out.println(urunler);//[Nutella, Cekirdek, Cay]
        System.out.println(urunler.remove("hobby"));//false//cunku listede hobby yok
//set urun listesini sunu sil bunu koy diyorduk.remova siliyor direk yerine koymadan

        //ikinci yontem
        System.out.println(urunler.remove(1));// cekirdek//listeye git index i 1 olani bulucak ve sildigini gtriyor
        System.out.println(urunler);//[Nutella, Cay]
      //  System.out.println(urunler.remove(3));//olmayan urunde hata verr exception

    }
}
