package day33_encupsulation.calismaEv;

public class telefonRunner {


    public static void main(String[] args) {


telefon marka1=new telefon();

marka1.getMarka();

        System.out.println(marka1.marka);
 telefon model1=new telefon();
model1.setModel("not 9");
telefon yil1=new telefon();

   yil1.setYil(5);
        System.out.println(yil1);
   telefon yil2=new telefon();
   yil2.getYil();
        System.out.println(yil2.getYil());
    }


}
