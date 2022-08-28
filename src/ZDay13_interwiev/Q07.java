package ZDay13_interwiev;


import java.util.Scanner;

public class Q07 {
    public static void main(String[] args) {

        /*

//  Kullanicidan toplanmak uzere sayilar isteyin
// sayi adedi 10'u gecerse veya toplam 500 'u gecerse
// bu kadar sayi yeter
// ".. adet sayi girdin, toplami..." yazdirin

 */


      Scanner scan=new Scanner(System.in);
        int sayi= scan.nextInt();
        int adet=0;
        int toplam=0;
    while (sayi<=10){


toplam+=sayi;
adet++;
        }
        System.out.println(toplam);



    }
}
