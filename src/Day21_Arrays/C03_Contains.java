package Day21_Arrays;

import java.util.Scanner;

public class C03_Contains {
    public static void main(String[] args) {

        // Soru 3- Kulanicidan aldiginiz bir ismin,verilen array’de olup olmadigini kontrol

        String[]isimler={"basak","nurullah","fatih","adem","enes"};

        Scanner scan=new Scanner(System.in);
        System.out.println("aradiginiz ismi yaziniz");
String arananIsim=scan.nextLine();

boolean sonuc=contains(isimler,arananIsim);

if (sonuc){
    System.out.println("var");
}else {
    System.out.println("yok");
}


    }

    private static boolean contains(String[] isimler, String arananIsim) {

        boolean sonucMethod=false;

        for (int i = 0; i <isimler.length ; i++) {if (isimler[i].equalsIgnoreCase(arananIsim)){


            sonucMethod=true;

        }

        }



        return  sonucMethod;
    }


}
