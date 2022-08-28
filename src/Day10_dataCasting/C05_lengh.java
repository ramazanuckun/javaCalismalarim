package Day10_dataCasting;

public class C05_lengh {
    public static void main(String[] args) {

        String str="java ögren, isi kap";
        System.out.println(str.length());
        System.out.println(str.charAt(str.length()-1));
        System.out.println(str.charAt(str.length()-3));// sondan 3.karakteri yazdırır.indeks

        /*java da null pointer (isaretli strıng deki deger sayısını verir


         */
String str2="";//deger atanmış o deger hçliktr
        System.out.println(str2.length());
        String str3=null;//str 3 e bir deger atamamıştır onu null degerinden anlıyoruz
        System.out.println(str3.length());
    }
}
