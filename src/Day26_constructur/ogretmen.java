package Day26_constructur;

public class ogretmen {

    String isim="isim belirtilmedi";
    String soyIsim="Soy isim beliritilmedi";
    String dogumTarihi="Tarih belirtilmedi";
    String brans="Brans beliritilmedi";
    String yanBrans="Yan brans belt";

    public ogretmen() {



    }

    public ogretmen(String isim, String soyIsim, String dogumTarihi, String brans, String yanBrans) {
        this.isim = isim;
        this.soyIsim = soyIsim;
        this.dogumTarihi = dogumTarihi;
        this.brans = brans;
        this.yanBrans = yanBrans;
    }


    public ogretmen(String isim, String soyIsim, String dogumTarihi) {
        this.isim = isim;
        this.soyIsim = soyIsim;
        this.dogumTarihi = dogumTarihi;
    }

    @Override
    public String toString() {
        return
                "\nisim='" + isim + '\'' +
                "\nsoyIsim='" + soyIsim + '\'' +
                "\ndogumTarihi='" + dogumTarihi + '\'' +
                "\nbrans='" + brans + '\'' +
                "\nyanBrans='" + yanBrans + '\'';

    }
}
