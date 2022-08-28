package Day23_arayList;

import java.util.ArrayList;
import java.util.List;

public class C05_removeSayiSilme {
    public static void main(String[] args) {
        List<Integer>sayilar1=new ArrayList<>();
        sayilar1.add(5);
        sayilar1.add(3);
        sayilar1.add(2);
        sayilar1.add(1);

        System.out.println(sayilar1);//[5, 3, 2, 1]
        sayilar1.remove(1);//remova index te index i 1 olani siler
        System.out.println(sayilar1);//[5, 2, 1]

        //illada 5 i silsin dersek
        //1-silinecek obje  variable tanimla
        //2*index of ile

        //varriable tanimlayarak silme
        Integer sil=5;
        sayilar1.remove(sil);
        System.out.println(sayilar1);//[2, 1]
        //indexof ile silme

        sayilar1.remove(sayilar1.indexOf(2));
        System.out.println(sayilar1);
    }
}
