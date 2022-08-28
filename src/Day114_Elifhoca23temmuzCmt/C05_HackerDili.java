package Day114_Elifhoca23temmuzCmt;

import java.util.Arrays;
import java.util.Scanner;

public class C05_HackerDili {
    public static void main(String[] args) {




// KullanÄ±cÄ±nÄ±n yazdÄ±ÄŸÄ± metni, 'hacker'larÄ±n konuÅŸma diline Ã§eviren bir method(method ismi hackerDili) yazÄ±nÄ±z.
//    Hackerlar bazÄ± harfleri sayÄ±lara Ã§evirerek yazÄ±ÅŸabiliyorlar. Genellikle Ã§evirdikleri harfler ÅŸu ÅŸekilde:
//    s -> 5
//    a -> 4
//    e -> 3
//    i -> 1
//    o -> 0
//    Test data
//    hackerDili("java ile hersey guzel")
//    j4v4 1l3 h3r53y guz3l
//    Ä°pucu harfleri deÄŸiÅŸtirin ve ekrana yazdÄ±rÄ±n.


        Scanner scanner=new Scanner(System.in);
        System.out.println("Lutfen ifadeyi giriniz");
String cumle=scanner.nextLine().toLowerCase();

hackerDili(cumle);


    }

    static void hackerDili(String cumle) {

        String[]arr=new String[cumle.length()];

        for (int i = 0; i <cumle.length() ; i++) {

            arr[i]=cumle.substring(i,i+1);// 0 al biri almam 2 deger arasds

           if (arr[i].contains("s")){
               arr[i]="5";
           }
            if (arr[i].contains("a")){
                arr[i]="4";
            }
            if (arr[i].contains("e")){
                arr[i]="3";
            }  if (arr[i].contains("i")){
                arr[i]="1";
            }  if (arr[i].contains("o")){
                arr[i]="0";
            }
            System.out.print(arr[i]);//j4v4 1l3 h3r53y c0k guz3l

        }


    }

}

