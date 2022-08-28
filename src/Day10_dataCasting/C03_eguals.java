package Day10_dataCasting;

public class C03_eguals {
    public static void main(String[] args) {
/*sayısal veya char variablelarda esitliği konrol etmek için==kullanıyorduk.
ancak java da bunu kesin kurllar ıle belirlemiştir biz bunu daha sonra öğreneceğiz.
eger iki metnin birbiri ile aynı olup olamdığını kontrol etmek istersek eguals kullanmalıyız.
eguals sadecew metinleri karşılastırıken  eguals hem metinleri hem objleri kontrol eder.
 */






     String str1="Ali Can";
     String str2="Ali CAN";
     String str3="Ali Can"+"";
     String str4="Ali Can";
     String str5=new String("Ali Can");

        System.out.println(str1==str2);
        System.out.println(str1.equals(str5));






    }
}
