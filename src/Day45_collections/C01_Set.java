package Day45_collections;

import java.util.Arrays;
import java.util.Deque;
import java.util.HashSet;
import java.util.Set;

public class C01_Set {
    public static void main(String[] args) {

/*
verilen bir arayda tekrar eden elemetleri silip tekrarsiz halde atayan bir kod yaziniz

 */

        int[]arr={4,5,3,6,8,5,1,9,0,4,2,5,7,9,1,2,5,7,6};

        Set<Integer>tekrarsizSet=new HashSet<>();

        for (int each:arr
             ) {tekrarsizSet.add(each);//her elamani set e attim

        }

        System.out.println(tekrarsizSet);//[0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
//bizim istedigimiz aray di simdi problemin 2/asamasi

        int[]tekrarsizArr=new int[tekrarsizSet.size()];//dinamik yaptik
        System.out.println(Arrays.toString(tekrarsizArr));//[0, 0, 0, 0, 0, 0, 0, 0, 0, 0]//daha atama yamadik
       // for each olamaz cunku inex ister
int i=0;//kendi index imizle aray a atama yapmak icin
        for (Integer each:tekrarsizSet
             ) {tekrarsizArr[i]=each;
            i++;

        }
        System.out.println(Arrays.toString(tekrarsizArr));//[0, 1, 2, 3, 4, 5, 6, 7, 8, 9]//bu bizim oglan degil hala
        arr=tekrarsizArr;

        System.out.println("Bizm oglanin son hali"+Arrays.toString(arr));

    }
}
