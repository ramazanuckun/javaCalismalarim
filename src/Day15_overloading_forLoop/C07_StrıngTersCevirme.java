package Day15_overloading_forLoop;

public class C07_StrıngTersCevirme {
    public static void main(String[] args) {


        // input olarak verilen Stringi terse cevirip yazdiran bir method olusturun
        String input="derdi dünya olanın dünyalar kadar derdi olurmus";
        terstenYazdir(input);
    }
    public static void terstenYazdir(String input) {
        String tersInput=input.substring(input.length()-1);
        for (int i = input.length()-2; i >=0 ; i--) {
            tersInput+=input.substring(i,i+1);
        }
        System.out.println(tersInput);









    }
}
