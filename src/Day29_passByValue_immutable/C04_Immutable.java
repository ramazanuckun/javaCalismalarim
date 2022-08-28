package Day29_passByValue_immutable;

import java.util.Locale;

public class C04_Immutable {
    public static void main(String[] args) {

        /*
        Immutable:Degistirelemez
        mutable:Degistirilebilr

        En meshur  immutable class :String



         */
        String str="Yildiz Bank";

        System.out.println(str.toUpperCase());//YİLDİZ BANK
        str.toLowerCase();
        System.out.println(str);//Yildiz Bank

        str.substring(3,5);//sout olamdigindan yazdirmaz
        System.out.println(str);//Yildiz Bank//velhasili kelam orjinal hali hic degismez.//cunku string immutable dir


        //javada string gibi metin ifadelerde kulanilabilecek mutable StringBuilder class i vardir


        StringBuilder sb=new StringBuilder("java Bank");

        System.out.println(sb);

        sb.reverse();//ters cevirir
        System.out.println(sb);//knaB avaj
//stringde olsa java bank yazdirrdi cunku immutable//fakat strinbilder mutable oldugu icin//knaB avaj




    }
}
