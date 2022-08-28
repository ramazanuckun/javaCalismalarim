package Day05_matematikselİşlemler;

public class C04_WrapperClass {
    public static void main(String[] args) {


        String str="java cok guzel";
        str.toUpperCase();

        int sayi=10;

        /* primite data türlerinin yanında metodlar olmaz,
        java  bazı metotları  kulaalnabilmemız için,
        her bi pirimiteve data türü için bir wrapper class olurmuştur
         */
        Integer sayi2=10;
        sayi2.byteValue();
    }
}
