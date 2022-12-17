package yenihoca.ilkders;

import java.text.DecimalFormat;
import java.text.Format;
import java.text.NumberFormat;

public class C01_Variables {
    public static void main(String[] args) {
// Fahrenheit değeri, Celsius değere çeviren kod yazınız.
// formül: c = (f-32)*5/9
        double c=75;
        double d=(c-32)*5/9;

        NumberFormat numberFormat=new DecimalFormat(".##");// virgulden sonra 2 basamak
        System.out.println(d);
        String number=numberFormat.format(d);//bu metot stringe cevirir
        System.out.println(number);
Double.valueOf(number);//tekrar double yaptik





    }

}
