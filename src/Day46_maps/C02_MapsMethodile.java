package Day46_maps;

import java.util.List;
import java.util.Map;

public class C02_MapsMethodile {
    public static void main(String[] args) {
        Map<Integer,String> ogrenciMap =ReusableMedhods.mapOlustur();
        System.out.println(ogrenciMap);
        // value'lari sira numarali olarak yazdirin
        ReusableMedhods.tumValueSiraliYazdir(ogrenciMap);
        // Isim ve soyisimlerin birlikte olacagi bir liste olusturun
        List<String> sinifisimsoyisimList= ReusableMedhods.isimSoyisimListesiOlustur(ogrenciMap);
        System.out.println("isim soyisim listesi : " + sinifisimsoyisimList);
        // kac farkli brans varsa bransIsmi = branstakiOgrencisayisi seklinde yazdirin
    }
}
