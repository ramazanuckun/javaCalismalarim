package ZDay13_interwiev;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q03 {
    public static void main(String[] args) {


        /*
  Crteate a program checks if a String is PALINDROME or not.
  If a word, phrase, or sequence that reads the same backword as forward then it is called "palindrome",
  For Example : "madam" or "nursesrun" .
  Kuulanıcının girdiği bir  String'in PALINDROME olup olmadığını kontrol eden bir method create ediniz
  polindrome :tersten okunuşu da aynı olan ifadeierdir.
  ornek : Ey edip Adanada pide ye,  Traş niçin şart
   */

        //Q02 deki cozum methodlarinin ayniai sitrng builder

/*
/*
 Kullanıcıdan alınan bir tamsayıya kadar FIBONACCI dizisi oluşturun.
 0-1-1-2-3-5-8-13-21-34....
 */

        List<Integer>fibonacci=new ArrayList<>();

        Scanner scan=new Scanner(System.in);
        System.out.println("sayi gir");
        int sayi=scan.nextInt();
        fibonacci.add(0);
        fibonacci.add(1);
        System.out.println(fibonacci);

int i=1;//while sartini olusturmak icin kullandik
if (sayi<=1)
{
    System.out.println("daha buyuk sayilar gir");
}else {

    while (fibonacci.get(i)<sayi){
//fibonacci elamanlari sayidan kucuk oldugu surece
        fibonacci.add(fibonacci.get(i)+fibonacci.get(i-1));

    i++;
}
        System.out.println(fibonacci);
    }
int sonindexElamani=fibonacci.size()-1;
if (fibonacci.get(sonindexElamani)>sayi){

    fibonacci.remove(sonindexElamani);
    System.out.println("girdigim sayi fibonacci dizisinde yoktur"+fibonacci);
}else {
    System.out.println("girdigin sayi fibonacci dizisinde vardir"+fibonacci);
}
}}
/*

//  Kullanicidan toplanmak uzere sayilar isteyin
// sayi adedi 10'u gecerse veya toplam 500 'u gecerse
// bu kadar sayi yeter
// ".. adet sayi girdin, toplami..." yazdirin

 */