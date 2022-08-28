package Day44_Collections;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
public class C03LinkedList_ListDataTuru {
    public static void main(String[] args) {


        LinkedList <String>ll1=new LinkedList<>();//kendi clasindan data turunu  kulland

        List<String> ll2=new LinkedList<>();//konu anlatimindaki resmi disin

        Queue<String> ll3=new LinkedList<>();

        Deque<String> ll4=new LinkedList<>();


        ll2.add("Nesibe Kubra");
        ll2.add("Yusuf ihsan");
ll2.add("Ramazan");
ll2.add("Tugba");
        System.out.println(ll2);//[Nesibe Kubra, Yusuf ihsan, Ramazan, Tugba]
        ll2.remove(3);
        System.out.println(ll2.remove(2));//Ramazan//index kullandi,
        System.out.println(ll2.remove("Ramazan"));//obje kullandim//false


        /*
        eger direk listemiz integer elamanlardan olusuyorsa
        direk sayi yazarsak  index olarak kabul eder/
        bir variable atama yapar ve remova da o variable ismini yaparsak obje olarak kabul eder

         */
        System.out.println(ll2.isEmpty());//false//bosmu diyre sorusuna cevap



        ll1.add("Berk");
        ll1.add("Ramazan");
        System.out.println(ll2);//[Nesibe Kubra, Yusuf ihsan]
        System.out.println(ll1);//[Berk, Ramazan]

        ll2.retainAll(ll1);
        System.out.println(ll2);//[] /*
        //ll1 olmayanalari slier ==>   ll2.retainAll(ll1);


    }
}
