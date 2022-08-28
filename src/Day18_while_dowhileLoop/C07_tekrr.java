package Day18_while_dowhileLoop;

public class C07_tekrr {
    public static void main(String[] args) {


      /*
       3 ten 13 e kadar tam sayilar

         */

        int bas=3;
        int son=131;
        int temp=bas;

        while (temp<=son){

            if (temp%2!=0){
                System.out.print( temp+ ",");
            }temp++;

        }

    }
}
