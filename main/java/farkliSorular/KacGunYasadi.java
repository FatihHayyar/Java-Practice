package farkliSorular;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class KacGunYasadi {
    public static void main(String[] args) {
//        6) Ali'nin kaç gün yaşadığını bulan kodu yazınız.
//        Ali'nin doğum tarihi 12 Mayıs 2002'dir.

        LocalDate aliyas=LocalDate.of(2002,5,12);
        LocalDate guncel=LocalDate.now();
       int fark= (int) ChronoUnit.MONTHS.between(aliyas,guncel);
        System.out.println(fark);
    }
}
