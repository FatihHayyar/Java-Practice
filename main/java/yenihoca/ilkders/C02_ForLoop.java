package yenihoca.ilkders;

import java.util.Scanner;

public class C02_ForLoop {
    public static void main(String[] args) {
        /* TASK :
        Kullanıcıdan 5 adet sayı isteyiniz
        Bu sayılardan 5 ile 10 arasındakiler hariç, diğerlerinin toplamını bulunuz.
        */
        Scanner scan=new Scanner(System.in);
        int toplam=0;
        for (int i=0; i<5; i++){
        System.out.println("bir sayi girin");
        int a= scan.nextInt();
        if (a<10&&a>5){
            continue;
        }toplam=toplam+a;
        }
        System.out.println(toplam);



    }
}
