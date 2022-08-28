package Day23_arayList;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class C08_eguals {
    public static void main(String[] args) {

        List<String> urunler = new ArrayList<>();
        urunler.add("Nutella");
        urunler.add("Ikram");
        urunler.add("Cekirdek");
        urunler.add("Cay");

        List<String> urunler2 = new ArrayList<>();
        urunler.add("Ikram");
        urunler.add("Nutella");
        urunler.add("Cay");
        urunler.add("Cekirdek");

        System.out.println(urunler.equals(urunler2));//false//cunlu sort yapmadik
        Collections.sort(urunler);
Collections.sort(urunler2);
        System.out.println(urunler.equals(urunler2));//kontrol et hocanin kodu ile
    }

}
