package Day26_constructur;

public class KamyonRunner {

    public static void main(String[] args) {



        Kamyon kamyon1=new Kamyon();


        Kamyon kamyon2=new Kamyon("Mercedes","4140",2005,50000);
        System.out.println("Kamyon2 Bilgileri"+kamyon2.toString());

Kamyon kamyon4=new Kamyon("Scania","s540");//2 parametreli consrectur yok olustrtalim
        System.out.println("Kamyon 4 bilgileri="+kamyon4);

        Kamyon kamyon5=new Kamyon("Ford","1999","");
        System.out.println("Man Bilgileri="+kamyon5);
    }

}
