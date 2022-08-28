package Day21_Arrays;

import java.util.Arrays;

public class C05_ArrayaElamanEkleme {
    public static void main(String[] args) {
        //Soru 5- Verilen bir array’e yeni bir element ekleyen method olusturun

        String[]sinifList={"Ali Can","nida yucedal","musa yaman"};
        String eklenecekIsim="Murat Babayigit";
        sinifList=elemanEkle(sinifList,eklenecekIsim);

        System.out.println(Arrays.toString(sinifList));

    }

  public static String[] elemanEkle(String[] sinifList, String eklenecekIsim) {
        String[]yeniSinifListesi=new String[sinifList.length+1];//{null,null}

        //eski listeden bir fazla bir aray olustu/

        for (int i = 0; i <sinifList.length ; i++) {
            yeniSinifListesi[i]=sinifList[i];

        }
        //oncelikle eskiyi yeni listeye tasidim

yeniSinifListesi[yeniSinifListesi.length-1]=eklenecekIsim;

//son index e eklenen isimi tasidim


        return yeniSinifListesi;
    }
}
