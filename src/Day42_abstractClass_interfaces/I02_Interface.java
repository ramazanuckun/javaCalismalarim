package Day42_abstractClass_interfaces;

import java.util.ArrayList;
import java.util.List;

public interface I02_Interface {
int SAYI=30;

String isim="Ylildiz Koleji";
    /*
    Interface bir class degildir.
    Abstract class lar javada abstraction(soyutlaastirma/kural koyma)islevini yapiyordu
    ancak abstract bir classta abstract olmayan methodlarda olabilir.
    buda full abstraction yapmaya izin vermez eger java da hic concrete method
     olmasin dedigimiz bir class olustrmak istiyorsaniz bu nu class degil interface yapmalisiniz.
   1- interface lerde concrete method olmaz;fuull abstraction yaptigindan obj olustrulaamz/

   2-interface olan listen direk obj olustramiyorduk.

    bunun yerine constructeri listin child i olan ArayList ten seciyorduk
   3- Class larda birr child birden fazla parent edinemez
   Ancak inerface lerde method badisi omadigindan-concrete method olmadigindan biz her methodu child class ta override etmek zorundayiz.
   override ederken kimin soyledigini override ettigimizin onemi yok.
   4-interfaceler neyin yapilacagini soyler ama nasil yapilacagina karismaz
   

     */

    List<String>liste=new ArrayList<>();
}
