package Day36_inheritanceDataTypeKullanimi;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class DIsci extends BMuhasebe{
    protected int saatUcreti = 11;
    protected int gunlukMesai = 7;
    protected void maasIsci(){
        System.out.println("Isciler : " + (30*saatUcreti*gunlukMesai)+ " maas alir");
    }
    protected void ozelSigortaIsci(){
        System.out.println("Isciler %70 indirimli ozel sigorta yaptirabilir");
    }
    public static void main(String[] args) {
        BMuhasebe isc1 = new DIsci();
        /*
          Bir obje olusturulurken
          Data turu ve constructor ayni class'dan ise
          direk o class'a gidiyorduk
          Eger data turu ve cons. farkli ise
          Obje constructor'in oldugu class'in objesidir
          ancak, bizden istenen
          Isci class'indaki spesifik ozellikler degil
          Bir iscinin muhasebe classindaki
          tum calisanlarla beraber sahip oldugu
          genel ozellikleri yazdirir
         */

    }
}