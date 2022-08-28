package Day10_dataCasting;

public class C04_egualsIgnorCase {
    public static void main(String[] args) {

/*büyük küçük harf farkına varmadan iki metnin biribirine esit olup olmadığına bakar
 */



        String str1="Ali Can";
        String str2="ali can";
        String str3="ALİ CAN";
        String str4="Ali Can_";

        System.out.println(str1.equals(str2));//false
        System.out.println(str1.equalsIgnoreCase(str2));//true
        System.out.println(str2.equals(str3));//false
        System.out.println(str2.equalsIgnoreCase(str3));//truse
        System.out.println(str1.equals(str4));//false
        System.out.println(str1.equalsIgnoreCase(str4));//false
    }
}
