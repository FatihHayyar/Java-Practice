package yenihoca2;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class Soru3 {
    public static void main(String[] args) {
//        Bir top belirli yükseklikten atılmaktadır.
//                Atıldıktan sonra, atıldığı yüksekliğin 3/4 u kadar yerden yukarı doğru zıplamaktadır
//        Top zıplama  yüksekliği 1 metrenin altına indiğinde durmaktadır.
//        Bu ana kadar aldigi toplam yolu ve yere vurma sayısını bulan do while code blogu create ediniz.
double high=9;
int counter=0;
double yol=0;
do {yol+=high;
    high=high*3/4;
    counter++;
    yol+=high;
}while (high>1);
        NumberFormat nf=new DecimalFormat(".##");

        System.out.println("top "+counter+" defa seker");
        System.out.println("top "+nf.format(yol)+" kadar yol gider");
    }
}
