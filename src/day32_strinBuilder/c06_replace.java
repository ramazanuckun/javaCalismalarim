package day32_strinBuilder;

public class c06_replace {
    public static void main(String[] args) {

        StringBuilder sb=new StringBuilder("Calm down");

        sb.replace(5,10,"Up");
        System.out.println(sb);//Calm dUp// 4 harfli bir parca aldik yerine 2 harfli ekledik

        sb.replace(4,5,"---");

        System.out.println(sb);//Calm---Up//bosluga--- ekledim





    }
}
