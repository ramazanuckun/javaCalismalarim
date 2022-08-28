package Day24_arrayLists_forEachLoop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C05_IstenmeyenleriSilme {
    public static void main(String[] args) {
//verilen array de istenmeyen harf iceren kelimeleri silip
        //kalan elementleri yazdirin


        String[]sehirler={"Istanbul","Ankara","Mersin","Konya","Kastamonu"};
        String idtenmeyenler="a";
        List<String>kalanlar=new ArrayList<>();
        for (int i = 0; i < sehirler.length ; i++) {
            if (!sehirler[i].contains(idtenmeyenler))
                kalanlar.add(sehirler[i]);


        }
        //loop bittiginde istenmeyen harf icermeyen sehirler listeye eklenmis olacak
        System.out.println(kalanlar);
        //yeni bir array olusturup listeye onu aktaralim
        String[]kalanlarArrayi=new String[kalanlar.size()];

        for (int i = 0; i < kalanlarArrayi.length ; i++) {
            kalanlarArrayi[i]=kalanlar.get(i);


        }

        //sehirler array in yeni degerini atayalim
        sehirler=kalanlarArrayi;
        System.out.println("sehirler array'in son hali:"+ Arrays.toString(sehirler));
    }
}
