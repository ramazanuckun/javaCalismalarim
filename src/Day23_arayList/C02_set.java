package Day23_arayList;

import java.util.ArrayList;
import java.util.List;

public class C02_set {
    public static void main(String[] args) {

        /*elimizde urunlerin bulundugu bir liste var
        urun listesindeki istenen siradaki urunu yenisi ile degistirip
        istedi[imiz yeni urunle de[stirip,eski irini var olan eski irinler listesinie ekleyelim

         */

        List<String>urunler=new ArrayList<>();
        urunler.add("Nutella");
        urunler.add("Ikram");
        urunler.add("Cekirdek");
        urunler.add("Cay");

        List<String>eskiUrunler=new ArrayList<>();
        //listedeki ikram ibiskrem ile degisrtp
        //ikrami eski urunlere ekleyelim
        String yeniUrun="Biskrem";
        String silinecekUrun="Ikram";

      int temp=urunler.indexOf(silinecekUrun);
      String silinenUrun=urunler.set(temp,yeniUrun);

      eskiUrunler.add(silinenUrun);
        System.out.println("Liste:"+ urunler);
        System.out.println("Eski urunler listesi:"+ eskiUrunler);

//method ile yapmayi kacirdim dinle 21 55saat


    }



}
