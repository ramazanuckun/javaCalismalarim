package Day07_ifStaternnes;

public class C01_andOperatorleri {
    public static void main(String[] args) {

        int a=10;
        int b=15;
        int c=20;

        System.out.println(a>0 && b<20 && c>=b);
        System.out.println(a<0 && b<20 && c>=b);// false

/*java and operatörü konusunda bize iki secenek sunar
&& kullanırsak ,ilk false buldugunda,artık sonucun false olacagını bilir
ve geriye kalan sartları incelemez
& kullanırsak tüm şartları kontrol eder sonra sonucu belirler
bu çalışma usulunden dolayı  &operatörü,&&operatorüne göre daha yavaş olabilir.
 */
        System.out.println(a<0 & b<20 &c>=20);//false
    }
}
