package ZDay13_interwiev;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q06 {
    public static void main(String[] args) {


        List<Integer>fobo=new ArrayList<>();
        Scanner scan=new Scanner(System.in);
        System.out.println("sayi sur namluya oda olsun fibo");
        int sayi= scan.nextInt();
        fobo.add(0);
        fobo.add(1);
        System.out.println(fobo);

     int i=1;

     if (sayi<=1){


         System.out.println("daha buyuk sayi igir");
     }else {
         while (fobo.get(i)<sayi){
             fobo.add(fobo.get(i)+fobo.get(i-1));i++;

         }
         System.out.println(fobo);

     }
int sonIndex=fobo.size()-1;
     if (fobo.get(sonIndex)>sayi){
         fobo.remove(sonIndex);
         System.out.println(fobo);
     }else System.out.println(fobo);

    }
}
