package Day34_inheritance;

public class Isci extends Personel{


    /*
    Normal hayatimizda parent cocuk sahibi olmaya karar verebilir.
    Java da ise child class`lar inherid etmek istedikleri class lari kendilerine
    parent edinirler.

    Mesela isci class`ini olustrunca nelere ihtiyaci var diye dusunsek
    personel class`indaki butun methodlara ihtiyaci vardir.
    Bu durumda yeniden o methodlari olusturmak yerine personel class`ini kendimize parent
    edinebiliriz.

    Bir class`i parent edinmek icin ne yapmaliyiz.
    Bunun icin extends keyworld kullanmaliyiz.


    Bir class baska bir class`i paret edindiginde
    1-o class taki tum variable ve methodlara
    otomatik  sahip olur.
    2-parent class taki bazi ozellikleri kendine uyarlayabilir(int persNo dedik kendimize uyaladik)
    3-Paren class ta olmayan bazi yeni ozellikler olusturabilir(yeni methodlar olustrduk )
    4-fakat degistrebilir;uzerine ekleyebilir;fakat ben sunu kabul etmiyorum diyemez
     */

    int persNo=1001;
    public static void main(String[] args) {

    //daha once obje olusturduk biz isci olusturuyoruz burada.personel olusturmuyoruz

        Isci isci1=new Isci();

        System.out.println(isci1.isim);//yukaridaki extends kelimesi silindiginde kirmizi oluyor
        //extends parent secmektir.extends ile personel ebeveynini seciyor isci class `i.

        isci1.isim="Selim";

        System.out.println(isci1.persNo);//1001 yazar//once kendi claassa bakiyor burada persNo oldugu icin
        //once kendi evine bakiyor.Ayni seyler method icinde gecerli

        isci1.maas();//itiraz yok fakat extends kelimesi varsa sorun yok babamin evine giderim

        //personel class inda ne atanmissa onu bulur


    }

    public void maas(){

        System.out.println("Isciler mnimun 15 euro maas alir");//yeni method oldugu icin kendi class taki methoda gider burada



    }
    public  void ozelSigorta(){

        System.out.println("Iscilerden isteyene %50 indirimli ozel sigorta yaptirilir");
    }

}
