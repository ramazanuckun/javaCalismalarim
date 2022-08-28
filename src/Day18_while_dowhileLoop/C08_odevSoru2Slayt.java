package Day18_while_dowhileLoop;

public class C08_odevSoru2Slayt {
    public static void main(String[] args) {

        /*forloop ve while loop lullanarak 3 basamakli sayilardan 15,20 ve 90 tam bolunen sayilari yazdirin

         */


        int sayi1=15;
        int sayi2=20;
        int sayi3=90;
        int bolunenSayilar=0;

        for (int i = 100; i <1000; i++) {
            if (i%15==0 && i%20==0 && i%90==0)
            {
                System.out.print(i+ " ");
            }
        }bolunenSayilar++;

        System.out.println("");

        int bolum=0;
        int sayim11=999;
        while (bolunenSayilar<1000)
        {

            if (bolunenSayilar%15==0 && bolum%20==0 && bolunenSayilar%90==0)

                System.out.println(bolunenSayilar);

        }
 bolunenSayilar++;   }
}
