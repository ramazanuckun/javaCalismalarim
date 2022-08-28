package lambda_functional_programming01;

public class Utils {
    //bazi methodlar olusacak static yapiyoruz cagirmak  icin
//bu pacge gidip bu methodcgrilirsa bu islem yapilir
    public static void ayniSatirdaBosluklaYazdir(Object obj) {

    /*
    objet class icine her turlu data turunu
    kabul eder  methodlari kabul ederyavastir mam is gorur
     */
        System.out.print(obj + " ");
    }

    public static boolean ciftElamanlariSec(int x) {
        return x % 2 == 0;

    }

    public static boolean tekElamanlariSec(int x) {
        return x % 2 != 0;

    }

    public static int karesiniAl(int x) {

        return x * x;
    }

    public static int kupunuAl(int x) {

        return x * x * x;

    }

    public static double yarisiniAl(double x) {

        return x / 2.0;
    }

    public static char sonKarakteral(String str) {

        return str.charAt(str.length() - 1);

    }

    public static char ilkKarakteral(String str) {

        return str.charAt(0);
    }
    public static int rakamlarToplamiAl(int x){

        //while ile yaparsak daha koly
        int toplam=0;

        while (x>0){
    toplam+=x%10;
    x=x/10;

}
      return toplam;
    }}
