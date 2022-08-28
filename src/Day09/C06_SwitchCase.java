package Day09;

public class C06_SwitchCase {
    public static void main(String[] args) {
        /*kllanıcıdan gün ismi alın hafta içi veya
         hafta sonu olduğunu yazdırın


         */

        String input="pazartesi";
        switch (input){
            case "pazartesi":
                System.out.println("hafta içi");
            case "salı":
                System.out.println("hafta içi");
            case "persembe":
                System.out.println("hafta içi");
            case "cuma":
                System.out.println("hafta içi");
            case "cumartesi":
                System.out.println("hafta sonu");
            case "pazar":
                System.out.println("hafta sonu");
     

        }





    }
}
