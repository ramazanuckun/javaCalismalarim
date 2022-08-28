package Day07_ifStaternnes;

import java.util.Scanner;

public class C03_ifStatements {
    public static void main(String[] args) {

        /*bir if statement da {kullanılmazsa java lik satırı sart ile baglar,sonraki satırlar bağımsız olur

         */
        int sayi = -20;

        if (sayi > 0)
            System.out.println("sayı pozitif");
        System.out.println("pozitif kalacaktır");

        if (sayi % 2 == 0)
            System.out.println("sayı çift");
        System.out.println("çift kalacaktır");
        if (sayi % 5 == 0)
            System.out.println("sayı 5 in katı");


        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen b.r tam sayı giriniz");
        Integer ınt=scan.nextInt();




if (sayi %2==0)
{
    System.out.println("sayi çift");
}        else{
    System.out.println("sai tektir");
}








    }
}
