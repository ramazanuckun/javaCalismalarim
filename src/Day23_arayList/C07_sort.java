package Day23_arayList;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class C07_sort {
    public static void main(String[] args) {

        List<String> urunler = new ArrayList<>();
        urunler.add("Nutella");
        urunler.add("Ikram");
        urunler.add("Cekirdek");
        urunler.add("Cay");


        Collections.sort(urunler);
        System.out.println(urunler);
/*list ile gelen sort methodunda siralama ozelli[ini girmek gerekiyor
bunun yerine Collections clas indan sort methodunu kuillaniyoruz
bu method listemizi natural order'a gore siralar(dogal alfabe sirasina gore siralar)

 */

    }
}
