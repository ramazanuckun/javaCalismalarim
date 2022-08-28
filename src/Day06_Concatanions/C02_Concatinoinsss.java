package Day06_Concatanions;

public class C02_Concatinoinsss {
    public static void main(String[] args) {


        String str1="java";

        String str2="Güzeldir";

        int sayi1=5;
        int sayi2=4;


        //yukarıdaki variable'ları kullanarak istenen metinleri yazdıralım

        System.out.println(str1+" "+str2+" "+sayi1+sayi2);//java Güzeldir
        System.out.println(str1+" "+str2+" "+(5+4));//Java Güzeldir 9
        System.out.println(sayi1+sayi2+" "+str1);//9 Java
        System.out.println(""+sayi1+sayi2+" "+str1);//54 java

        System.out.println(str1.concat(str2));;//JavaGuzeldir
        System.out.println(str1.concat(" ").concat(str2));//Java Guzeldir

    }
}
