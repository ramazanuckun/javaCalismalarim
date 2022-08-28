package Day25_consructor;

public class car {


 /*
 bu claass bizim kaliphanemiz bir araba olustrmak icin ihtiyacimiz olan variable ve method laari bu class ta belirleriz.
 sonra farkli class larda araba olustrmammiz gerekirse bu class tan obje olustrup
 burada belirlenen variable ve methodlara gore arabab uretiriz


  */

    String marka="Marka belirtilmedi";//adama marka girmezse devreye gireek //null yazacagina bu yazacak
    String model="Model belirtilmedi";
    int yil;
    int fiyat;

    public void benzinliArac(){
        System.out.println("Bu arac benzinli modele sahibtir");
    }

    public  void maxHiz(int hiz){

        System.out.println("Bu araba max"+hiz+"km hiz yapar");

    }
}

