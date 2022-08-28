package replit;

public abstract class APersonel {

static final String SirketIsmi="Ucar Tur";
static  final String sirketAdresi="Isparta/Hizirbey";//ulasilacak degistrilemeyecek

protected String isim="deger girilmedi";
protected String soyIsim="deger girilmedi";
    protected String tc="deger girilmedi";

    protected String telefon="deger girilmedi";
    protected String isebaslama="deger girilmedi";

    protected String sigortaNo="deger girilmedi";

static int personelsayisi=1000;
protected String personelNo;
protected String personelNoo(){
    personelsayisi++;
    String no=personelsayisi+"";
    return no;
}



}
