package day33_encupsulation;

public class Araba {


    String marka="marka belirtilmedi";//default yazmayinca zaten dafault dur//
    // marrka access modifier i default old.
                                      //package icinden kllanilir
 private    String model="model belirtilmedi";

    private String yakit="Elektrikli";//tum arabalar elektrkli ise bu variable in degstrlmemesi lazim
//private yaptigimiz model ve yakit variablarinin erisimi yetkilendirelim
    //model e deger atansin ama gorulmesin(setter)
    //yakit gorulmesin diyorsak ama deger atamasin(getter)

    public void setModel(String model) {  //deger atamaya izin verir
        this.model = model;
    }

    public String getYakit() {//ulasima izin verr
        return yakit;
    }
}
