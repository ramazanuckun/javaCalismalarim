package Day31_timeFormatter_varargs;

public class C03_VarargsIleToplama {
    public static void main(String[] args) {

        //verilen kac sayi olursa olsun
        //hepsinin toplayip yazdiran bir method olustrun

        int sayi1=10;
        int sayi2=20;
        int sayi3=30;
        int sayi4=50;
        int sayi5=60;
        toplaYazdir(sayi1,sayi2,sayi3,sayi4,sayi5);
        toplaYazdir(sayi1,sayi2,sayi3,sayi4);
        toplaYazdir(sayi1,sayi2,sayi3);
        toplaYazdir(sayi1,sayi2);
    }
    public  static  void toplaYazdir(int...sayi){ //sayi  dan once 3 nokta varangs methohodu turkcesi degisken sayidaki argumant

/*
int ... sayi bu gosterim integir variable lardan olusan bir varargs demektir
varargs aray alt yapisini kullanir
 */
int toplam=0;
int sayiAdeti= sayi.length;

        for (int each:sayi
             ) {
            toplam+=each;
        }
        System.out.println("Girilen"+sayiAdeti+ " sayilarin toplami"+ toplam);
    }
}
//