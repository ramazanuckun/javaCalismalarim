package aaaaaaaa;

import java.sql.Array;
import java.util.*;

public class BMuhasebe{

    public static void main(String[] args) {

String str1="Hellooo";
    harfSayisiBul(str1);
    }

    private static void harfSayisiBul(String str1) {

        HashMap<String,Integer>map=new HashMap<>();
        String arr[]=str1.split("");
        System.out.println(Arrays.toString(arr));
        for (String w:arr
        ) {if (!map.containsKey(w)){
            map.put(w,1);
        }else {
            map.put(w,map.get(w)+1);

        }
        }


    }
}


