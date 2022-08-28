package day20_Arrays;

import java.util.Arrays;

public class C06_ArrayTekrr {
    public static void main(String[] args) {


int sayi5[]=new int[6];
int sayi3[]={5,6,8,10};
        System.out.println(Arrays.toString(sayi3));

//sayilar datalar icin  0 ,boolean icin false,char icin '',String icin null degerlerini n java biz atamaz isiek atar

// array olustrulurken
  /*      1-hangi data turu olacagi
                2-uzunlugu
                        3-bir data olusturlduktan sonra silme ya da ekleme yapilamaz,
                        ici  upday edilebilir fakat icindeki toplam deger sayisi degistirlemez
                        java da new yewni demek eskiyi cope atmak tir

   */             //      int sayi5=new  int[4];yaptigimizda yeni degert tamasi yapmis olsak gibi gorunsekte eski degerleri cope atiyor
        //yeni bir sinif aciyoruz//arrayi uzunlugu degistirilemez bu array in en cok elestirilen ozelligidir.
/* 4-----int sayi3[]={5,6,7,8,10};

 */
       // int sayi3[]={3,4,5,6,7,8,9};index odan baslar index 6=9 olur index [2]=dersek 2.karaktere 2 degerini atar

        sayi3[2]=4;
        sayi3[0]=1;

/*yazdirma:array non -primitive bir data{obje}dir ve cogu non-primitive data gibi array lar direk yazdirilamaz.ancak
java nin  olusturdugu arrays class indan yardim alinarak yazdirilabilir
 */
        System.out.println(Arrays.toString(sayi3));

        /*Array elemalarini yazdirmak icin asagida oldugu gibi yazdirabiliriz
        String,int ... gibi fakat array inide array var ise direk yazdirilamaz farkli method lardan yardim almak gerekir

         */

        System.out.println(sayi3[2]);//8
        System.out.println(sayi3[1]);//6
        //Array iString e cevirmek
        String str="Java cok guzel";
       String[]kelimeler= str.split(" ");
        System.out.println(Arrays.toString(kelimeler));//java,cok,guzel //parcalanan string yok edilerek istenen parca elde edilir
        String[]kelimeler2= str.split("a");
        System.out.println(Arrays.toString(kelimeler2));//[J, v,  cok guzel]
        String[]kelimeler3= str.split("cok");
        System.out.println(Arrays.toString(kelimeler3));//[Java ,  guzel]

        String[]kelimeler4= str.split("");
        System.out.println(Arrays.toString(kelimeler4));//[J, a, v, a,  , c, o, k,  , g, u, z, e, l]

    }
}
