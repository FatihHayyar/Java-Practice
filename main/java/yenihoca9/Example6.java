package yenihoca9;

import java.time.LocalTime;

public class Example6 {
    //İki java işlemi arasındaki çalışma zamanı farkını gösteren bir kod yazınız.
    public static void main(String[] args) {
        int first=LocalTime.now().getNano();
        boolean tt=false;
        for (int i=2; i<7; i++) {
            if(7%i == 0) {
                break;

            }else{
                tt=true;
            }

        }
        if(tt) {
            System.out.println("asaldir");
        }else System.out.println("degildir");
        int second=LocalTime.now().getNano();
        System.out.println(second+"-"+first+"="+(second-first));
    }
}
