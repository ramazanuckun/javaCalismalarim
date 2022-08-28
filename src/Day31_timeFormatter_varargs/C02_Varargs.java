package Day31_timeFormatter_varargs;

public class C02_Varargs {
    public static void main(String[] args) {


        //Verilen 2 int. toplayip yazdirian bir method olusturun

int sayi1=10;
int sayi2=20;
int sayi3=30;
int sayi4=50;
ikiSayiToplaYazdir(sayi1,sayi2,sayi3,sayi4);
    }

    private static void ikiSayiToplaYazdir(int sayi1, int sayi2, int sayi3, int sayi4) {
        System.out.println("verilen dort sayinin toplami:"+ (sayi1+sayi2+sayi3+sayi4));


    }

    private static void ikiSayiToplaYazdir(int sayi1, int sayi2, int sayi3) {
        System.out.println("verilen  3ki sayinin toplami:"+ (sayi1+sayi2+sayi3));


    }

    private static void ikiSayiToplaYazdir(int sayi1, int sayi2) {

        System.out.println("verilen  iki sayinin toplami:"+ (sayi1+sayi2));
    }
}
//bunu yapmak icin her yeni eklenen sayida yeni method olusturdugumuz icin java varrargs diyre bir method olusturmus.bakiniz C03