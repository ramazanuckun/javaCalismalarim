package Day114_Elifhoca23temmuzCmt;

public class C08_ {
    public static void main(String[] args) {

        int numberOfBananas =165, survivalDays = 1;
        boolean monkeyAlive = true;
        do {
            System.out.println("maymunlar gunde 4 muz yer");
            numberOfBananas-=4; //toplam muzdan 4 azalir
            survivalDays++;//yasadigi gun sayisini 1 arttir
            if(numberOfBananas<4){ //4 den az muz kalirsa
                monkeyAlive = false; //maymun hayatta degil
                System.out.println("bugun  "+ survivalDays + " .gun muz kalmadi, maymun sizlere omur..:( ");
            }else
                System.out.println("bugun " + survivalDays + " gun, maymun halen hayatta..:) ");
        }while(monkeyAlive);
        System.out.println("toplam yasadigi gun sayisi : " + (survivalDays-1));
    }
}