package Day18_while_dowhileLoop;

public class C01_whileLoop {
    public static void main(String[] args) {

/*
        Soru 4 ) Kullanicidan baslangic ve bitis haflerini alin
        ve baslangic harfinden baslayip bitis harfinde biten
        tum harfleri buyuk harf olarak ekrana yazdirin.
        Kullanicinin hata yapmadigini farz edin.
         */

char ilkHarf='f';
char sonHarf='t';

char temp=ilkHarf;
String buyult="";


while (temp<=sonHarf){
buyult=(temp+"").toUpperCase();//cahr string yaptik cunku string guclu
    System.out.print(buyult+ " ,");
  temp+=1;




}

{

        }
    }
}
