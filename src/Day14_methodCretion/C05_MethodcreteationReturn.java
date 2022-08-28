package Day14_methodCretion;

import java.util.Scanner;

public class C05_MethodcreteationReturn {
    public static void main(String[] args) {
  /*
          Eger bir class'in icerisinde herhangi bir hesaplama yapip
          bunu da kalici olarak saklamak istersek
          kodumuzu sade ve anlasilir tutmak icin
          islemi bir method'da yapip
          sonucunu main method'a dondurebiliriz
          Return type'i void olmayan bir method'un sonucunu
          main method'da bir variable'a atama yaparsak
          programin geri kalaninda bu yeni degeri kullanma sansimiz olur
         */
        // kullanicidan sehir ismini ve dogum tarihini alip
        // bunlari programda kullanacagimiz formatta bize donduren bir method olusturun
        // Sehir ismini programimizda buyuk harf olarak,
        // tarihi ise 2022-06-30 seklinde kullanmak istiyoruz




        /*
eger bir clasın icerisinde herhangi bir hesaplama yapıp bunuda saklamak
 istersek kodumuzu sade ve anlaşılır turmak için islemi bir
methodda yapıp sonucunu main method a döndürebiliriz.return type i void olmayan bir methoun sonucunu  main
 */
        //kullanıcıdan sehir ismini,ve dogum tarihini alın
        //bunları programda kullanacagımız formatta bize döndüren
        //sehir ismin programımızda buyukharf olarak
        //tarihi ise 2022-06-30 seklınde kullanmak istiyoruz

        String sehir=sehirAl();

        String tarih=tarihAl();
        System.out.println("Girdiğiniz sehir:"+sehir);
        System.out.println("Girdiğiniz tarih:"+tarih);

    }

    public static String tarihAl() {
String tarih="";
        Scanner scan=new Scanner(System.in);
        System.out.println("yıl giriniz");
        int yıl= scan.nextInt();
        if (yıl>1900&&yıl<2100){tarih=yıl+"-";}else{ System.out.println("lütfen gecerli bir sayı yazmalısınız");}
        System.out.println("kacıncı ay oldugunu tam sayı olarak yazınız");
        int ay= scan.nextInt();
        if (ay<=0 || ay>12){
            System.out.println("Ay no 1-12 arasında olmalıdır");
        } else if (ay<10) {tarih=tarih+"0"+ay+"-";

        }else {tarih=tarih+ay+"-";}


        System.out.println("Lütfen ayın kacıncı günü oldugunu tam sayı olarak giriniz");
        int gun= scan.nextInt();

        if (gun<=0||gun>31){
            System.out.println("gün 1 ile 30 arasında bir sayı girilmelidir");

        } else if (gun<10) {tarih=tarih+"0"+gun;

        }else {
           tarih=tarih+gun;
        }

return  tarih;
    }

    public static String sehirAl() {

        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen sehir adı giriniz");
        String sehirAl = scan.next().toUpperCase();

        return sehirAl;
    }
}
