package Day07_ifStaternnes;

import java.util.Scanner;

public class C05_ifEls {
    public static void main(String[] args) {
        //kllnıcıdan bir karakter iste girlen harf olup olmadıgını iste


        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen bir karakter giriniz");
        char harf = scan.next().charAt(0);


        if ((harf >= 'a' && harf <= 'z') || (harf >= 'A' && harf <= 'Z')) {
            System.out.println("Girilen karakter bir harf");

        } else {
            System.out.println("Girilen karakter bir harf değil");
        }
    } }