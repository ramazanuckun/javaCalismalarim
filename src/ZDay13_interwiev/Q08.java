package ZDay13_interwiev;

import java.util.Scanner;

public class Q08 {
    public static void main(String[] args) {


        Scanner scanner=new Scanner(System.in);
        int toplam=0;
        for (int i = 1; i <5 ; i++) {
            System.out.println("sayi giriniz");
            int sayi=scanner.nextInt();
            if (sayi>5 && sayi<10){

                System.out.println("5 ile 10arasi deger yok");
                continue;
            }toplam+=sayi;
        }
        System.out.println(toplam);
}}
