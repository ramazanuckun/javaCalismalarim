package day32_strinBuilder;

public class C04_SubSeugense {
    public static void main(String[] args) {

        StringBuilder sb=new StringBuilder("Kayra");

        sb.substring(0,3);
        System.out.println(sb);//Kayra geldi //ama neden

        sb.subSequence(0,3);
        System.out.println(sb);// kayra//string oldugu icin dondurdugu stringbilder deger degizmez



    }}
