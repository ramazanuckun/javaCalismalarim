package ZDay13_interwiev;

import java.util.Arrays;

public class Q04 {
    public static void main(String[] args) {

            /*
int arr [][]={{7,12,97,23},{543,23,675},{2},{2,33,6,3,7}};
verilen Array icinde
--> kac tane eleman oldugunu return eden methodu yazdiriniz
//cevap : 13 donsun
*/
        int[] []arr={{7,12,97,23},{543,23,675},{2},{2,33,6,3,7}};


   elamanSayisi(arr);
        System.out.println(elamanSayisi(arr));
        System.out.println(Arrays.deepToString(arr));
    }

    private static int elamanSayisi(int[][] arr) {

        int sayac=0;
        for (int i = 0; i <arr.length ; i++) {//dis kamtman

            for (int j = 0; j < arr[i].length; j++) {
sayac++;

            }

        }
return sayac;
    }
}
