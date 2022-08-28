package lambda_functional_programming01;

import java.util.ArrayList;
import java.util.List;

public class tekrar01 {
    public static void main(String[] args) {


        List<Integer> listeee = new ArrayList<>();
        listeee.add(9);
        listeee.add(131);
        listeee.add(10);
        listeee.add(9);
        listeee.add(10);
        listeee.add(2);
        listeee.add(8);
        System.out.println(listeee);
        list(listeee);
        System.out.println();
        lamba(listeee);
        System.out.println();
        ciftsayilari(listeee);
        System.out.println();
        teksayilar(listeee);
        System.out.println();
        ardisiktek(listeee);
        System.out.println();
        cift(listeee);





    }
public  static void list(List<Integer>list){

    for (Integer w:list
         ) {
        System.out.println(w+ " ");
    }
}

public static void lamba(List<Integer>list){

        list.stream().forEach(t-> System.out.println("t = " + t));


}
public static void ciftsayilari(List<Integer>list){

        list.stream().filter(t->t%2==0).forEach(t-> System.out.println("t = " + t));
}
public static void teksayilar(List<Integer>list){

        list.stream().filter(t->t%2!=0).map(t->t*t).forEach(t-> System.out.print("t = " + t));

}
public static void ardisiktek(List<Integer>list){

        list.stream().distinct().filter(t->t%2!=0).map(t->t*t*t).forEach(t-> System.out.println(t));

}
public static void cift(List<Integer>list){
      Integer cift= list.stream().distinct().filter(t->t%2==0).map(t->t*t).reduce((t,u)->t+u).get();
  //  Integer cift= list.stream().distinct().filter(t->t%2==0).map(t->t*t).reduce(0,(t,u)->t+u);
    System.out.println(cift);

}
}
