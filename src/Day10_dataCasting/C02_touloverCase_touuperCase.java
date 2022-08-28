package Day10_dataCasting;

import java.util.Locale;

public class C02_touloverCase_touuperCase {
    public static void main(String[] args) {

        String str="Beni psikopata baglamayın";
        System.out.println(str.toUpperCase());
        System.out.println(str.toLowerCase(Locale.ROOT));
        System.out.println(str.toUpperCase(Locale.forLanguageTag("Tr")));


    }
}
