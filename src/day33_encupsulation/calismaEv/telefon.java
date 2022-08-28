package day33_encupsulation.calismaEv;

public class telefon {

String marka="Marka Belirtilmedi";
private  String model="Model Beliritilmedi";

private String sarjHiizi="Normal";
private int yil;

    public String getMarka() {
            return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getModel() {
        return model;
    }

    public int getYil() {
        return yil;
    }

    public void setYil(int yil) {
        this.yil = yil;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
