package day30_immutable_date;

import java.time.LocalDate;
import java.time.Period;

public class C07_Period {
    public static void main(String[] args) {

        LocalDate tarih1=LocalDate.of(1981,8,18);//iki tarih farkini bulma

        LocalDate bugun=LocalDate.now();

        Period period=Period.between(tarih1,bugun);
        System.out.println(period);//P-40Y-11M-5D
        System.out.println(period.getYears());//-40


    }
}
