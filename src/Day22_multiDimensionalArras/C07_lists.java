package Day22_multiDimensionalArras;

import java.util.ArrayList;
import java.util.List;

public class C07_lists {
    public static void main(String[] args) {

        List<Integer>sayilar=new ArrayList<>();
        //list primitive data turlerini kabul eder yani int kabul  etmez
        //repurclas olabilir
        sayilar.add(5);
        sayilar.add(3);
        sayilar.add(7);
        System.out.println(sayilar);//5,3,7//yeni eklenen son a gider
        sayilar.add(2,10);//index i 2 olan yere 10 elementini ekleyelim
        System.out.println(sayilar);//5,3,10,7//eski yi silip yeniyi atamiyor kaydiriyor yeni yere atamak icin
        //add method eski elemetleri silmez veya update etmez,yeni element ekler
    }
}
