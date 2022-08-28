package Day111_ElifHocaCmt;

public class C03_stringManipulatiaon {
    public static void main(String[] args) {
        // String seklinde verlen asagidaki fiyatlarin toplamini bulunuz
        // String  str 1= "$13.99"
        // String str 2= "$10.55"
        // ipucu: Double parseDouble() methodunu kullanabilirsiniz.

     /* Regular Expression(regex) : Belli turdeki characterleri secebilmemize yarar.
		 1) \\d    ==> tum rakamlar
		  	 \\D    ==> tum rakam disi character ler
		 2) \\w   ==> A->Z		a->z			0->9    _
		 	 \\W  ==> A->Z		a->z			0->9    _ disindaki hersey
		 3) \\s   ==> space
		 	 \\S   ==> space disindaki hersey  */

        String sayi1="$13.99";
        String sayi2="$10.55";

        sayi1=sayi1.replaceAll("\\D","");
        sayi2=sayi2.replaceAll("\\D","");
        System.out.println(sayi1+sayi2);//birlestiri toplamaz
        double sayi11=Double.parseDouble(sayi1);
double sayi22=Double.parseDouble(sayi2);//strin gi sayiyi cevirme methodu

        double toplam=(sayi11+sayi22)/100;
        System.out.println("$"+toplam);//$24.54/
    }
}
