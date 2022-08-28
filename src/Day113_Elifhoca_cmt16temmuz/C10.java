package Day113_Elifhoca_cmt16temmuz;

import java.util.Scanner;

public class C10 {
    public static void main(String[] args) {
        /*
         * Kulanicidan alinan bir Stringin ilk ve son harfini yine kulanicidan alinan sayi kadar
         * return eden metod yaziniz
         *
         * ornek:  input            output
         *         elma  2           eaea
         *         army  3           ayayay

         */

        Scanner scanner=new Scanner(System.in);
        System.out.println("Lutfen bir string giriniz");
        String input= scanner.nextLine();
        System.out.println("lutfen bir sayi giriniz");
        int sayi=scanner.nextInt();
        ilkSonHarf(input,sayi);
        System.out.println( ilkSonHarf(input,sayi));




    }

public static String ilkSonHarf(String str, int n) {

        String s=str.substring(0,1)+str.substring(str.length()-1);//ilk ve son karakteri alip birlestrdim

        String sonuc="";

    for (int i = 0; i <n ; i++) {//0 dan baslarsa kucuk//1 den baslarsa <= demeliyiz
    sonuc=sonuc+s;//sonuc+=s de diyebiliridik

    }

        return sonuc;
    }
}