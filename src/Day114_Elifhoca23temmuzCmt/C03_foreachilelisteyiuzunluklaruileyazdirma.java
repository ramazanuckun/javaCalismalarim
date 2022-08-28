package Day114_Elifhoca23temmuzCmt;

public class C03_foreachilelisteyiuzunluklaruileyazdirma {
    public static void main(String[] args) {

        /*



    // String[] list = {"fruits", "vegetables", "meat", "milk"};
    // print array with for each loop
    // print length of each element

    // Part 2:
    // Print all the elements from array using for eachLoop
    // If an element starts with 'v' then quit the loop



         */



        String[] list = {"fruits", "meat", "milk","vegetables"};

        for (String each:list
             ) {
            System.out.print(each + ": " +each.length()+ " ");

        }
        System.out.println();

        for (String each1:list
             ) {if (each1.startsWith("v")){//startvish
                 break;
        }
            System.out.println(each1);
        }

        }
    }



