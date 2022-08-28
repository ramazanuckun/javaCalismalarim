package Day21_Arrays;

import java.util.Arrays;

public class C11_egualsEsitmi {
    public static void main(String[] args) {

        //sort ile esitle
        //eguals ile calistir
        //sonucu bul

int[]sayi1={1,2,3,4,5,8};
int[]sayi2={1,2,3,4,5,8};
        Arrays.sort(sayi1);
        Arrays.sort(sayi2);
        System.out.println(Arrays.equals(sayi1,sayi2));
    }
}
