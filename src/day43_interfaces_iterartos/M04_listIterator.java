package day43_interfaces_iterartos;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class M04_listIterator {

    /*
    ListIterator iterator interface child interfacedir
    ama daha cok methoda shiptir

     */
    public static void main(String[] args) {

        List<Integer>liste=new ArrayList<>();
        liste.add(10);
        liste.add(20);
        liste.add(30);
        System.out.println(liste);//[10, 20, 30]
  Integer temp;

        ListIterator lit1= liste.listIterator();
        while (lit1.hasNext()){

temp=(Integer) lit1.next()+3;//neden boyle bize obje gtriyordu uyumlu degildi temp data turu integer oldugu icin biz cast yaptik
            //




lit1.set(temp);//set olarak atama yaptik




        }

        System.out.println(liste);//[13, 23, 33]


    }
}
