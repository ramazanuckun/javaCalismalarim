package lambda_functional_programming01;

import java.util.stream.IntStream;

public class Fp04 {
    public static void main(String[] args) {



     //colections ile calisir range
        System.out.println(getyedidenYuzeToplam());
        System.out.println(get7den100eToplam02());
        System.out.println(get2den11eCarpim());
        System.out.println(faktoriyelHesapla(4));
        System.out.println(ikiSayiArasiCiftSayilarinToplami(2,5));
        System.out.println(verilenikiSayiarasindkiSayilarinRakamlarToplami(23,32));
    }
    //1) 7'den 100'e kadar integer değerlerinin
// toplamını bulan bir method oluşturun.

    public static int getyedidenYuzeToplam(){
        //belirili bir aralik kullanacagim cunku list yok elimde

    return     IntStream.//colections gibi teker teker aliyor
            range(7,101).reduce(0,Math::addExact);//belirli bir aralaik demek range
        //istersen sonuna get koy baslangic degeri koyma

    }
    //2.yol
    //2. Yol
    public static int get7den100eToplam02(){
        return  IntStream.rangeClosed(7,100).reduce(Math::addExact).getAsInt();
}
    //2) 2'den 11'e kadar integer değerlerinin çarpımını
    // bulan bir method oluşturun.
public static int get2den11eCarpim(){

        return IntStream.range(2,11).reduce(Math::multiplyExact).//multiply methodu math clasindaki carma methodu
                getAsInt();

}
    //3) Verilen bir sayının faktoriyelini hesaplayan bir method oluşturun. (5 factorial = 1*2*3*4*5  ==> 5! = 1*2*3*4*5)

    public static int faktoriyelHesapla(int x){



            if(x>=0){
                return IntStream.rangeClosed(1,x).reduce(Math::multiplyExact).getAsInt();
            }
            System.out.println("0'dan büyük değer giriniz");

            return 0;
}
    //4) Verilen iki sayı arasındaki çift sayıların
    // toplamını bulan bir method oluşturun.

    public static int ikiSayiArasiCiftSayilarinToplami(int x,int y){

        int z=0;
     if (x>y){
    z=x;
    x=y;
    y=z;

}
    return IntStream.rangeClosed(x,y).
            filter(Utils::ciftElamanlariSec).
          sum();//sum toplama methodu


    }
    //5) Verilen iki sayı arasındaki tüm sayıların rakamlarının
    // toplamını hesaplayan bir method oluşturun.
    //  23 and 32 ==>
    //  2+3  +  2+4  +  2+5  +  2+6  +  2+7  +   2+8  +   2+9  +   3+0  +   3+1  +   3+2 ==> 68

    public static int verilenikiSayiarasindkiSayilarinRakamlarToplami(int x,int y){
 int z=0;
        if (x>y){ //eger x y den buyukse yerlerini degistr diyorum
            z=x;
            x=y;
            y=z;

        }
      return   IntStream.rangeClosed(x,y).map(Utils::rakamlarToplamiAl)//insstream formatinda sum yapinca rakamalar toplamini toplamini alacagim
              .sum();//

    }

}
