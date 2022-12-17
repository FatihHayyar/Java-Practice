package farkliSorular;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class DateSorusu {
    public static void main(String[] args) {
//        5)1) Eğer saat
//        i) 24:00 ile 05:00 arasında ise konsola 'Uyku zamanı' yazdırınız.
//                ii) 08:00 ile 16:00 arasında ise konsola 'Çalışma zamanı' yazdırınız.
//                iii) 19:00 ile 22:00 arasında ise konsola 'Aile zamanı' yazdırınız.
//                iv) Diğerleri için konsolda 'Kişisel zaman' yazdırınız.
        LocalTime hours = LocalTime.now();
       double yenisi=hours.getHour();

        if (yenisi < 05.00 && yenisi >= 00.00) {
            System.out.println("Uyku Zamani");
        } else if (yenisi < 16.00 && yenisi >= 08.00) {
            System.out.println("Calisma Zamani");

        } else if (yenisi < 22.00 && yenisi >= 19.00) {
            System.out.println("Aile Zamani");
        } else System.out.println("kisisel zaman");

    }}