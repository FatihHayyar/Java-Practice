package yenihoca7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Example2 {
    /*
           Günlük gelir market programı yazınız.
     -Tüm günlerin gelirlerini gösteren bir method,
     -Haftalık gelir ortalamasını gösteren bir method,
     -Hangi günlerin ortalama gelirden fazla geliri olduğunu gösteren bir method,
     -Hangi günlerin ortalama gelirden az geliri olduğunu gösteren bir method,
     */
    static List<String> days = new ArrayList<>(Arrays.asList("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"));
    static List<Integer> earns = new ArrayList<>();
    static int totalearn = 0;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < 7; i++) {
            System.out.println("enter " + days.get(i) + " earnings");
            int d = scan.nextInt();
            earns.add(d);
            totalearn += d;
        }
        System.out.println(earns);
        System.out.println(totalearn);
        System.out.println(getaverage());
        System.out.println(overaverage());
        System.out.println(belowaverage());
    }

    public static double getaverage() {
        return totalearn / 7;
    }

    public static String overaverage() {
        String str = "";
        for (int i = 0; i < 7; i++) {
            if (earns.get(i) > totalearn / 7) {
                str += days.get(i) + " ";


            }
        }
        return str;
    }

    public static String belowaverage() {
        String str1 = "";
        for (int i = 0; i < 7; i++) {
            if (earns.get(i)< (totalearn / 7)) {
                str1 += days.get(i) + " ";


            }
        }
        return str1;
    }

}