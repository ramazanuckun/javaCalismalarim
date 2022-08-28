package Day25_consructor;

public class C03 {
    /*
    proje olustrulurken icin bazi classlar run etmek icin
    degil variable ve method olusrutup bunlari baska claasslardan kulanmak icin  olusturulur
     *///main method yok run tusu yok//kaliphane depolama yeri//buyuk projeler boyledir

    /*
    gorunurde constructer yok fakat defalt olarak var parametresizdir ihtiyac oldugunda calisir
    acayip kiskanctir bu class ta parametreli veya parametresiz bir constructer olustugunda birakair gider/java bunu siler/
    cunku bu classi olustran kisi kendi ihyacina gore olustrdu der java.
     */

    C03(){

    }//C03 constructur olmazsa olmazlari clas isimi normal prantez ve suslu prantez bizim olustrdugumuz defalt consructur ile ayni
    //fakat defalt ile ayni degil cunku biz olustrduk bu sebeble kendi yaptugunu alir gotrr.
    String isim="Etka";
    public  void method(){

        System.out.println("C03 method calistir");
    }
}
