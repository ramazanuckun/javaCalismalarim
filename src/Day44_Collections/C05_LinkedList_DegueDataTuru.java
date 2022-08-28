package Day44_Collections;

import java.util.Deque;
import java.util.LinkedList;

public class C05_LinkedList_DegueDataTuru {
    public static void main(String[] args) {


       Deque<String> ll4=new LinkedList<>();
        ll4.add("Cavidan");
        ll4.add("Mesut");
        ll4.add("Selim");
        ll4.add("Tevfik");
        ll4.add("Selim");
        ll4.removeLastOccurrence("Selim");
        System.out.println(ll4); // [Cavidan, Mesut, Selim, Tevfik]
        System.out.println(ll4.pop());
//link listin basindaki elementi silip bize dondurur
        ll4.remove();
        ll4.removeFirst();
        ll4.removeLast();
        /*
        Degue iki tarafli queue demektir dolayisyla her methodda firs ve lasrt vardir

         */




    }
}


