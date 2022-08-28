package Day45_collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class C02_CollectionsDataTuru {

    public static void main(String[] args) {


        List<String>liste=new ArrayList<>();

        //liste.add(5);string lerden olusuyor sadece kendi dta turu eklenir

        List list=new ArrayList<>();//elmaz silindi ekleme geldi
        list.add(5);
        list.add("ali");
        list.add(true);

        list.set(0,(Integer)list.get(0)+5);

        list.set(3,list.get(3)+"Can") ;


    System.out.println(list);//5 ti 10 oldu fakat casting yapmadan kabul etmedi

        System.out.println(list);//collections ozelligi herseyi aliyor
        //fakat farkli data turleri olunca java problem yapiyor sonra

        Set<Object>set1=new HashSet<>();

        set1.add(5);
        set1.add("Rahmi");//hersey ekleniyor objet butun class larin atasidir


    }

}
