package Day29_passByValue_immutable;

public class C05_Immutable {
    public static void main(String[] args) {


        String isim="Mine";

        isim=isim.toUpperCase();//isim kalici degisir

        System.out.println(isim);//MINE//referans ayni kaldi fakat obje degisti//referans ayni kalmak sarti ile yeni bir obje olustrr.
        //hafizayi doldurur

        isim="Nesibe";//isim ayni obje degisti

        for (int i = 0; i <=100 ; i++) {
            isim+=".";

        }

        System.out.println(isim);//mevlut okunmus 100 tane nokta okunmus
        // 100 tane yeni obje olusmustur//copluge gidecek obje olacak
        //

    }
}
