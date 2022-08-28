package Day10_dataCasting;

import java.util.Locale;

public class C01_charAtÖ {
    public static void main(String[] args) {

       String str="Derdi dünya olanın dünyalar kadar derdi olurmus";
        System.out.println(str.charAt(0));//d yazar
        System.out.println(str.toUpperCase().charAt(10));
        System.out.println(str.charAt(42));
        System.out.println(str.length()-1);
        System.out.println(str.toLowerCase().charAt(0));
        System.out.println(str.toUpperCase());
        System.out.println(str.toLowerCase(Locale.forLanguageTag("Tr")));



        String isim1="Tugba Uckun";
        String isim2="Tugba UCKUN" ;
        String isim3="Tugba Uckun"  ;
        String isim4="Tugba Uckun" +"" ;
        String isim5=new String("Tugba Uckun");
        System.out.println(isim1==isim4);//false

        System.out.println(isim1==isim4);//false
        System.out.println(isim1.equals(isim4));

        System.out.println(isim1==isim5);//false
        System.out.println(isim1.equals(isim5));//true



        //egualsgnore
        String ders1="Cekirdekren Cınara";
        String ders2="cekirdekten cınara";
String ders3="CEKİRDEKTEN CINARA";
String ders4="Cekirdekten Cınara_";
        System.out.println(ders1.equals(ders2));//false

        System.out.println(ders1.equalsIgnoreCase(ders2));//true
        System.out.println(isim3.equals(ders4));//false
        System.out.println(ders3.equalsIgnoreCase(ders2));//true




        //length verilen strngdeki karakter sayısını dondurur
        //length 123....olarak gider  indekx 0123.... olarak gider
        //en büyük index=str.length-1 olrak bider


String karısık="asdfghjklşiçömnbvcxzqwertyuıopğü";
        System.out.println(karısık.length());
        System.out.println(karısık.charAt(31));

        System.out.println(karısık.charAt(karısık.length()-1));

        System.out.println(karısık.charAt(karısık.length()-27));





    }
}
