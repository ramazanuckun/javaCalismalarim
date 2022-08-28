package Day31_timeFormatter_varargs;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class C01_TimeFormatter {
    public static void main(String[] args) {

        LocalDateTime tarihSaat=LocalDateTime.now();

        System.out.println("ilk olusturulan tarih:"+ tarihSaat);//2022-07-26T06:49:13.129756400

        DateTimeFormatter dtf1=DateTimeFormatter.ofPattern("dd/M/yy hh:mm");//26/7/22 06:52
        System.out.println(dtf1.format(tarihSaat));

        DateTimeFormatter dtf2=DateTimeFormatter.ofPattern("d/MMM/yyyy HH:mm");
        System.out.println(dtf2.format(tarihSaat));//26/Tem/2022 06:54//slaytlarda hangi karakter ne anlama geliyor

}}
