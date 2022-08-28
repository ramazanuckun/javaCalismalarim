package Day16_forLoop;


public class C12_tekrr {
    public static void main(String[] args) {

  String deger="suren dolmak uzere yoksa yusuf ihsan cok kizar";

  degerrr(deger);






    }

    private static void degerrr(String deger) {
       String degerters=deger.substring(deger.length()-1);
        for (int i = deger.length()-2; i >=0 ; i--) {degerters+=deger.substring(i,i+1);

        }
        System.out.println("degerters = " + degerters);
    }


}