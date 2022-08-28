package dAY41_abstractClass_Interface;

public abstract class DAraba {
    /*
    Abstract class ta main method opsiyoneldir.Eger Abstract class sadece child class larin tasimak zorunda oldugu
    ozellikleri belirlemek icin olstrulduysa main method a ihtiyac olmaz,sadece Abstract methodlar olur

    ama bir abstract methodda standart belirlemek disinda methodlar calisabilir
    bu durmda ihtiya olursa main method olusturulabilir
     */

    public static void main(String[] args) {

    }
protected  abstract void yakit();
    protected abstract void kaporta();

    public abstract void motor();//absract-soyut-badisi yok

    /*
    sadece child class ;arin mecburui tasiyacaklari belirleyen method;ar
    olur.ve abstract class lari badisi olmaz{};

     */
    public void klima(){ //concrete badi var somut ruh var


        System.out.println("Bazi arabalarda klima olabilir");

        /*
        abstract(soyut-demek) olmayan methodlara concrete method denir.
        abstract bir methodu abstract keyworld ile belirlemek zorunludur.
        abstract olmayan methodlara concrete declara edilmnesine gerek yoktur

        biz sadece abstract ile ilgili konustugumuzda abstract olmayan lardan bahsetmek icin concrete
        tabirini kulaniriz/(ruhu olan diye yada somut -soyut-badi var-badiyok)
         */

    }

}
