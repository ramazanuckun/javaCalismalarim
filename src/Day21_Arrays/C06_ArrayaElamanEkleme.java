package Day21_Arrays;

import java.util.Arrays;

public class C06_ArrayaElamanEkleme {
    public static void main(String[] args) {

        //c05 teki method u kullanarak array a elaman ekleyin


        String[]takimListesi={"Suleyman","osman"};
        String eklenecekIsim="Talha";
        takimListesi=C05_ArrayaElamanEkleme.elemanEkle(takimListesi,eklenecekIsim);
        System.out.println(Arrays.toString(takimListesi));


    }
}
