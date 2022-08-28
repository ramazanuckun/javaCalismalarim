package Day08ifSatandmens;

import java.util.Scanner;

public class C02_İfElse {
    public static void main(String[] args) {
        // Soru 7) Kullanicidan 100 uzerinden notunu isteyin.
        // Not’u harf sistemine cevirip yazdirin.
        // 50’den kucukse “D”,
        // 50 ye esit veya buyuk -60 dan kucukse “C”,
        // 60'a esit veya buyuk-80 'den kucuk “B”,
        // 80'e esit  veya  uzerinde ise “A”
        // gecersiz not girildiginde uyari verelim
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen 0 dan 100 e kadar bir rakam giriniz");
double note=scan.nextDouble(); // bu satira geldiysek nor=tumuz 0 ile 100 arasindadir
if (note<0 || note>100)
{
    System.out.println("lütfen gecerli bir not giriniz");
}else if (note<50){
    System.out.println("notunuz:D"); // bu satira geldiysek nor=tumuz 0 ile 100 arasindadir
}else if (note<60){
    System.out.println("notunuz:c"); // bu satira geldiysek nor=tumuz 60-80 arasindadir
}else if (note<80){
    System.out.println("notunuz:a"); // bu satira geldiysek nor=tumuz 80-100 arasindadir
}else {
    System.out.println("notunuz:a");  //
}






    }
}
