package pratiksuden119agsts;

import java.util.ArrayList;
import java.util.Arrays;

public class C01 {
    public static void main(String[] args) {

/*

Integer olarak artan değerler şeklinde verilen dizinin elemanlarının karesini alıp yine artan
değerlerde ekrana yazdıran metod oluşturunuz

Örnek :

Input: nums = [-4,-1,0,3,10]
Output: [0,1,9,16,100]

 */
       int[] num= {-4,-1,0,3,10};
        sorteArray(num);
        System.out.println(Arrays.toString(sorteArray(num)));
int []num2=Arrays.stream(num).map(t->t*t).sorted().toArray();
        System.out.println(Arrays.toString(num2));
//toArray=istedigim array e ulasyorum

    }
    public static int[]sorteArray(int[]num){

        //static bir medhodda static olmayan method kullanmam
        //program ayaga kaklmadan once statik once calisir


        for (int i =0;i<num.length;i++){

            num[i]=num[i]*num[i];



        }
        Arrays.sort(num);
        return num;
    }
}
