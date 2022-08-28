package Day04_dataCasting;

public class C04_ExplicitNarowing {
    public static void main(String[] args) {

        int sayı1=-135;

        byte sayı2=(byte)sayı1;
        //genis dat t&uuml;r&uuml;ndeki degeri dar data t&uuml;r&uuml;ne tatamak isteseniz
        // java sizin genis data t&uuml;r&uuml;ndeki degerin ,dar data t&uuml;r&uuml;n&uuml;n&uuml; s&#x131;n&#x131;rlar&#x131;na
        // vuyup uymayacag&#x131;n&#x131;z&#x131; cal&#x131;&#x15F;t&#x131;rana
        // kafar bilemez amam java risk almaz
        // riski s&#x131;f&#x131;ra indirmek i&ccedil;in burada bir sorun olursa sorumlulu&#x11F;u kabul etmezninz bekler
        // bunun i&ccedil;in degerin onune parantez koyar&#x131;z.
        //
        // bu riski &uuml;stlendi&#x11F;imizde 3 durum var
        // 1-bizim de&#x11F;er dar kal&#x131;p de&#x11F;erine uyasa hi&ccedil; kay&#x131;p olamz.
        // 2-doupla bir say&#x131;y&#x131; int.cast etmek durumunda data kayb&#x131; yasar&#x131;z
        // 3-genis kal&#x131;ptan dar kal&#x131;ba koydu&#x11F;umuzda s&#x131;n&#x131;rlar&#x131; a&#x15F;an durumlarda veri ba&#x15F;kalasabilir.
        // calışmaları tamamala

        System.out.println(sayı2);

    }
}
