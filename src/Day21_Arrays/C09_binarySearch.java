package Day21_Arrays;

import java.util.Arrays;

public class C09_binarySearch {
    public static void main(String[] args) {

        /*binary search method u siralanmis aray da aranan elementin index inin dondurur
        ya aranan aray da yoksa ?
     (String s
     de indeks of bize olmayan element icin -1 dondurur)

     aranan element aray da yoksa java hem olmadigini hemde
     olsaydi nerede olacagini bize domdurur.
     olmadigini iade icin - kullanir/
     olsaydi nerede olacaginin belirtmek icin index kullanir
         */

        int[]sayilar={3,7,15,4,27,10};
        Arrays.sort(sayilar);
        System.out.println(Arrays.toString(sayilar));//siraladik//varsa sira yoksa index
        System.out.println(Arrays.binarySearch(sayilar,4));//1
        System.out.println(Arrays.binarySearch(sayilar,15));//4
        System.out.println(Arrays.binarySearch(sayilar,11));//-5
        System.out.println(Arrays.binarySearch(sayilar,6));//-3
        System.out.println(Arrays.binarySearch(sayilar,-100));//-1//var olanda index olmayanda sira diye kodla


    }
}
