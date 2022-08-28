package Day17_nestedforloop;

public class C06_NestedForLoop {
    public static void main(String[] args) {

        //verilen strin i asagidaki gibi yazdiran bir program yazin

        /*input=deniz
        D
        DE
        DEN
        DENI
        DENIZ
         */
        String input="Isparta";

        for (int i = 1; i <=input.length() ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print(input.substring(j-1,j));//

            }
            System.out.println("");
        }


    }
}
