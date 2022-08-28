package Day25_consructor;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class C02_Consructor {
    public static void main(String[] args) {

//konumuz java bir baska clas taki methodlara nasil ulasir
        C01       obje1=      new        C01    ();//obje c01 dekinin kopyasidir
   //  class adi   obje adi   keyword    consructer(yapici;muteahhid)=mutlaka olmali ve bunu java kontrol ediyot java da obje otomatik tum objelerde vardir

//C01() parantez ne variable parantez koymadik; fakat method da parantez koyduk

        Scanner scanner=new Scanner(System.in);
        Random rnd= new Random();//hep consructor var

        List<String> list=new ArrayList<>();
       // List<String> list2=new List<>();//listi new diyerek yapamayiz cunku list bir interfest tir ve interfestlerin constructor u yoktur
/*java obje olusturmak icin mutlaka consructur kullanmalisiniz

 */
        System.out.println(obje1.sayi);//default deger instens variable oldugu icin
obje1.deneme();//("CO1 DEN DENEME METHODU CALISIR");

// uc sey

    }
}
