package Day27_staticKeyworld;

public class C01 {




    static  int sayi=10;
    int rakam=5;

    public static void main(String[] args) {


         /*
        class level'da iki tur variable olusturabiliriz
          static (class) variable
          instance (obje) variable
        static variable'lar tum class'tan kullanilabilirken
        instance olanlar sadece static olmayan method'larda direk  kullanilabilir
        instance variable'lara static method'dan ulasmak istersek
        obje olusturmamiz gerekir.
        instance variable'lar obje variable'i oldgu icin
        herhangi bir satirda instance variable'in degerinin ne oldugunu bulmak icin
        OBJE OLUSTURULAN SATIRDAN itibaren kod incelenmelidir.
        static variable'lar class variable'i oldugu icin
        herhangi bir satirda static variable'in degerini bulmak icin
       CLASSIN BASINDAN itibaren kod incelenmelidir.

       static class ta takip
       instance icin obje ile ilgili

       
       https://www.youtube.com/watch?v=4Zikl8dBqdc
         */



        System.out.println(sayi);

        C01 obj1=new C01();
        System.out.println("obj in rakam degeri:"+obj1.rakam);//5 deger atamasi yapilmadi icin instans degeri gtrr
        System.out.println("obj1 in sayi degeri:"+sayi);//10

        obj1.rakam+=1;
        sayi+=1;
        System.out.println("1 artiktan sonra obj1 in rakam degeri"+obj1.rakam);//6
        System.out.println("1 artiktan sonra obj1 in rakam degeri"+sayi);//11

        C01 obj2=new C01();


        System.out.println("obj2 in rakam degeri"+obj2.rakam);//5//deger atamasi yapilmadigi icin  islem yapilan i almaz
        System.out.println("obj2 in sayi degeri"+sayi);//static oldugu icin sayi//islem yapildiktan sonraki geldi

        obj2.rakam++;
        obj2.sayi++;
        System.out.println("1 artiktan sonra obj2 in rakam degeri" + obj2.rakam);//6
        System.out.println("1 artiktan sonra obj2 in rakam degeri" + sayi);//12//toplaya toplaya geliyor
    }
}
