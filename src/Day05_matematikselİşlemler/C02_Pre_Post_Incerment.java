package Day05_matematikselİşlemler;

public class C02_Pre_Post_Incerment {
    public static void main(String[] args) {

        int sayı=115;

        System.out.println("pre-ıncerment:"+ ++sayı);//1-artırma 2-yazdırma

        System.out.println("post-ıncerment:"+sayı++);//1 yazdırma 2 artırma

        System.out.println("post-ıncerment sonra:"+sayı);
    }
}
