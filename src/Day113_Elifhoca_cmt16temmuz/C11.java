package Day113_Elifhoca_cmt16temmuz;

import java.util.Scanner;

public class C11 {
    public static void main(String[] args) {


        // STRING OLAN PIN kodunuzu kontrol eden bir kod yazınız.

        String pin="mehmet.1234";
        int girisHakki=3;
        Scanner scanner=new Scanner(System.in);
        System.out.println("hosgeldiniz");
        while (true){
            System.out.println("pin kodu giriniz");
            String girilenPin=scanner.nextLine();
            if (pin.equals(girilenPin)){
                System.out.println("basarili");
                break;
            }
            else {
                System.out.println("yanlis");
                girisHakki--;
            }
            if (girisHakki==0){
                System.out.println("telefon bloklandi hak klmdi");
                break;//break yazmazsak dongu devam eder sormaya devam eder surekli dogru olursa kod kirilmaz

            }
        }


    }
}



