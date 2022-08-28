package replit;

public  class DIsci extends BMuhasebe {
    @Override
    protected int saatUcreti() {
        return 10;
    }

    @Override
    protected int getAylikCalismaSuresiSuresi() {
        return 200;
    }

    @Override
    public String toString() {
        return "DIsci{" +
                "sirketIsmi='" + SirketIsmi + '\'' +

                "isim='" + isim + '\'' +
                ", soyIsim='" + soyIsim + '\'' +
                ", tc='" + tc + '\'' +
                ", telefon='" + telefon + '\'' +
                ", isebaslama='" + isebaslama + '\'' +
                ", sigortaNo='" + sigortaNo + '\'' +
                ", personelNo='" + personelNo + '\'' +
                '}';
    }

    public static void main(String[] args) {

        DIsci isci=new DIsci();
        isci.maas=isci.maas(isci.saatUcreti(),isci.aylikCalismaSuresi);
        isci.isim="ramazan";
        isci.soyIsim="Uckun";
        System.out.println(isci);
    }
}
