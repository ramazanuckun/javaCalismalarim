package Day14_methodCretion;

import Day13_methodCretion.C04_methodCredtion;

public class C01_methodCretion {
    public static void main(String[] args) {
        //input olarak verilen 4 harfli bir string i tersten yazdıran bir method yazdıralım.

   terstenYazdır("okan");



    }

    public static void terstenYazdır(String input){

        String tersInput=input.substring(3)+
                input.substring(2,3)+
                input.substring(1,2)+
                input.substring(0,1);
        System.out.println("Verilen Kelimenin tersten yazılısı:"+tersInput);





    }



}
