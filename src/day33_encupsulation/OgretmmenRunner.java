package day33_encupsulation;

public class OgretmmenRunner {
    public static void main(String[] args) {


        Ogretmen ogr1=new Ogretmen();

        ogr1.setIsim("Nesibe");
        System.out.println(ogr1.getIsim());

        /*
        bu yontemde data hiding degil
        daha anlasilir bir kod amaclanmis olur
         */
    }
}
