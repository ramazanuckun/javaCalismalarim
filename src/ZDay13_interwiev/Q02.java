package ZDay13_interwiev;

import java.util.Scanner;

public class Q02 {
    public static void main(String[] args) {

          /*
// Stringi ters cevirmek icin bir Java Programi yazin
//1.Yol: StringBuilder () kullanarak
//2.Yol: String Classini kullanarak
//3.Yol: Bir method olusturun, ardindan methodu main method dan cagirin
  */


        Scanner scanner=new Scanner(System.in);
        System.out.println("Tersinin istediginiz ifadeyi giriniz");
        String input="All is well";

      //  1/yo;;

        StringBuilder str=new StringBuilder();
        str.append((input));//ekleme yapar
        System.out.println("str"+ str);
        String tersInput=str.reverse().toString();//reverse ile tersine cevrilen tostring ile stringe cevrildi
        System.out.println(tersInput);

        //2.yol

        System.out.println("@.yol");


        for (int i = input.length()-1; i >=0 ; i--) {

            System.out.println(input.charAt(i));//her karakteri al yaz dediyoruz charat diyerek


        }



//q01deki  recursive methodu ille yapiniz






    }}

