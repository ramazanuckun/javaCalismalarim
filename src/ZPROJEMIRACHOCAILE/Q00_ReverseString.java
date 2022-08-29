package ZPROJEMIRACHOCAILE;

import java.sql.Array;
import java.util.Arrays;

public class Q00_ReverseString {
    public static void main(String[] args) {
        String name="Java Dunyasi cok guzel";//(n)kadar calisir ben bunu n/2 zamanana dusurebilirmiyim
        System.out.println("reverse(name) = " + reverse(name));
    }public static String reverse(String name){
        String str2="";

        String []str=name.split("");//her bir harfi arraf atadim
       /* 1.yol yavas
       for (int i =str.length-1; i >=0 ; i--) {
            str2 += str[i];//java dunyasi tersten yazildi leng kadar gonguye giriyor
        }
return str2;
2*yol ASAAGIDA HIZLI
     */
       String temp="";
        for (int i = 0; i<str.length; i++) {

            String start=str[i];
            String end=str[str.length-(i+1)];
            if(start==end)break;
            temp=start;
            start=end;
            end=temp;
            str2=str2+start;

        }

return str2;

    }
}








//efektif kod yazacagiz==donanim kaynaklarini daha az kullanarak daha az daha kaliteli kod yazma