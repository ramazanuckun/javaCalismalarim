package Day114_Elifhoca23temmuzCmt;

import java.util.Arrays;
import java.util.Scanner;

public class C01_ {
    public static void main(String[] args) {

      /*

   kullanıcının girdigi bir array'in en buyuk elemani ile
   en kucuk elemanının  farkını bulan bir method create ediniz.
*/

farkiniBul();

    }

    private static void farkiniBul() {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Aray uzunlugunu giriniz");

        int uzunluk=scanner.nextInt();
        int arr[]=new int[uzunluk];//dinamik yaptim uzunluk yaparak
        for (int i = 0; i <uzunluk ; i++) {

            System.out.println("Aray in "+(i+1)+".elamanini giriniz");//i oldugunda 0.elaman diyecek biz direk index degil elaman sorduk
            //index degil elaman uzerunden cozum yapiyoruz
            arr[i]=scanner.nextInt();           //for i den gelen elaman index kullanici tarafindan girilen elamanlar okunuyor



        }

        Arrays.sort(arr);//array i sraladim ilk elaman en kucuk

        System.out.println("Aray deki en buyuk elaman ile en kucuk elaman fark:"+( arr[uzunluk-1]-arr[0]));

        //odev"bu soruyu Matc class i kulnarak cozunuz

    }


}
