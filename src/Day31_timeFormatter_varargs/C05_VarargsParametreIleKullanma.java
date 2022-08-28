package Day31_timeFormatter_varargs;

public class C05_VarargsParametreIleKullanma {
    public static void main(String[] args) {


        enUzunKelimeyiYazdir(5,"Ali","Ayse","Ismail","Ramazan","Tugba");//lava her zaman argument ile parametre uyumunua bakar

//boolea sonuna kabul etmedi cunlku;
        //varags sonsuz sayida elaman alabilir.varargs in sinirlarini bilebilmesi icin son parametre olmalidir.oncesi olabilir fakat sonra olamaz
        //bir method da varargs tan 2 tane olamaz bir methotda


    }

    private static void enUzunKelimeyiYazdir(int kelimeSayisi, String ... kelime) {

        String enUzunKelime=kelime[0];

        for (String each:kelime
        ) {
            if (each.length()>enUzunKelime.length()){
                enUzunKelime=each;
            }
        }
        System.out.println("Girilen Kelimelerden En zunu Kelime\n"+ enUzunKelime);


    }
}
