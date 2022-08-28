package Day17_nestedforloop;

public class C02_whileLoop {
    public static void main(String[] args) {

/*sayi al ve rakamalar toplami

 */

int input=565432;
int rakamalarToplami=0;
int birlerBasamagi=0;
int temp=input;

birlerBasamagi=temp%10;
rakamalarToplami+=birlerBasamagi;
temp/=10;//sayi 0 oluncaya kadar yapmali

while (temp>0){
    birlerBasamagi=temp%10;
    rakamalarToplami+=birlerBasamagi;
    temp/=10;

}

        System.out.println(input+  "input sayisininin rakamalar toplami:"+ rakamalarToplami);
    }
}
