package Day18_while_dowhileLoop;

import java.util.Scanner;

public class C10_odev4Slayt {
    public static void main(String[] args) {
        /*baslangic ve bitis al ve hepsini buyuk yazdir

         */



        /*
char ilkHarf='f';
char sonHarf='t';

char temp=ilkHarf;
String buyult="";


while (temp<=sonHarf){
buyult=(temp+"").toUpperCase();//cahr string yaptik cunku string guclu
    System.out.print(buyult+ " ,");
  temp+=1;


         */
        Scanner scanner=new Scanner(System.in);

    char harf1='a';
    char harf2='h';
    char tem=harf1;
    String buyult="";
while (tem<=harf2){
   buyult=(tem+ "").toUpperCase();
    System.out.print(buyult+ " ,");
    tem+=1;
}

    }
}
