package Day05_matematikselİşlemler;

import java.util.Scanner;

public class C03_r {
    public static void main(String[] args) {
        // 4 basamaklı rakamlar toplamı

        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen 4 basamaklı pozitif bir tam sayı giriniz");
        int sayi=scan.nextInt();//5267
        int birlerBasamagı=0;
        int rakamalarToplamı=0;
        int ilkGirilenSayi=sayi;
        //Şu anda sayı 5267 bb:0 rk.0
        birlerBasamagı=sayi%10;//7


        rakamalarToplamı +=birlerBasamagı;
        
        sayi/=10;
        
        //şu anda sayi526 bb 7   rt  7
        
        birlerBasamagı=sayi%10;//  bb  6
        rakamalarToplamı +=birlerBasamagı;//7+6=13
      
        sayi/=10;  //su anda sayı 52   bb 6   rt  13
        
        birlerBasamagı=sayi%10;//2
        
        rakamalarToplamı+=birlerBasamagı;//13+2=15
        
        sayi/=10;//5
        
        //su anda sayı 5 bb  2   rt 15
        
        birlerBasamagı=sayi%10;//5
        
        
        rakamalarToplamı+=birlerBasamagı;//15+5=20
        
        
        sayi/=10;//0
        
        
        //su anda sayı artık sıfır bb   5  rt  20



        System.out.println(ilkGirilenSayi +"sayının rakamlar toplamı:"+rakamalarToplamı);

    
    
    
    
    
        
    }
}
