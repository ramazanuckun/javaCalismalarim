package day11_strıngManipulations;

import javax.print.DocFlavor;

public class C01_indexof {
    public static void main(String[] args) {


        /*herhangi ibir strıng de herhaangi bir char ın veya string in ilk kullanıldığı indek si bize dondurur

         */

        String str="java ögrenmek cok guzel";//6
        System.out.println(str.indexOf('g'));//7
        System.out.println(str.indexOf("r"));//-1
        System.out.println(str.indexOf("j"));
        System.out.println(str.indexOf("mek"));//bir blok gibi düşünür ilk harfi verir :10


        System.out.println(str.indexOf("g"));//bunu yazdığğıımızda yazılan ındeksten baslar
        //yukarıdaki str de . ve 3. nin indeklerinin bulun
        //2. e yi bulabilmel için 1.  e nin indeksine ihtiyac var

        int ilke=str.indexOf("e");
        int ikincie=str.indexOf("e",ilke+1);
        //eger 2.e varsa 3.enin olup olmadığı
        //ve varsa index ini yazdıralım
        if (ikincie==-1){
            System.out.println("verilen str da 2.e yok");
        }else {int ucuncue=str.indexOf("e",ikincie+1);
        if (ucuncue==-1){
            System.out.println("verilen str de 3.e yok");
        }else {
            System.out.println("verilen str deki 3.enin idekx i:"+ucuncue);
        }}


    }
}
