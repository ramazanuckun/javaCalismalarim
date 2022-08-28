package Day26_constructur;

public class Kamyon { public String marka="Marka belirtilmedi";//adama marka girmezse devreye gireek //null yazacagina bu yazacak
    public String model="Model belirtilmedi";
    public int yil;
    public int fiyat;

    public Kamyon(String markaK, String modelK, int yilK, int fiyatK) {
       this.marka=marka;
       this.model=model;
      this.yil=yil;
        this.fiyat=fiyat;
/*
bizim temel amacimiz kamyonRunner de argumant olarak girilen degerin
kamyon clasinda instance variable atanmasi
ancak scope konusunda ogrendigimiz gibi
Kamyon constructer scope unda marka oldugu icin instance
marka ya gitmiyor
bu karisikligi gidermek icin instance variablari belirli gtrmemiz
lazim.
java bunun icin this keyword u olustirmustur.
basina this.yazdigimiz intstance variabledir
genel kullanim acisindan this.keywor du kodu herkesin anlamasini kolaylastirdigi icin
tercih edilir

 */


    }

    public Kamyon(String marka, String model) {
        this.marka = marka;
        this.model = model;
    }

    public Kamyon(){


    }



    @Override
    public String toString() {
        return
                "\nmarka='" +this. marka + '\'' +
                "\nmodel='" + this.model + '\'' +
                "\nyil=" + this.yil ;

    }

    public Kamyon(String ford, String s, String s1) {


    }

}
