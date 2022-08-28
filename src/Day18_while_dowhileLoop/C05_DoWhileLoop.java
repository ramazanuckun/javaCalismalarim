package Day18_while_dowhileLoop;

public class C05_DoWhileLoop {
    public static void main(String[] args) {

 //9 dan 190 a kadar 7 nin katlari


        int bas=9;
        int bitis=190;
        int temp=bas;

        //whike ile yapiyoruz

        while (temp<bitis){
            if (temp%7==0){
                System.out.print(temp + "");
            }
            temp++;
        }

// do while ile yapiyoruz
        System.out.println("");
        temp=bas;
        do {

            if (temp%7==0){
                System.out.print(temp + "");}

            temp++;

        }while (temp<bitis);



    }
}
