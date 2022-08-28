package Day24_arrayLists_forEachLoop;

public class C07_ArraydakiSayilarinKareToplamiforIcLoop {
    public static void main(String[] args) {

        int[]sayilar={2,3,4,1,5,9,8,3,56,32};

        int toplam=0;
        for (int each:sayilar
             ) {
            toplam+=each*each;
        }
        System.out.println("kareler toplami:"+ toplam);

    }
}
