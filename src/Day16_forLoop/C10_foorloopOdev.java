package Day16_forLoop;

import java.util.Scanner;

public class C10_foorloopOdev {
    public static void main(String[] args) {
//100den kucuk sayi iste,1 den basla 3 un kati olanlari yazdir
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen 100 den kucuk bir sayi giriniz");
        int sayi=scan.nextInt();



if (sayi<100 ){
        for (int i = 1; i <=sayi ; i++)if (i==1||i%3==0)
            System.out.print(" "+ i);

        }else System.out.println("olmaz");}}









