package Day14_methodCretion;

public class C02_methodCretion {

    public static void main(String[] args) {

        //verilen 3 basamaklı bir sayının rakamları topmını yazdıran method olusturalım

        int input=423;
        rakamlarıTopla(input);

        C01_methodCretion.terstenYazdır("oyak");



    }

    public static void rakamlarıTopla(int input) {
        int birlerBasamagı=0;
        int rakamlarToplamı=0;
int temp=input;
        birlerBasamagı=input%10;
        rakamlarToplamı+=birlerBasamagı;
        input/=10;
        birlerBasamagı=input%10;
        rakamlarToplamı+=birlerBasamagı;
        input/=10;
        birlerBasamagı=input%10;
        rakamlarToplamı+=birlerBasamagı;
        input/=10;
        System.out.println("girdiğiniz"+temp+"rakamalar toplamı"+rakamlarToplamı);




    }


}
