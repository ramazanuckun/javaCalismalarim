package Day22_multiDimensionalArras;

public class C03_MdaIstenenSayilariYazdirma {
    public static void main(String[] args) {

        /*verilen bir mda nin multi-dimensional array'da
        outer ve inner index i ayni olan sayilarin toplamini bulan  yapiniz
         int[][]sayilar={{1,5,6,9},{2,5,1},{3,1,6,9}};
         [0][0]+[1][1]+[2][2].......
         */

        int[][]sayilar={{1,5,6,9},{2,5,1},{3,1,6,9}};
        int istenenToplam=0;
        for (int i = 0; i <sayilar.length ; i++) {

            for (int j = 0; j < sayilar[i].length; j++) {
                if (i==j){
                    istenenToplam+=sayilar[i][j];
                }
            }

        }
        System.out.println("istenen tolam:"+istenenToplam);
    }
}
