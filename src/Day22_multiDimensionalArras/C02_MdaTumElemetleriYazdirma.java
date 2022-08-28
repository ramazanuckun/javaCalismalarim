package Day22_multiDimensionalArras;

public class C02_MdaTumElemetleriYazdirma {
    public static void main(String[] args) {



        //verilen bir mda nin tum elemetlerini yazdiran bir methot hazirlayin
        int[][]sayilar={{1,5,6,9},{2,5,1},{3,1,6,9}};
        elementleriYazdir(sayilar);

    }

  public static void elementleriYazdir(int[][] sayilar) {

      for (int i = 0; i <sayilar.length; i++) {//i=0,1,2 degerleri olacak
          for (int j = 0; j < sayilar[i].length; j++) {//inner araylarin uzunluguna gore gidecek
              System.out.println(sayilar[i][j]+" ");

          }

      }



    }
}
