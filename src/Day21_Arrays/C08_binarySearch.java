package Day21_Arrays;

import java.util.Arrays;

public class C08_binarySearch {
    public static void main(String[] args) {

        /*binary search javada ekaman aramanin kisa yoludur.
        ancak binary search calismasi icin once array sirali hale gelmesi gerekir.
        eger siralama yapmadan binary yaparsak sonucu bulamayabilir veya yanlis bulabilir.
         */
        String[]harfler={"Y","B","D","G","O","A"};
        String arananHarf="A";
        Arrays.binarySearch(harfler,arananHarf);

        //binarySearch bize aradigimiz elamanin index ini dondurur
        //array sirali olmadigi icin arama sonucunu dogru bulamayabilir.emin olmak icin once sort yapmaliyiz
        Arrays.sort(harfler);
        System.out.println(Arrays.toString(harfler));
        System.out.println(Arrays.binarySearch(harfler,arananHarf));
    }
}
