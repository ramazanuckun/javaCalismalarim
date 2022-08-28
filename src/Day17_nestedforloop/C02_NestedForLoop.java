package Day17_nestedforloop;

public class C02_NestedForLoop {
    public static void main(String[] args) {

        //verilen sayiya gore carpim taplosu
        /*
        input 3
        123
        246
        369

         */

        //dikdortgenmi /ucgenmi olacak foorloop
int input=4;

        for (int i = 1; i <= input; i++) {
            for (int j = 1; j<=input; j++) {

                System.out.print(i*j+ " ");

            }
            System.out.println("");
        }




    }
}
