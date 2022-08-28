package Day16_forLoop;

import java.util.Scanner;

public class C11_forloopOdev {
    public static void main(String[] args) {
//100 den kucuk sayi gir 3 un kati 5 in kati yazdir

        Scanner scan=new Scanner(System.in);
        System.out.println("sayi");
        int sayi= scan.nextInt();
        if (sayi>0 && sayi<=100 && sayi%3==0){
            for (int i = 0; i <=sayi ; i++) {
                System.out.println("i = " + i);
                
            }
          
        } else if (sayi%5==0) {
            for (int i = 0; i <=sayi ; i++) {
                System.out.println("i = " + i);
                
            }
            
        } else if (sayi%3==0&&sayi%5==0) {
            for (int i = 0; i <=sayi ; i++) {
                System.out.println("i = " + i);
                
            }
            
        }


    }
}
