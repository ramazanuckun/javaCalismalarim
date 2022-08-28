package day32_strinBuilder;

public class C08_eguals {
    public static void main(String[] args) {

        StringBuilder sb1=new StringBuilder("Java");

        StringBuilder sb2=new StringBuilder("Java");

        String str="Java";

        System.out.println(sb1.equals(sb2));//false

        System.out.println(sb1.equals(str));//true

        //StringBuilder'da eguals method u ayni obje olursa true doner
        //String gibi dusunmememk lazim

        System.out.println(sb1.equals(str));//false


        System.out.println(sb1.compareTo(sb2));//0

        StringBuilder sb3=new StringBuilder("Jave");

        System.out.println(sb1.compareTo(sb3));//-4 bu method karsilastirarak gider farki verir yukarida0 verdi burada -4 verdi cunku
        //sadece e farkli a ile e arasinda 4 fark onun icin 4 veriyor
        //compare to methodu 2 stringbuilder i bastan baslayarak harf harf karsilastirir

    }
}
