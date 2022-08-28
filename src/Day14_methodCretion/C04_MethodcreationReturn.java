package Day14_methodCretion;

public class C04_MethodcreationReturn {
    public static void main(String[] args) {
        //verilen isim ve soyismi ilk harfi büyük ,geriye vkalanları * olacak şelde degstirip bize bu halini döndüren methot olusturun
        //programın ilerleyen kısımlarında isim ve soyismi boyle kullanmak istiyoruz.

        String isim="Enes";
        String soyisim="Bozkurt";
        String gizliİsim=isimGizle(isim,soyisim);
        System.out.println(isim+" "+soyisim);
        System.out.println(gizliİsim);


    }

    public static String isimGizle(String isim, String soyisim) {
        isim= isim.substring(0,1).toUpperCase()+isim.substring(1).replaceAll("\\w","*");
        soyisim=soyisim.substring(0,1).toUpperCase()+soyisim.substring(1).replaceAll("\\w","*");
        System.out.println(isim+" "+soyisim);
        return isim+" "+soyisim;



    }
}
