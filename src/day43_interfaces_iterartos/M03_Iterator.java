package day43_interfaces_iterartos;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class M03_Iterator {
    public static void main(String[] args) {


        List<Integer>liste=new ArrayList<>();
        liste.add(10);
        liste.add(20);
        liste.add(30);
        System.out.println(liste);//[10, 20, 30]

        /*Listedki tum elamanlari index kullanmadan 3 artirin

         */
        for (Integer each:liste
             ) {
            System.out.print(each+3+" ");//13 23 33 fakat liste kalici degismedi
        }
        System.out.println("");
        System.out.println(liste);//[10, 20, 30] cunku atama yapmadik

/*
java index yapisi olmaya collectionlarda elementlere  ulasmak veya degistirmek icin iterator yapisini olustrmustur

Iterator interfaces oldugundan ondan obje uretemmiz munkun degildir.
bunu yerine iterator donduren liste.iterator ()methodunu kullaniyoruz
 */

        System.out.println(liste);//[10, 20, 30]

        Iterator it=liste.iterator();

        System.out.println(it.next());//10

        System.out.println(it.next());//20
        System.out.println(it.next());//30
  //      System.out.println(it.next());30 dann sonra element kalmadiginda next RTE verir
        //iterator da geri donus yok ,adim adim sona ulastiktan sonra
        //yeniden bir iterator olusturmamaiz gerekir.
        Iterator it2=liste.iterator();

        /*
        ////[10, 20, 30]
        yeni it2 yi kullanarak listenin elemanlarini silelim

         */

        it2.next();

        it2.remove();

        it2.next();
        it2.remove();
        it2.next();
        it2.remove();


        System.out.println(liste);//iterator ile elementleri gezip remove yapinca
        //lista kalici olarak deegisti

        liste.add(10);
        liste.add(20);
        liste.add(30);

        System.out.println("Yeniden liste "+ liste);
        Iterator it3= liste.iterator();

        while (it3.hasNext()){

            it3.next();
            it3.remove();
        }
        System.out.println("looptan sonra liste"+liste);



/*
goruldugu gibi iterator ile yapabildigim
1-tum collection elementleri yazdirmak
2-tum collection elementlerini silmek
buda bize yetmez

 */


























    }
}
