package yenihoca.ilkders;

import java.util.Scanner;

public class C02_Nested {
    public static void main(String[] args) {
/*
       2 boyutlu bir tablo olarak, ekrana çarpım tablosunu hesaplayıp yazan kodu yazınız.
       Örnek Ekran çıktısı
       1  2  3  4  5
       2  4  6  8 10
       3  6  9 12 15
       4  8 12 16 20
       5 10 15 20 25
       Ekran çıktısı 5 x 5 boyutları için örnek olarak verilmiştir,
       isterseniz boyutları klavyeden okuyup istenen boyutlara göre
       ekrana basan bir kod yazabilirsiniz.
    */
        Scanner scan=new Scanner(System.in);
        System.out.println("kac sutun olsun");
        int sutun=scan.nextInt();
        System.out.println("kac satir olsun");
        int satir=scan.nextInt();
        for (int i=1; i<sutun+1; i++){
            for (int j=1; j<satir+1; j++){
                System.out.print(String.format("%02d",i*j)+" ");//2 satirda yazilmasi icin yaptik
            }
            System.out.println();


        }



    }
}
