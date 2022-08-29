package ZPROJEMIRACHOCAILE;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Llesson2_Array_ArrayList {

    //ayni data tipinden olusan dizilere array denir
    //kiritik soru ayni data tipi denmesidir

    public static void main(String[] args) {

        String[]pazarSepeti=new String[5];
        String[]pazarSepeti2={"elma","patates","kivi","karpuz","muz"};
        //2 sekli ile aray tanimaladi yukarida
        String[]pazarSepeti3;

   //     pazarSepeti3[0]="elma";
        /*
        array kisitlamalari var uzunlugu belirlemem lazim eger uzunluk belli ise bu yapida aray kullanilir
        elaman sayisi belli degil ise aray kullanilamaz
        uzunluk azaltilmaz ayni zamanda lengh ne azalir ne cogalir
        iste bunu cozmek icin biz collections lar kullanilir
         */
//Collecsionslar====////
      /*
1-Abstract ile interface farki =abs.inter.ikisindende consructur uretemem
2-list interface diri arraylist child clastir
obje oluatrmak icin concred olmasi lazim interface lerde olusmaz onun icin ArrayList<>()
not =bir kod yazarken nerede Aray nerede araylist kullanmama lazim bilmeme lazim en basta

       */

        List<String>listpazarSepeti2=new ArrayList<>();//artik esnek bi r yapidayim

        listpazarSepeti2.add("elma");
        listpazarSepeti2.add("patates");
        listpazarSepeti2.add("kivi");
        listpazarSepeti2.add("karpuz");
        listpazarSepeti2.add("muz");
        listpazarSepeti2.add("patates");
     //  List<String>listpazarsepeti2=Arrays.asList(pazarSepeti2);//deger atamasi yaptim
      //  System.out.println("listpazarsepeti2.size() = " + listpazarsepeti2.size());//size uzunluk verir collection yapilarinda lengh misali
   //     listpazarsepeti2.add(4,"cikolata");//

       // listpazarsepeti2.set(0,"pasta");

//set te ekliyor add kullandigim yerde set kullandim ayni mi
        //hayir collectin yapilarda set kullaniyorsam 2 defa dusunmem lazim eger indexte yoksa set kullanirsak exeopsion firlatir
//once size ile uzunluk alacagim sonra atama yapacagim yoksa exception firlatr
        //belli bir index e ulasmak istiyorsam get methodu kullaniyorum
        System.out.println("listpazarsepeti2.get(2) = " + listpazarSepeti2.get(2));

        if (!listpazarSepeti2.contains("ketcap"))listpazarSepeti2.add("ketcap");
//! ile yoksa add ile ketcap eklenir
        System.out.println(listpazarSepeti2);


    }

}
