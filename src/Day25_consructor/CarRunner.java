package Day25_consructor;

public class CarRunner {
    public static void main(String[] args) {

        car car1=new car();
      car1.fiyat=1500000;
      car1.yil=2020;
     car1.marka="Toyota";

        System.out.println("Car1 bilgileri\nMarka"+car1.marka+"\nModel"+car1.model
                           +"\nYil:"+car1.yil +"\nFiyat"+car1.fiyat);

car car2=new car();
        System.out.println("Car2 bilgileri\nMarka"+car2.marka+"\nModel"+car2.model
                +"\nYil:"+car2.yil +"\nFiyat"+car2.fiyat);//hicbir deger atamasi yapmadim

/*
herhangi bir obje uzerinden bir variable yazdirmaya kalkarsak su sira ile java siralama yapr
1-o obje olustrulduktan sonra bir deger atandi mi
2-objenin olstruldugunda variable bir degr atanmismi//once mevcud run class ina bakar yoksa depo classina bakar ikisindede yoksa default deger atar
3- ozaman data turune gore default degeri atar/
4-anlayacagimiz class taki butun ozellikler objedede olur

 */
    }
}
