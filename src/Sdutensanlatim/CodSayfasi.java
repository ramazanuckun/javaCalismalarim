package Sdutensanlatim;

import java.io.FileInputStream;
import java.util.Scanner;

public class CodSayfasi {
    public static void main(String[] args) {

        girisSayfasi();
        
        
    }

    private static void girisSayfasi() {
        Scanner scanner=new Scanner(System.in);

        System.out.println("Aciklama icin 1 i ;oyun 2 yi giriniz");
        char giris=scanner.nextLine().charAt(0);
        
        switch (giris){
            
            case '1':
                aciklamaGetir();
                break;
            case '2':
                break;
            default:
                System.out.println("Yanlis deger girdiniz");
            
            
            
        }
        
        
    }

    private static void aciklamaGetir() {
      int n;
        FileInputStream fis=null;
        


    }


}
