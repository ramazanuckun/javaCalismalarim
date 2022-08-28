package Day113_Elifhoca_cmt16temmuz;

public class C07 {
    public static void main(String[] args) {

        /*
         * verilen Arrayde toplamlari istenen degere esit olan sayi ciftlerini //
         * yazdiran bir method yaziniz int[] arr= {5,7,-6,4,2,15,3,8,1}; int
         * istenenToplam=9;
         */
        int[] arr={5,7,-6,4,2,15,3,8,1};


        int istenenToplam=9;

        //nested for yapacagiz cunku ike defa gezilecek

        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {//neden i+1 dusun
                if (arr[i]+arr[j]==9){
                    System.out.println(arr[i]+ "ve"+arr[j]+"toplam"+istenenToplam);

                }
            }

        }


/*j=i oldugu zaman ki degerleri alistirma yap hoca odegerleri yapti
5ve4toplam9
7ve2toplam9
-6ve15toplam9
8ve1toplam9
i+1=5ve4toplam9
7ve2toplam9
-6ve15toplam9
8ve1toplam9


 */










}}
