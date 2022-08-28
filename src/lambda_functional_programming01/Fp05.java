package lambda_functional_programming01;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Fp05 {
    public static void main(String[] args) {

        Courses courseTurkishDay = new Courses("Summer", "Turkish Day", 97, 128);
        Courses courseTurkishNight = new Courses("Winter", "Turkish Night", 98, 154);
        Courses courseEnglishDay = new Courses("Spring", "English Day", 95, 132);
        Courses courseEnglishNight = new Courses("Winter", "English Night", 93, 144);

       List<Courses> coursesList = new ArrayList<>();
        coursesList.add(courseTurkishDay);
        coursesList.add(courseTurkishNight);
        coursesList.add(courseEnglishDay);
        coursesList.add(courseEnglishNight);
        System.out.println("ortalamaPuanlarVerilenSayidanBuyukMu: "+ ortalamaPuanlarVerilenSayidanBuyukMu(coursesList,10));
        System.out.println("kelimeKursAdlariIcindeVarMi: "+kelimeKursAdlariIcindeVarMi(coursesList,"Turkish Day"));
        ortalamasiEnYuksekKursunAdiniYazdir(coursesList);
        System.out.println(ortalamaPuanaGoreSiralaVeIlkVerilenleriAtla(coursesList,3));


    }
/*
Not string bir class data tipi ise class larda bir data tipidir
 */
    //1)Tüm ortalama puanların verilen sayıdan
    // büyük olup olmadığını kontrol etmek için bir method oluşturun.


public static boolean ortalamaPuanlarVerilenSayidanBuyukMu(List<Courses>list,double x){

        return list.stream().allMatch(t->t.getAverageScore()>x);//allMatch ==tutuyorsa al isi yapiyor

/*
proje class tan(corse)bir listim var proje clasi kullanarak  getAveragescoore methodu
var proje classta onu kullandim tek gri olmayan o neden cunku tek o kullanildi ilerleyen durumlarda
kullanilna renk degistiriyor


 */
}
    //2)Kurs adlarından en az birinin verilen kelimeyi içerip içermediğini kontrol etmek için bir method oluşturun
    public static boolean kelimeKursAdlariIcindeVarMi(List<Courses> list, String kelime){


 return   list.stream().anyMatch(t->t.getCourseName().contains(kelime));//herhang ibiri onu iceriyormu ve getCournamae string old/cin ondan sonra string olan methodlar gelir


}
    //3) Ortalama puanı en yüksek olan kursu yazdırmak için bir yöntem oluşturun
    public static void ortalamasiEnYuksekKursunAdiniYazdir(List<Courses> list){


        String sonuc = list.stream().
                sorted(Comparator.comparing(Courses::getAverageScore).//sorted diyerek kurslari ortalama skorlara gore siraliyorum 93,95,97 k<b fakat reversed direktersten siraliyor 98,95,97,98

                        reversed()).findFirst().get()//find diyerek sondan basa yaptigim siralamayda birinciyi aliyorum
                .getCourseName();//objeyi yazdiramadigim icin objede ki ismi aldim

        System.out.println(sonuc);}
    //4) List öğelerini artan düzende ortalama puana göre sıralayın ve ilk verilenleri atlayın
    public static List<Courses> ortalamaPuanaGoreSiralaVeIlkVerilenleriAtla(List<Courses> list, int x){
    //atla methodu var

        return list.stream().sorted(Comparator.comparing(Courses::getAverageScore)).

               skip(x).//atla methodu istenen kadar
                collect(Collectors.toList());//aray olarak yazdir methodu


    }
}
