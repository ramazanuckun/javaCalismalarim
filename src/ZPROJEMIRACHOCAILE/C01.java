package ZPROJEMIRACHOCAILE;

public class C01 {
   /* Kullanıcıdan 2 sayı girmesini isteyeceğiz, girilen bu değerlerden
    biri saati diğeri de dakikayı temsil edecek. Bize akrep ile yelkovan
    arasındaki küçük açıyı hesaplayıp değeri açısal olarak döndüren metodu yazınız

    Örnek :

    input : hour : 12,  minutes : 30
    Output: 165

    */
   public static void main(String[] args) {
       System.out.println(angleClock(12, 30));


   }
   public static double angleClock(int hour,int minute){
       double ek=(double) minute/12;
       double hourAngle=((hour%12)*30)+(ek*6);//bulunan akrebin acisi hour%12 derken kullanici 12 den buyuk bir rakam girmesinin onune gectik
double newMinute=(double) minute/5;
double minuteAngle=newMinute*30;
double angle=Math.abs(hourAngle-minuteAngle);
if (angle>180)return (360-angle);
else return angle;


   }
}
