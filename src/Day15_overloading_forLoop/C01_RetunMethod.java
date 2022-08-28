package Day15_overloading_forLoop;

public class C01_RetunMethod {
    public static void main(String[] args) {

        //verilen iki sayıyı carpıp
        //sonucu bize döndüren bir method olusturun

        int sayi1=10;
        int sayi2=5;
        int sonuc=carpGetir(sayi1,sayi2);

        System.out.println("sonuc:"+sonuc);
        //verilen iki sayıyı carpıp
        //sonucu bize döndüren bir method olusturun

        int sayi11=10;
        int sayi22=5;
        int sonucc =carpGetir(sayi11,sayi22);


    }

    private static int carpGetir(int sayi11, int sayi22) {

        int sonucc=sayi11*sayi22;
        return sonucc;



    }


}
