package lambda_functional_programming01;

public class method {


    public static void aynisatirBosluk(Object o){
        System.out.print(o+" ");

    }
    public static boolean ardisikcift(int x){
        return x%2==0;
    }

    public static boolean tekler(int x){

        return x%2!=0;
    }
    public static int kareAl(int x){

        return x*x;
    }
    public static int kupAl(int x){

        return x*x*x;
    }
    public static double yarisiniAl(int x){

        return x/2.0;
    }
    public static char ilkKarakterAl(String str){

        return str.charAt(0);
    }
    public static char sonKarakter(String str){

        return str.charAt(str.length()-1);
    }
}
