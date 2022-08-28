package Day16_forLoop;

public class C01_forLoop {
    public static void main(String[] args) {

        //verilen bir pozitif tam sayinin pozitif tam bolenlerini yazdirilaralim

        int input=20;

        for (int i = 1; i <=input ; i++) {if (input%i==0) {
            System.out.println(i+" ");}
        }


    }
}
