package day33_encupsulation;

public class ArabaRunner {
    public static void main(String[] args) {


        Araba arb1=new Araba();

        //arb1 objesi uzerinden marka variable ina
        //ulasabildim,degstrdim(set)ve yazdirdim

        arb1.marka="Toyota";//markaya ulatim ve dgstrdim

        System.out.println(arb1.marka);//toyota

     //access modifier kullanarak marka variablenina ulasimi tamamen
        //serbest veya engelleyebilirim
        //private yaptigimiz model e hic ulasamayiz/deneyelim denedik olmuyor istersen tekrar dene
        //yani acces modifier ya hep ya his diyor//

        //markayi degitirelim ama goremeyelim
        //yakiti gorelim ama dedistiremeyeyim

        //set ve get yetkilerini ozel olarak tanimlamak isterseniz
        //1/adim ozel yetki tanimlayacaginiz variable lari private yapin
        //   private bir dataya  baska class lardan ulasmak mumkun olmadigindan
        //2.adim set icin setter get icin getter methodlari olusturalim

        arb1.setModel("Supra");//model olarak supra yi atadik//modeli yazdirma imkanimiz yok,cunku getter methodu yok//Toyota
        System.out.println(arb1.getYakit());//elektrikli bilgisini yazdirdik//Elektrikli
        //yakiti degistremeyiz cunku setter method u yok
    }
}
