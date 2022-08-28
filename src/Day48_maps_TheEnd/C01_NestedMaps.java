package Day48_maps_TheEnd;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class C01_NestedMaps {
    public static void main(String[] args) {

        /*
        eger bir elaman ile ilgi tutulacak bilgiler cok ise veya kompleks ise bu defa
        ic ice daha duzenli olarak tutabiliriz
        ancak bilgiye ulsmak ve manubule etmek zorlasaktir

        dunku map ornek olarak yapalim
          sinifMap.put(102,isim=Enes,soyisim= Cem,brans= Tester);
        sinifMap.put(103,"Taha, Emre, JDev");
        sinifMap.put(104,"Derya, Deniz, Devops");
         */

        Map<String,String>ogr101=new HashMap<>();
        ogr101.put("isim","Enes");
        ogr101.put("soyisim","Cem");
        ogr101.put("brans","Tester");

        Map<String,String>ogr102=new HashMap<>();

        ogr102.put("isim","Taha");
        ogr102.put("soyisim","Emre");
        ogr102.put("brans","JDev");

        Map<String,String>ogr103=new HashMap<>();

        ogr103.put("isim","Derya");
        ogr103.put("soyisim","Deniz");
        ogr103.put("brans","Devops");
        Map<Integer,Map<String,String>>ogrcinestedMap=new HashMap<>();
        ogrcinestedMap.put(101,ogr101);
        ogrcinestedMap.put(102,ogr102);
        ogrcinestedMap.put(103,ogr103);

        Set<Map.Entry<Integer,Map<String,String>>>ogrenciEntrySeti=ogrcinestedMap.entrySet();

        for (Map.Entry each:ogrenciEntrySeti
             ) {
            System.out.println(each);
        }

//eger siz 102 numRli kiaiini ismini yazdirLIM

        System.out.println("ogrcinestedMap.get(102).get(\"isim\") = " + ogrcinestedMap.get(102).get("isim"));
ogrcinestedMap.entrySet();System.out.println("ogrenciEntrySeti = " + ogrenciEntrySeti);

    }
}
