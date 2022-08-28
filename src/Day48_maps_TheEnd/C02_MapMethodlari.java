package Day48_maps_TheEnd;

import Day46_maps.ReusableMedhods;

import java.util.Map;

public class C02_MapMethodlari {
    public static void main(String[] args) {

        Map<Integer,String> sinifListMap=ReusableMedhods.mapOlustur();
        ReusableMedhods.entryYazdir(sinifListMap);
        sinifListMap.clear();
        System.out.println("cleardan sonra map : " + sinifListMap);
        sinifListMap=ReusableMedhods.mapOlustur();
        System.out.println(sinifListMap.getOrDefault(104, "Aradiginiz key yok"));
        // Derya, Deniz, Devops
        System.out.println(sinifListMap.getOrDefault(110, "Aradiginiz key yok"));
        // Aradiginiz key yok
        System.out.println(sinifListMap.isEmpty()); // false
        sinifListMap.putIfAbsent(104,"Derya, Okyanus, Developer");
        sinifListMap.putIfAbsent(108,"Aysun, Can, Devops");
        ReusableMedhods.entryYazdir(sinifListMap);
        /*
          SinifListesiMap'e key olarak 106 yoksa , value "Mevlut, Han, Tester" ekleyin
          106 daha onceden varsa, "eski degeri degistirmek istediginizden emin misiniz ?"
          yazdirin
          106'nin oldugunu kontrol etmek icin containsKey dha mantikli ama biz
          yeni ogrendigimiz method ile yapalim
          map.putIfabsent (key, value) ==> key varsa
          ekleme yapmaz, bize o key ile kayitli olan value'yu dondurur
          ==> key daha onceden map'e eklenmemisse
          eklemeyi yapar ve bize null dondurur
         */
        System.out.println(sinifListMap.putIfAbsent(106,"Mevlut, Han, Tester"));
        // Taha, Deniz, JDev
        if (sinifListMap.putIfAbsent(106,"Mevlut, Han, Tester")==null){
            System.out.println("Kayit basarili");
        } else{
            System.out.println("eski degeri degistirmek istediginizden emin misiniz ?");
        }
        System.out.println(sinifListMap.putIfAbsent(109,"Mevlut, Han, Tester"));
        // Taha, Deniz, JDev
        ReusableMedhods.entryYazdir(sinifListMap);
        sinifListMap.remove(106); // 106'yi silip bana sildigini dondurur
        sinifListMap.remove(107,"Derya, Cem, Tester"); // silerse true, silmezse false dondurur
        ReusableMedhods.entryYazdir(sinifListMap);
        sinifListMap.replace(105,"Erdal, Ciftci, Tester");
        sinifListMap.put(109,"Cavidan, Eken, JDev"); // ikisi ayni islevi yapiyor
        ReusableMedhods.entryYazdir(sinifListMap);
        System.out.println(sinifListMap.size()); // 7
    }

}