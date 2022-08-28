package Day23_arayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C09_ArraydanListYapmak {
    public static void main(String[] args) {
        /*list ile yapmanin en kotu tarafi  elamanlari teker teker girmek
        gerekmesi
         */

        Integer[]arr={2,3,5,6,8,4,2,6,9,0,1,3,6,4,2,7,0};

        /*bu kadar cok elamanli bir listeyi tek tek
        elaman olarak girmek yerine
        aray olusturup for loop ile olusan listeyi list e tasiyabiliriz
         */

        List<Integer>sayilar=new ArrayList<>();

        for (int i = 0; i < arr.length ; i++) {
            sayilar.add(arr[i]);

        }
        System.out.println(sayilar);

        /*bu islemi yapmasi icin java da bir method var
        ancak bu yontemin cok yan etkisi var
         */

        List<Integer>sayilar2= Arrays.asList(arr);
        System.out.println(sayilar2);//[2, 3, 5, 6, 8, 4, 2, 6, 9, 0, 1, 3, 6, 4, 2, 7, 0]//bu kadar lkolay neden kulanmiyoruz
        sayilar.add(5);//5 ekledik
        System.out.println(sayilar);
    /*    sayilar2.add(5);cortladi//exception verdigi icin hata verdi yoruma aldik
    list olustrabiliyorsun fakat listeye elaman ekleyemiyorsun
    ad.remove gibi liste ekleyen methodlar kulanilamaz
     */

        arr[0]=20;
        System.out.println(Arrays.toString(arr));//[20, 3, 5, 6, 8, 4, 2, 6, 9, 0, 1, 3, 6, 4, 2, 7, 0]
        System.out.println("Array de degilik yapinca sayilar 2:"+ sayilar2);
//Array de degilik yapinca sayilar 2:[20, 3, 5, 6, 8, 4, 2, 6, 9, 0, 1, 3, 6, 4, 2, 7, 0]
/*aslist methodu ile olusan liste kaynak olan aray birbiri ile ilsik olrak
        hayatlarina devam ederler,otomatik olarak digerinede isler
        bu cok makul bir yontem olmadigi icin kullanisli degil
 */
    }
}
