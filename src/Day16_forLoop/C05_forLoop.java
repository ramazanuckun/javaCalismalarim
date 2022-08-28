package Day16_forLoop;

import java.util.Scanner;

public class C05_forLoop {
    public static void main(String[] args) {
//iki pozitif sayi girin ve aralarindaki sayilari toplayan bir method olusturun.




        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen baslangic ve bitis degerlerini pozitif olarak girin");
int bas=scan.nextInt();
int bitis=scan.nextInt();
aralariTopla(bas,bitis);

    }

    public static void aralariTopla(int bas, int bitis) {
       int toplam=0;

        if (bas<=bitis){
            for (int i = bas; i <=bitis ; i++) {
               toplam+=i;
            }
        }else {
            for (int i = bitis; i <=bas ; i++) {

                toplam+=i;

            }
        }

        System.out.println("sayilarin toplami:"+toplam);

    }
}
