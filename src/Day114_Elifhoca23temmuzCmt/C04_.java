package Day114_Elifhoca23temmuzCmt;

import java.util.ArrayList;
import java.util.List;

public class C04_ {
    public static void main(String[] args) {

/*

    /*
     * verilen arrayin n sayisi kadar maksimun  degerlerini bulan java programi yaziniz
     * not kisa metodlar kullamayiniz
     * Input : {1,2,3,4,5,6,7,8} input n:2 Output : 7 and 8
     */

 //4 en buyugu kadar;3 en buyugu u getr gibi bir kod

        int[]arr={2,5,-9,45,43,11,8,102,102,47,0};

        int n=4;
        //bir liste olutralim cunku farkli cozum adina aray methodlarini kullanmiyoruz
        List<Integer>list=new ArrayList<>();

        //listeye elamanlari ekleyelim

        for (int each:arr
             ) {list.add(each);

        }
      //  max degerleri atnmak icin
        List<Integer>maxList=new ArrayList<>();
        //sayac ihitiyaci kulanicinin girdigi degerleri saymak cin
        int count=1;

        while (count<=n){
            int max= list.get(0);//listin ilk elamani max olsun
            for (int i = 0; i <list.size() ; i++) {

                if (list.get(i)>max && !(maxList.contains(list.get(i)))){//listenin herhangi bir elamani buyuk ise artik maksimun o elaman olsun
                    max= list.get(i);
                }//for dongusunde maxsimunlari buldumu max.ad ile max listeye ekledim

            }maxList.add(max);//102 eklendi

            list.remove(list.indexOf(max));//iki tane buyuk ayni sayi var ise o sayiyi maxlist e eklemesin diye yapiyorum
                                           // remova demek tekrar etme demek

            count++;
        }

        System.out.println("Aray in maxsimun ="+ n + " elamani" + maxList );

    }
}
