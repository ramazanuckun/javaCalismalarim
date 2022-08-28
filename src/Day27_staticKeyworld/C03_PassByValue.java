package Day27_staticKeyworld;

import java.util.ArrayList;
import java.util.List;

public class C03_PassByValue {


    public static void main(String[] args) {



        /*
/*
  bir list olusturalim
  iki ayri method'dan birinde
  sadece elemanlari degistirelim

  digerinde yeni bir list atayip,
  ayni sayida yeni leman ekleyelim

  ve her iki method call'dan sonra kendi listemizi
  main method icerisinde kontrol edelim
 */

        List<String>list=new ArrayList<>();
         list.add("Ali");
         list.add("Veli");
         list.add("Can");

        System.out.println("Ilk basta list:"+ list);
        elamanlariDegistir(list);


    }


    private static void elamanlariDegistir(List<String> list) {


        list.set(0,"Oguz");
        list.set(1,"Murar");
        list.set(2,"murat");

        System.out.println("");
    }
}
