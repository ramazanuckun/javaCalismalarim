package Day24_arrayLists_forEachLoop;

import java.util.ArrayList;
import java.util.List;

public class C06_forIcLoop {
    public static void main(String[] args) {

        int[]arr={2,3,65,4,4,8,7,87,8};
        List<Integer>Liste=new ArrayList<>();
        //array daki tum elemanlari inceleyelim;tek sayilari list e atalim

        //maksat siralamak de['l atama yapmak ise
///gelecekler ne
        for (int each:arr    //gelecek datalarin turu;loop icinde ne isim verdigim;nereden aldigim
             ) {//index lazim degilse kullaninabiliriz;herkes gelin diyorsak

            if (each%2==1){
                Liste.add(each);
            }

        }
        System.out.println(Liste);

    }
}
