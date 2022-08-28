package Day34_inheritance.evcalismasu;

public class memur extends  muhasebe {
    public static void main(String[] args) {



        memur memur1=new memur();

        memur1.isim="Ali";

        memur1.soyisim="Can";
        memur1.tel="123456";
        memur1.saatucreti=20;
        memur1.maas=memur1.maasHesapla();
        memur1.id=memur1.idAtama();

        memur memur2=new memur();
        memur2.isim="Aliye";
        memur2.soyisim="Can";
        memur2.tel="123456";
        memur2.saatucreti=20;
        memur2.maas=memur2.maasHesapla();
        memur2.id=memur2.idAtama();

        System.out.println(memur1.isim+""+memur1.id+" "+ memur1.maas);
        System.out.println(memur2.id+" "+ memur2.maas);
    }
}
