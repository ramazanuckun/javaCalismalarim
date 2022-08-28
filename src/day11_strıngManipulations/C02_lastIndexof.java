package day11_strıngManipulations;

public class C02_lastIndexof {
    public static void main(String[] args) {

        String cumle="java cok kolay,java cok guzel";
        String kelime="Java";

        //verilen kelime için asagıdaki sartlardan uygun olanı yazan bir cumle yazın
        // verilen kelime cümlede klanımmaıs-v.k.s.1 kere kllnılmış-v.k.c.birden fazka kullanılmışint

        int kelimeİlkındex=cumle.indexOf(kelime);
        int kelimeSonIndex=cumle.lastIndexOf(kelime);

        if (kelimeİlkındex==-1){
            System.out.println("verilen kelime cümlede kullanılmamıs");
        }else if (kelimeİlkındex==kelimeSonIndex){
            System.out.println(" verilen kelime cumlede 1 kere kullanılmış");
        }else {
            System.out.println("verilen kelime birden fazlla kullanılmıs");
        }




    }
}
