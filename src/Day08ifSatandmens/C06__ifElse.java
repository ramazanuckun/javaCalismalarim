package Day08ifSatandmens;

import java.util.Scanner;

public class C06__ifElse {
    public static void main(String[] args) {


        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen bir yıl giriniz");
        int yil=scan.nextInt();

        if (yil%4 !=0){
            System.out.println("artık yıl");
        }else if (yil%100 !=0)
        {System.out.println("artık yil");}
else if (yil%400 ==0){
            System.out.println("artik yil değil");}
else{
        System.out.println("artik yil");}



    }

    }


