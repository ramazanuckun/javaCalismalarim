package Day40_final;

final public class B extends A{
    public static void main(String[] args) {
/*
bir class final edilmisse onu kimse inherid edilemez

 */

   B obj=new B();
   obj.isim="Alp";
        System.out.println(A.OKUL);

        System.out.println(Integer.MAX_VALUE);
        System.out.println(Short.MIN_VALUE);
    }
}
