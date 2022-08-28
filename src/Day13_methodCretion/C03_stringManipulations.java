package Day13_methodCretion;

import javax.xml.crypto.dsig.spec.XSLTTransformParameterSpec;

public class C03_stringManipulations {

    public static void main(String[] args) {
        // Soru 1) String methodlarini kullanarak
        // “  Java ogrenmek123 Cok guzel@  ”  String’ini
        // “Java ogrenmek cok guzel.” sekline getirin.
   String str="  Java ogrenmek123 Cok guzel@  ";

        str=str.trim();//bosluklar kalktı.//Java ogrenmek123 Cok guzel@

        str=str.replaceAll("\\d","");//rakamlar kalkıyor ve yerine bosluk geliyor//Java ögrenmek Cok guzel@

      str=str.replace("@","");//bu asamada @ isareti yerine bosluk geldi .....guzel

        str=str.replace("C","c");
        str=str+".";//bu asamada . koyduk istenilen format oldu

        System.out.println(str);


    }

}
