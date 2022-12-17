package yenihoca5;

import java.awt.event.KeyAdapter;
import java.text.DecimalFormat;
import java.text.NumberFormat;

public class Example5 {
    //Kare prizma, silindir ve koninin hacmini hesaplayan bir kod yazınız.(Inheritance kullanınız)

    public static void main(String[] args) {
        Example5KarePrizma karealan=new Example5KarePrizma();
        System.out.println(karealan.hacim(5, 6));

        NumberFormat frmt=new DecimalFormat(".##");

        Example5Slindir silalan=new Example5Slindir();
        System.out.println(frmt.format(silalan.hacim(3, 5)));

        Example5Koni konialan=new Example5Koni();
        System.out.println(frmt.format(konialan.hacim(3, 5)));
    }
}
