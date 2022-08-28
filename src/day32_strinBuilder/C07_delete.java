package day32_strinBuilder;

public class C07_delete {
    public static void main(String[] args) {

        StringBuilder sb=new StringBuilder("Java her zaman guzel");

        sb.delete(8,9);//8 dahil 9 dahil sileek
        System.out.println(sb);//Java herzaman guzel


        sb.deleteCharAt(8);

        System.out.println(sb);//Java heraman guzel

int son=sb.length();

        for (int i = 0; i <son ; i++) {
            sb.deleteCharAt(0);
            System.out.println(sb);

            /*Java herzaman guzel
Java heraman guzel
ava heraman guzel
va heraman guzel
a heraman guzel
 heraman guzel
heraman guzel
eraman guzel
raman guzel
aman guzel
man guzel
an guzel
n guzel
 guzel
guzel
uzel
zel
el
l



             */

        }
    }
}
