package day33_encupsulation;

public class Ogretmen {

    //adinda get varsa bu method sunu gtrr diye dusunucegiz
    //isminde set varsa set ediyor

    /*
    Bazende yetkileri sinirlamak degilde yapilan isi daha iyi tanimlamak icin encapsulation kullanilir
    bu yaklasimi kullanan class larda tum variablar private yapilip hepsi icin getter ve setter olustutulur
     */


   private String isim;
   private String soyisim;
   private String brans;

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String getSoyisim() {
        return soyisim;
    }

    public void setSoyisim(String soyisim) {
        this.soyisim = soyisim;
    }

    public String getBrans() {
        return brans;
    }

    public void setBrans(String brans) {
        this.brans = brans;
    }

}
