package Day04_dataCasting;

public class C03_AutoWidening {
    public static void main(String[] args) {
    // dar veri turündeki bir degeri,genis veri türündeki variable atar
        byte sayı1=23;
        short sayı2=55;

        int sayı3=sayı1+sayı2;// 78

        double sayı4= sayı1*sayı2;//1265.0


        sayı4=(double) sayı2/sayı1;//sayı ondalıklı çıksın diye parantezle genşletme yaptık

        System.out.println(sayı4);



    }
}
