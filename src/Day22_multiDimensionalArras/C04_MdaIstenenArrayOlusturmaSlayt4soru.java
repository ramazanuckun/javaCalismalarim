package Day22_multiDimensionalArras;

import java.util.Arrays;

public class C04_MdaIstenenArrayOlusturmaSlayt4soru {
    public static void main(String[] args) {

 /*
       Soru 4) Asagidaki multi dimensional array'in
       ic array'lerindeki tum elemanlarin toplamini birer birer bulan
       ve herbir sonucu yeni bir array'in elemani yapan
       ve yeni array'i ekrana  yazdiran bir program yaziniz
Ornek; { {1,2,3}, {4,5}, {6,7} } ==> 1+2+3=6 4+5=9 6+7=13 ==> output: {6, 9, 13}

        */

int input[][]={ {1,2,3}, {4,5}, {6,7} };
int[]yeniAray=new int[input.length];
int toplam=0;
        for (int i = 0; i <input.length ; i++) {//outer array i kontrol ediyor ya da onun uzerinde dolasiyor
            for (int j = 0; j <input[i].length ; j++) {// inner array lari gezer ya da kontrol eder

                toplam+=input[i][j];



            }
            yeniAray[i]=toplam;//neden sifirladik toplam =0 demezsek eskiye ekleyerek gider
            toplam=0;
        }
        System.out.println("istenen yeni Aray:"+ Arrays.toString(yeniAray));
    }
}
