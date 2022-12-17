package yenihoca.ilkders;

import java.util.Scanner;

public class C01_If {
    public static void main(String[] args) {
//        Kullanıcıdan üç adet sayı alarak bu sayıların
//        bir dik üçgenin kenar uzunlukları olup olmadığını hesaplayan bir kod yazınız.
        Scanner scan=new Scanner(System.in);
        System.out.println(" 3 kenari girin");
        int a= scan.nextInt();
        int b= scan.nextInt();
        int c= scan.nextInt();

if (a*a+b*b==c*c||a*a+c*c==b*b||b*b+c*c==a){
    System.out.println("dik ucgendir");
}else System.out.println("degildir");






    }
}
