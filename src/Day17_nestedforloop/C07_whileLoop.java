package Day17_nestedforloop;

public class C07_whileLoop {
    public static void main(String[] args) {

        // 20 ten 50 e kadar olan cift sayilari hersey dahil yazdiralim

        //1 foor loop cozum

        int baslangic=20;
        int bitis=50;

        for (int i = baslangic; i <=bitis ; i++) {if (i%2==0){
            System.out.println(i+ " ");
        }
            System.out.println("");
        }
int temp=baslangic;
        while (temp<=bitis){if (temp%2==0){
            System.out.print(temp+ "");
        }
        temp++;
        }

    }
}
