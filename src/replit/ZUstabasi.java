package replit;

public class ZUstabasi extends DIsci{
    @Override
    protected int saatUcreti() {
        return 15;
    }

    @Override
    protected int getAylikCalismaSuresiSuresi() {
        return 200;
    }

    @Override
    public String toString() {
        return "ZUstabasi{" +
                "saatUcreti=" + saatUcreti +
                ", aylikCalismaSuresi=" + aylikCalismaSuresi +
                ", maas=" + maas +
                '}';
    }

    public static void main(String[] args) {


        System.out.println(APersonel.SirketIsmi);



    }
}

