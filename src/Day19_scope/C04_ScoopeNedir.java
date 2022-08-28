package Day19_scope;

public class C04_ScoopeNedir {

    static  int sayi=5;//static
    String ders="Java";//instins

    public static void main(String[] args) {


sayi=100;//static oldugu icin her yerde kullanilabiliyor
//   System.out.println(ders);//ders="java course";//instins variable oldugu icin static kulubu kullanamadi


    }
    public void StaticOlmayanMethod(){
sayi=5;
        System.out.println(ders);


    }
}
