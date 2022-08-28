package Day114_Elifhoca23temmuzCmt;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import static Day114_Elifhoca23temmuzCmt.C05_HackerDili.hackerDili;

public class tekkk {
    public static void main(String[] args) {
/*
//   Write a method which accepts a String as parameter
//   and prints the sum of the digits, present in the given string.
//   input : ade1r4d3
//   output : 8

 */

        String sayi="ade1r4d3";
int toplam=0;
toplam+=Integer.parseInt(sayi.replaceAll("\\D",""));
        System.out.println(toplam);
int total=0;
while (toplam>0)
{
    total+=toplam%10;
    toplam/=10;
}
        System.out.println("stringdeki sayilar toplami\n"+total);

    }}


