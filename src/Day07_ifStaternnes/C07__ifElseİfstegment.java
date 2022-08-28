package Day07_ifStaternnes;

import java.util.Scanner;

public class C07__ifElseİfstegment {
    public static void main(String[] args) {


       /*
        bir onceki soruda, kullanici negatif deger girerse uyaralim
        NOT : birden fazla if - else if birbirine baglanmissa
        son durum onemlidir
        eger else ile bitiyorsa butun ihtimaller kapsaniyor demektir
        ama else if ile bitiyorsa kapsanmayan durumlar olabilir
         */

Scanner scan=new Scanner(System.in);
        System.out.println("lütfen yaşınızı giriniz");
int yas=scan.nextInt();
if(yas<0){
    System.out.println("lütfen gecerli bir yas giriniz");
} else if (yas < 65) {
    System.out.println("emekli olamazsın"+(65-yas)+"yıl yazmalısın");}else{
    System.out.println("emekli olabirsin");}
}

    }

