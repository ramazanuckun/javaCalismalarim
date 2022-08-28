package Day39_exception;

public class C03_Exception {
    public static void main(String[] args) {


        String str="123a5";

        int sayi= 0;
        try {
            sayi = Integer.parseInt(str);
        } catch (NumberFormatException e) {
            System.out.println("yazdgiginiz deger sadece rakamlardan olusmali");
        }catch (Exception e) {
            System.out.println("ongrulemeyen bir hata olusut");
        }

        System.out.println("Sayinin karesi:"+sayi*sayi);
/*
Kullanicidan string olarak bir deger valiyor ve bunu integer e ceviryorsak
NumberFormatException ile karsilacabilcegimizi  onguruuz bub NFe aldigimizda kodun durmamasini istiyorsak try catch ile cevreleriz
Eger bilmedigim bir exception daha olusursa kodum durmasin istiyorak bir kere daha catch cumlesi
ekleyip onada en genis exception u yazabiliriz
 */
    }
}
