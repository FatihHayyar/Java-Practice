package yenihoca3;

import java.util.Scanner;

public class Practice1 {
    public static void main(String[] args) {
 /*

Girilen yil ve ay numarasına göre ayin kaç gün olduğunu yazdiran bir kod yazınız.
    Girdi yıl: 2000 ay: 2
    Çıktı: 29

*/
Scanner scan=new Scanner(System.in);
        System.out.println("yil girin");
        int yil=scan.nextInt();
        System.out.println("ay girin");
        int ay=scan.nextInt();
        switch(ay){
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                System.out.println("31 gun vardir");
            break;
            case 4: case 6: case 9: case 11:
                System.out.println("30 gun vardir");

            break;
            case 2:
                System.out.println(yil%400==0 ? 29:(yil%4==0 ? 29:28));
            break;


        }



    }
}
