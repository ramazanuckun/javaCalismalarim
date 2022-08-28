package Day21_Arrays;


import java.util.Arrays;
import java.util.Scanner;

public class C12_tekrar {
    public static void main(String[] args) {

int sayilar[]={1,2,3,4,5,6,7,8,9,99,88,77,66,55,44,33,22,111,-5,-1,8};
Arrays.sort(sayilar);
        System.out.println(Arrays.toString(sayilar));
        int aranan=-55;

        Arrays.binarySearch(sayilar,aranan);
        System.out.println(Arrays.binarySearch(sayilar,aranan));

    }
}