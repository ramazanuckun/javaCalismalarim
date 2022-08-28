package day33_encupsulation;

public class TasitRunner {
    public static void main(String[] args) {

        Tasit tst1=new Tasit();


        tst1.setTasitTuru("Tir");//tir bilgisi tasit clasinda set bolumune gidiyor
        //fakat tasit methodunun ilgili bolumunde return yok onun icin yazdirilamaz
        //demek ki set methodlarinda bizim gonderdiklerimizi instance variablerina atamak


        System.out.println(tst1.getTasitTuru());
        /*
             /*
        getter methodu tek satirlik islem yapiyor
        baska classlardan private oldugu icin erisemedigi
        tasit turu bilgisini class tan alip
        istenen farkli class lara return ediyor
         */
Tasit tst2=new Tasit();

        System.out.println(tst2.isMuayenesiVarMi());
        System.out.println(tst2.getYil());
    }
}
