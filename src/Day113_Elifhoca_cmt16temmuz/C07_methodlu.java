package Day113_Elifhoca_cmt16temmuz;

import java.util.Scanner;

public class C07_methodlu {
    public static void main(String[] args) {


     /*
         Kullanicidan aldigimiz 8 elemanli arrayin icinde
         kac tane 3 e bolunebilen sayi vardir ?(negatif sayilar da dahil olsun)
        */


        int[]arr=new int[8];//8 elamanli dedigi icin tanimladim

        Scanner oku=new Scanner(System.in);
int count=0;//okuyucu
        for (int i = 0; i < arr.length ; i++) {
            System.out.println(i+ ".index'teki sayiyiy giriniz:");

            arr[i]=oku.nextInt();//girilen elamanlari aliyorum
            if (arr[i]%3==0){
                System.out.println(arr[i]);
                count++;
            }
        }

        System.out.println("3 e bolunebilen sayilar:"+ count);


    }
}
