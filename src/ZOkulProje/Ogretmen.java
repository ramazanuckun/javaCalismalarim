package ZOkulProje;

public class Ogretmen extends Kisi{

    private  String bolum;
    private  String sicilNo;

    public Ogretmen(String adSoyad, String kimlikNo, int yas, String bolum, String sicilNo) {
        super(adSoyad, kimlikNo, yas);//super dedıgı zaman paret a gıder oradakını alır
        this.bolum = bolum;
        this.sicilNo = sicilNo;
    }

    public Ogretmen(String bolum, String sicilNo) {
        this.bolum = bolum;
        this.sicilNo = sicilNo;
    }

    public void setBolum(String bolum) {
        this.bolum = bolum;
    }

    public void setSicilNo(String sicilNo) {
        this.sicilNo = sicilNo;
    }

    public String getBolum() {
        return bolum;
    }

    public String getSicilNo() {
        return sicilNo;
    }

    public Ogretmen(){ //prametresiz konsructer defalt u ezdigi ilerideki hatalari onluyor


    }

    @Override
    public String toString() {
        return "Ogretmen{" +
                "bolum='" + bolum + '\'' +
                ", sicilNo='" + sicilNo + '\'' +
                '}'+super.toString();
    }
}
