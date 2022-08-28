package Day112_ElifHocaSali19temmuz;

import java.util.Arrays;

public class C02_MDArray {
    public static void main(String[] args) {

        /*
         *  String 2D array olustur
         *  {{"$12" , "$22" , "0$"},   {"€9" , "€40" , "$1" },  {"€12", "$2","$0"}}
         *  String de $ varsa 3.2 ile carp
         *  String de € varsa 4.2 ile carp
         *  elemanlarin toplamini double olarak yazdir
         */


        String[][]arr= {{"$12" , "$22" , "0$"},   {"€9" , "€40" , "$1" },  {"€12", "$2","$0"}};

        //iceridekileri elamanlara ulasip kontrol saglamak icin
double toplam=0;
        for (int i = 0; i <3 ; i++) {//outher for

            for (int j = 0; j < 3; j++) {//inner for

                if (arr[i][j].contains("$"))//$isareti iceriyorsa

                {
                    toplam+=Double.parseDouble(arr[i][j].replace("$",""))*3.2;
                    //eger dolar parsa string oldugu icin parse ile sayiya cevirdim
                    //parantez icindeki $ dolar isaretlerinden kurtuldum
                    //sonra 12 kaldi douple ile string beraber islem koymak icin data/casting yapmak gerekir
                    //Douple.parse methodu ile casting yaptik 12 degeri douple oldu
                    //eklerkende 3.2 carpmasi istendigi icin carptik


                }
                else {

                    toplam+=Double.parseDouble(arr[i][j].replace("€",""))*4.2;


                }


            }

        }
        System.out.println(Arrays.deepToString(arr));// 2 boyutlu array yazdirmak icin
        System.out.println("toplam=" +toplam);//sayilarin hepsini topladi ve bana verdi

    }
}
