package Day34_inheritance.evcalismasu;

public class personel {


    public  static  int sayac=1000;

    public int id;
    public String isim;
    public String soyisim;
    public String aders;
    public String tel;


    protected int idAtama() {

        this.id=sayac;
        sayac++;
        return sayac;
    }
}
