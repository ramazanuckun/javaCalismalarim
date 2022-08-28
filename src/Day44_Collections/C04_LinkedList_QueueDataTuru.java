package Day44_Collections;

import java.util.LinkedList;
import java.util.Queue;

public class C04_LinkedList_QueueDataTuru {
    public static void main(String[] args) {

        Queue<String>ll3=new LinkedList<>();

        ll3.add("Ebubekir");
        ll3.add("Omer");
        ll3.add("Osman");
        ll3.add("Ali");
//Queu kuyruk demektir sira onemlidir
        //gelen sona gelir giden bastan gider
        System.out.println(ll3);//[Ebubekir, Omer, Osman, Ali]

        System.out.println("ll3.remove() = " + ll3.remove());//ll3.remove() = Ebubekir
        System.out.println(ll3);//giden bastan gider gelen sona gelir//[Omer, Osman, Ali]
ll3.remove("Ali");//obje ismine dayali silme
        System.out.println(ll3);//[Omer, Osman]

        System.out.println("ll3.element() = " + ll3.element());//Omer
        System.out.println("ll3.peek() = " + ll3.peek());// Omer
//peek ve element silmeden ilk elementi bize dondurur.aralarindaki fark bos liste olursa
        //ilk nulll doner peek.element exenpsion doner

        System.out.println("ll3.offer() = " + ll3.offer(" Ebu Ubeyde Bin Cerrah"));//true
        System.out.println(ll3);//[Omer, Osman,  Ebu Ubeyde Bin Cerrah]//offer sonuna ekleme yapiyor
        System.out.println("ll3.poll() = " + ll3.poll());//Omer
        System.out.println(ll3);//[Osman,  Ebu Ubeyde Bin Cerrah]














    }
}
















