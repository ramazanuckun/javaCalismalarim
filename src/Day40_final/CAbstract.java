package Day40_final;

public abstract class CAbstract {


    void toplama() {

        System.out.println("Bu method toplama yapar");


    }

    abstract void carpma();

    /*
   bir method basina abstract yazarsaniz bu methodun child classlar icin bir standartold/declara etmis olursunuz
   ve method badisine ihtiyac kalmaz


     */


abstract  void bolme();



}