package day01_variables;

public class C02_Swap {
    public static void main(String[] args) {
        //s1 ve s2 yi kova örneği ile yer değisrime

        int sayi1=10;
        int sayi2=20;
        int sayi3=0;

        sayi3=sayi2;//10  20  20

        // adım 2-1.sayıy 2.sayıya atayacağız
        sayi2=sayi1; // 10   10   20
         //adım 3 - boş kovadaki sayıyı sayı1 e atayalım
        sayi1=sayi3;
        System.out.println(" swap dan sonra sayi1:"+sayi1);//20
        System.out.println("swap dan sonra sayı2:"+sayi2);//10

    }
}
