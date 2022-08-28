package Day26_constructur;

public class ogretmenRunner {
    public static void main(String[] args) {

        ogretmen ogretmen1=new ogretmen();
        System.out.println("ogretmen 1"+ogretmen1);


        ogretmen  ogretmen2=new ogretmen("Emre","soyisim","1/1/2012","mate","sinif");

        System.out.println("ogretmen 2="+ogretmen2);

        ogretmen ogretmen3=new ogretmen("Cevdet","turkoglu","1/1/2013");
        System.out.println("ogrretmen 3="+ ogretmen3);



    }
}
