package Day18_while_dowhileLoop;

import java.util.Scanner;

public class C11_odevSlayt5 {

    public static void main(String[] args) {


        Scanner scan=new Scanner(System.in);
        System.out.println("sayi giriniz");
        int sayi= scan.nextInt();

        int carpim=sayi;
        int carpimTaplosu=1;


while (sayi*sayi>=sayi*10)
{
    System.out.print(sayi*sayi+ " ");
}
        carpimTaplosu*=sayi;
    }

}
