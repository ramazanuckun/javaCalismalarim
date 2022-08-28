package Day42_abstractClass_interfaces;

public interface I03_Interface {

int  SAYI=20;


   /* int sayi;

    yukaridaki calismaz tum variableler puplic static ve final dir
    dolayisiyla deger atama sansimiz yok tur.Bunun icin variablar olus
    turdugumuzda mutlaka deger atamam yapmaliyiz.

    Inheritance kullanmiyoruz implement yapmaliyiz.Denedil olmuyor.
    Bir interfaces bir class i parend edinemez.

    */
    /*buraya bir method yazdigimizda



     */
    void  yakit();
    //puplic,static,void ozellilere sahiptir
    //yazmasakta olur var kabul eder
     public void motor();

     public abstract void teker();//gri yapilanlari
   // diyor yazmana gerek yok ben aliyorum diyor
    //abstract bir method un bady si olamsi mumkun degil
    //java devolaper larin istegi uzerine uptop yapmistir.
    //Bir interfaces soradan bir abstract method eklerseniz'
    /*
    o interfaces daha once implement etmis tum class lara gidip
    hepsini override etmemiz gerekir
    buda eskiden gelen projeler icin zor bir islemdir.
    buda java 8 den sonra interface lerebody si olan method eklemeye izin vermistir
    bu methodlara concerete method denmez/bu methodlara istisna method denir

     */


     public static void aku(){}

    /*yukaridaki static nedirki hembady olustrmamam izin veriyor
    hemde hem basa hem ortaya koyabiliyorum
     */


}
