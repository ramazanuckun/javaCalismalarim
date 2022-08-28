package replit;

public abstract class BMuhasebe extends APersonel{


   protected  int saatUcreti;
   protected int aylikCalismaSuresi;
   protected int maas;

   protected abstract int saatUcreti();
   protected abstract  int getAylikCalismaSuresiSuresi();

   protected int maas(int  saatUcreti,int aylikCalismaSuresi){
       int maas=saatUcreti*aylikCalismaSuresi;
       return  maas;


   }
}
