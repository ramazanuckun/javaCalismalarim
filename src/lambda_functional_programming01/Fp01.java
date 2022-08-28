package lambda_functional_programming01;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Fp01 {
    public static void main(String[] args) {


        //1) Ardışık list elementlerini aynı satırda
// aralarında boşluk bırakarak yazdıran
// bir method oluşturun.(Structured)

       /*
        1) Lambda (Functional Programming) Java 8 ile kullanılmaya başlanmıştır.

        2) Functional Programming'de "Ne yapılacak" (What to do) üzerine yoğunlaşılır.
        Structured Programming "Nasıl yapılacak" (How to do) üzerine yoğınlaşılır.
        3) Functional Programming, Arrays ve Collections ile kullanılır.
        4) "entrySet() methodu ile Map, Set'e dönüştürülerek Functional Programming'de kullanılabilir.

                */



        List<Integer> liste = new ArrayList<>();
        liste.add(8);
        liste.add(9);
        liste.add(131);
        liste.add(10);
        liste.add(9);
        liste.add(10);
        liste.add(2);
        liste.add(8);
        System.out.println(liste);listElamanlariniYazdirStructured(liste);
        listElamanlariniYazdirFunctional(liste);

        ciftElamanlariYazdirStructured(liste);//each ile

        ciftElamanlariYazdirFunctional(liste);//filter ile

        tekElamanlarinKareleriniYazdirFunctional(liste);//map ile

        tekrarsizTekElamanlarinKupleriniYazdirFunctional(liste);//distinc ile tekrrlananlar elendi unige oldu

        tekrarsizCiftElemanlarinKareToplami(liste);
        System.out.println();
        tekrarsizCift(liste);
        System.out.println();
        getMaxelaman(liste);
        System.out.println();
        enKucukElamanOdev(liste);
        System.out.println();
        getMaxelaman02(liste);
        System.out.println();
        getyedidenBuyukMinumun(liste);
        System.out.println();
        getYedidenBuyukCiftMin2(liste);
        System.out.println();
        getYedidenBuyukCiftMin3(liste);
        System.out.println();
        getTersSiralamaylaTekrarsizElamanlarinYarisi(liste);

    }
    public static void listElamanlariniYazdirStructured(List<Integer>list){

        for (Integer w:list
             ) {
            System.out.print(w+" ");

        }

        System.out.println();
    }
    //1) Ardışık list elementlerini aynı satırda
// aralarında boşluk bırakarak yazdıran
// bir method oluşturun.(Structured)
        public static void listElamanlariniYazdirFunctional(List<Integer>list){

                            list.stream().forEach(t-> System.out.print(t+" "));//t bir sembol baska bir ism de konabilir//8 9 131 10 9 10 2 8
                    /*
                    stream alip akislarin icnde kullanilabilecek
                    hale getiriyor .listen alinan elemetler for each ulasabilmek icin kullanabilyor
                     *//*
                     SHEP ILE ILERI TAB ILE GERI ALINIR SECILEN BOLUM YUAKARIYI ILERI ALDIM
                     GERI ALAMADIM TAB TUSUNU BILEMEDIGIM ICIN EVDE CALIS

                     */

            System.out.println();
                        }
    //1)  CIFT list elementlerini aynı satırda
// aralarında boşluk bırakarak yazdıran
// bir method oluşturun.(Structured)




















    public  static void ciftElamanlariYazdirStructured(List<Integer>list){


        for (Integer w:list   //cift elamanlari foreachden cekecegiz
             ) {

            if (w%2==0){//true ise w yazdiriliyor //method isimi

                System.out.print(w+" ");//8 10 10 2 8 //nsil yapilir
            }

        }
        //2)  CIFT list elamanlarini aynı satırda
// aralarında boşluk bırakarak yazdıran
// bir method oluşturun.(Structured)
        System.out.println();
    }
public  static void ciftElamanlariYazdirFunctional(List<Integer>list){//list==istedigin ismi ver

        list.stream().filter(t->t%2==0).forEach(t-> System.out.print(t+ " "));//filter filtreleme sadece 2 ye bolunenler alinacak
//8 10 10 2 8

//eger lamda bir method olusrdu ise onu kullanin kendiniz olustrmayin
//(List<Integer>list) buraya bir list koymadik method ne ile alisacak onu belirttik
    //functional
    System.out.println();
}

    //3) Ardışık tek list elementlerinin karelerini aynı satırda aralarında
    // boşluk bırakarak yazdıran
    // bir method oluşturun.(Functional)//


    //(Functional) demek her sey methodlar ile yapilamli

    public static void tekElamanlarinKareleriniYazdirFunctional(List<Integer>list){


        list.stream().filter(t->t%2!=0).map(t->t*t).forEach(t-> System.out.print(t+" "));
    //map== degerleri degistren bir methoddur(eski map ile alakasi yok)
        // eger degisecekse bu method kullanilir
      //  81 17161 81 map methodu ile hersey kolay
        System.out.println();
    }

    //4) Ardışık tek list elementlerinin küplerini
    // tekrarsız olarak aynı satırda aralarında boşluk
    // bırakarak yazdıran bir method oluşturun.

    public static void tekrarsizTekElamanlarinKupleriniYazdirFunctional(List<Integer>list){
//dicdinc basa almak bile kod daha hizli hale geryor
        list.stream().distinct().filter(t->t%2!=0).map(t->t*t*t).forEach(t-> System.out.print(t+" "));
        //distinct==tekrarlanan elamanlari alma demek nasil yaptigimizi degil ne yapacagimiza odaklaniyor
    }
    //5) Tekrarsız çift elemanların karelerinin toplamını hesaplayan bir method oluşturun.
    public static void tekrarsizCiftElemanlarinKareToplami(List<Integer> list){

        Integer toplam = list.stream().distinct().filter(t->t%2==0).map(t->t*t).reduce(0,(t,u)->t+u);

        System.out.println(toplam);
}
//6) Tekrarsız çift elemanların küpünün çarpımını hesaplayan bir method oluşturun.

public static void tekrarsizCift(List<Integer>list){

       Integer carpim= list.stream().distinct().filter(t->t%2==0).map(t->t*t*t).reduce(1,(t,u)->t*u);
    System.out.println(carpim);

}
//7 List elemanları arasından en büyük değeri bulan bir method oluşturun.
//1.yol
    public static void getMaxelaman(List<Integer>list){

    Integer max=    list.stream().distinct().reduce(Integer.MIN_VALUE,(t,u)->t>u ? t:u);
        System.out.println(max);

    }
//2.yol public static void getMaxelaman

    public static void getMaxelaman02(List<Integer>list){


      Integer max=  list.stream().distinct().sorted().reduce(Integer.MIN_VALUE,(t,u)->u);
                //sorted==siralama methodu sort gibi
        //reduce==isnenileni verme methodu secme
        System.out.println(" 2.yol max = " + max);

    }
    ////Ödev
    //    //8)List elemanları arasından en küçük değeri bulan bir method oluşturun.(2 Yol ile)

    public static void enKucukElamanOdev(List<Integer>list){

        Integer enkucuk=     list.stream().distinct().reduce(Integer.MAX_VALUE,(t,u)->t<u? t:u);
        System.out.println("evvvvvv"  +enkucuk);


    }

    //9) List elemanları arasından 7'den büyük, çift, en küçük değeri bulan bir method oluşturun.

public static void getyedidenBuyukMinumun(List<Integer>list){

      Integer min=  list.stream().distinct().filter(t->t%2==0).filter(t->t>7)
              .reduce(Integer.MAX_VALUE,(t,u)->t<u ? t: u);

    System.out.println("min = " + min);


}
//2.yol
public static void getYedidenBuyukCiftMin2(List<Integer>list){
//reverse==tersten siralam

    Integer min=list.stream().distinct().filter(t->t%2==0).filter(t->t>7)
            .sorted(Comparator.reverseOrder()).reduce(Integer.MAX_VALUE,(t,u)->u);//bu methodda he hep sonuncuyu alir t ve u hep max degerden kucuk olacagi icin sistem isler

//(Comparator.reverseOrder())=class ismi ile cagrildigi icin static bir method ve tersten siralar en basta en buyuk
    System.out.println(min);

}
//3.yol
    public static void getYedidenBuyukCiftMin3(List<Integer>list){

        Integer min=list.stream().filter(t->t%2==0).filter(t->t>7).sorted().findFirst().get();
        System.out.println("find first ile"+min);  }

  //  findFirst().get()==1.yi bulur siralamada


/*
  //10) Ters sıralama ile tekrarsız ve 5'ten büyük
  elemanların yarı değerlerini(elamanın ikiye bölüm sonucunu)
  bulan bir method oluşturun.
​
 */

   public static void getTersSiralamaylaTekrarsizElamanlarinYarisi(List<Integer>list){

       //bu soruda elamanlarin yari degerleri bulunduktan sonra elamalari yazdirmayi istedigi
       //icin diger sorulardan farkli olarak bir list olustrmamiz gerekiyor bulunan degerleri yazdiracagimiz
       //bunun icin methodumuz ise
         //collect(Collectors.toList=list olustrma methodu
       //2.0 derken bolumu douple olarak sonuc istedigimizi ifade ediyoruz


       List <Double>sonuc=list.stream().distinct().filter(t->t>5).map(t->t/2.0)
               .sorted(Comparator.reverseOrder()).collect(Collectors.toList());
       System.out.println(sonuc);



   }

}
