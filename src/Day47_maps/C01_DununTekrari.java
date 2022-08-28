package Day47_maps;

import Day46_maps.ReusableMedhods;

import java.util.Map;

public class C01_DununTekrari {
    public static void main(String[] args) {

            Map<Integer,String> sinifListMap = ReusableMedhods.mapOlustur();
            System.out.println(sinifListMap);
            // ogrenci listesini isim soyisim olarak yazdirin
            ReusableMedhods.tumValueSiraliYazdir(sinifListMap);
            // kac farkli brans varsa bransIsmi = branstakiOgrencisayisi seklinde yazdirin
            ReusableMedhods.bransOgrencisayisiYazdir(sinifListMap);
        }
    }

