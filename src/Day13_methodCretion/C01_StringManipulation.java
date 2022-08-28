package Day13_methodCretion;

public class C01_StringManipulation {
    public static void main(String[] args) {
                  /*
        Soru 2) String seklinde verlen asagidaki fiyatlarin toplamini bulunuz
        String str1 = “$13.99”
        String str2 = “$10.55”
        ipucu : Double.parseDouble() methodunu kullanabilirsiniz.
         */

        String dolar1="$13.99";
        String dolar2="$10.55";
        dolar1=dolar1.replaceAll("\\D","");
        double para1=Double.parseDouble(dolar1);

dolar2=dolar2.replaceAll("\\D","");
double para2=Double.parseDouble(dolar2);
        System.out.println("$"+(para1+para2)/100);


        System.out.println(dolar1+" "+dolar2);




    }
}


