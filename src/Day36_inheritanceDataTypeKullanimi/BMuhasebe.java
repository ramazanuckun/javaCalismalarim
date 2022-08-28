package Day36_inheritanceDataTypeKullanimi;

public class BMuhasebe extends APersonel{


    protected String isim="Isim belirtilmedi";
    protected String soyisim="Soyisim belirtilmedi";
    protected String departmant="departman belirtilmedi";
    protected void maas(){
        System.out.println("Tum personelimiz maas alir");
    }
    protected void sigorta(){
        System.out.println("Tum personelimiz sigorta yapilir");
    }
}
