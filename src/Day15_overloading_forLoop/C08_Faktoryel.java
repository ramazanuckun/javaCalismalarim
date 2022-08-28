package Day15_overloading_forLoop;

public class C08_Faktoryel {
    public static void main(String[] args) {

        /*input olarak verilen bir tam sayı icin faktoriyel hesaplayaıp yazdıran bir method olusturun
        verilen sayı negatif veya 20 den sonra buyuk olursa girilen sayının faktoriyeli hesaplanamaz uyarısı yazdırın
         */
        int input=5;
                faktoryelHesapla(input);





    }

 public static void faktoryelHesapla(int input) {

      int faktoryel=1;

      if (input<0 || input>20){
          System.out.println("lütfen verilen sayı icin faktoryel hesaplanmaz");
      } else if (input==0) {
          System.out.println("0!=1 dir");

      }else {

          for (int i = 1; i <=input ; i++) {

              faktoryel*=i;

          }


          System.out.println("faktoryel degeri:"+faktoryel);

      }


 }
}
