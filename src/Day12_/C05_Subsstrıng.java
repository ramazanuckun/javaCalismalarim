package Day12_;

public class C05_Subsstrıng {
    public static void main(String[] args) {

      //kullanıcıdan 4 harfli bir kelime alınız ve alınan kelimeyi terten yazdırın.
      String input="veli";
      String tersİnput=input.substring(3)+
        input.substring(2,3)+
        input.substring(1,2)+
        input.substring(0,1);

        System.out.println(tersİnput);
    }
}
