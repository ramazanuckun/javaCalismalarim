package Day24_arrayLists_forEachLoop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C03_TekrarEdenSayilar {
    public static void main(String[] args) {

        //bir arraydaki tekrr eden elemetlerti yazdirin

        int[]arr={2,3,5,6,3,5,4,1,9,6 ,3};

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));//siraladik
        List<Integer>tekrarEdenler=new ArrayList<>();
        for (int i = 0; i <arr.length-1; i++) {if (arr[i]==arr[i+1])
        {
            System.out.print(arr[i]+" ");//3 3 5 6 //3 yazdirilmamliydi bunu engellemek icin forloop tan once bir


        }
        }

    }
}
