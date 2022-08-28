package dAY41_abstractClass_Interface;

import java.util.ArrayList;
import java.util.List;

public class HA160 extends FMercedes{

    /*
    mercedes abstract olmadigi icin zaten override edip hepsini aldigi icin burada implemt etme
    zorunda kalmadi Ha160 classs-----toyota ooyle degildi mercedes iyi bir baba cocuklarina isbirakmadfi diyebilrmiyiz
    hersey hazir geldigi icin cocuk ilemeyebilir buda sermayeden yemek oioablir
    ikisininde arti ve eksileri var

     */

/*
Abstract silsilesinden gelen ilk concrete class parent iolan tum class taaki abstract methodlari override etmek zorundadir
 */
public  static void main(String[]args){


    HA160 arb1=new HA160();
    //concrete bir classta istenilen obje olusturlabilir

    FMercedes arb2=new FMercedes();
    //concrete bir classta istenilen obje olusturlabilir
  //  EToyota araba3=new EToyota()
    EToyota araba4=new GCorolla();
    //  ;olusturamadik-----cunku abstract class lar constructer barindirir
   // ama obje uretemezler
    //toyota classi abstracter class oldugu icin ibje uretilemez
  /*  List<String>list=new List<>();//abstract oldugu icin obje uretemez childi olan dan yardim alir

    List<String>list2=new ArrayList<>();
    Abstract bir class ozelliklerini tasiyan bir obje istedigimnizde data turunu istenilen abstra class
    constractri ise child olan bir concrete bir classtan seceriz yukarida yaptik e toyota uzerinden yaptik

   */


}


}
