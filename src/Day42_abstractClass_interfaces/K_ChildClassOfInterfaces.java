package Day42_abstractClass_interfaces;

import static Day42_abstractClass_interfaces.I02_Interface.SAYI;

public class K_ChildClassOfInterfaces implements I02_Interface,I03_Interface{
/*
Bir classs i bir interface child yapmak icin implement keyworld kullanilir,
imoplement yazdiktan sonra virgul kullanarak istenilen kadar interface
ekleyebiliriz.
 */
/*
interface interface child yapmak istedigimizde yine extends kullaniyoruz
bir interface parend class olmaz
 */
public static void main(String[] args) {


    System.out.println(I02_Interface.SAYI);

    System.out.println(I03_Interface.SAYI);//karisikilik oldugunda
    //hangi interfacedeki sayiyi lalayim diye soruyor

    System.out.println(isim);
//methodlarda problem yok istedigini dinleyor.
  //  fakat ayni isimde farkli return type li
    //         methotlar olursa CTE olur

}

    @Override
    public void yakit() {

    }

    @Override
    public void motor() {

    }

    @Override
    public void teker() {

    }
}


