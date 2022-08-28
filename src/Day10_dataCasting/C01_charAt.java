package Day10_dataCasting;

import java.util.Scanner;

public class C01_charAt {
    public static void main(String[] args) {



        String str="java ögrenmek ne güzel";
        System.out.println(str.charAt(0));//ilk harf J
        System.out.println(str.toUpperCase().charAt(7));//R
        System.out.println(str.charAt(21));//l

        //



        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen ücgenin üc kenar uzunluğunu giriniz");
        int sayi1=scan.nextInt();
        int sayi2=scan.nextInt();
        int sayi3=scan.nextInt();

        if (sayi1==sayi2 || sayi2==sayi3){
            System.out.println("eskenar ücgen");
        }else{
            System.out.println("degıl");
        }












    }
}
