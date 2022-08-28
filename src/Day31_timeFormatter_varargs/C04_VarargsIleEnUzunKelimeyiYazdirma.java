package Day31_timeFormatter_varargs;

public class C04_VarargsIleEnUzunKelimeyiYazdirma {
    public static void main(String[] args) {


        enUzunKelimeyiYazdir("Ali","Ayse","Ismail","Ramazan","Tugba");




    }

    private static void enUzunKelimeyiYazdir(String ... kelime) {//(String ali, String ayse, String ismail)/

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
