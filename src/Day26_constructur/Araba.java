package Day26_constructur;

public class Araba {


    public String marka="Marka belirtilmedi";//adama marka girmezse devreye gireek //null yazacagina bu yazacak
   public String model="Model belirtilmedi";
   public int yil;
   public int fiyat;

    public Araba(String markaR, String modelR, int yilR, int fiyatR) {
    /* biz herhangi bir consructer olusturdugumuzda java default contructer i siler.
    eger biz projemizde bir sorun yasanmasini istemiyorsak
    mutlaka default yerine parametresiz bir bir consrecter olustrmaliyiz.|*/
    marka=markaR;
    model=modelR;
    yil=yilR;
    fiyat=fiyatR;


    }

    public Araba() {


         }


    public void benzinliArac(){
        System.out.println("Bu arac benzinli modele sahibtir");
    }

    public  void maxHiz(int hiz) {

    }}
