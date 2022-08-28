package day32_strinBuilder;

public class C05_IndexOf_LastIndexOf {
    public static void main(String[] args) {



        StringBuilder sb=new StringBuilder("Pay attention please");

    sb.indexOf("pay");//

        System.out.println(sb);//

        System.out.println(sb.indexOf("e"));//ilk e harfini dondurur//7

        System.out.println(sb.indexOf("e",10));//10.indexten sonraki ilk harfinin index i

        System.out.println(sb.lastIndexOf("e"));//aramayi sonda yapar ve ilk e harfinin bulur getrr//19

        System.out.println(sb.lastIndexOf("e",10));//geriye dogru arayacak//7

    }
}
