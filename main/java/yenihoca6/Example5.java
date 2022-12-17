package yenihoca6;

import java.util.Scanner;

public class Example5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("boy girin");
        double boy=scan.nextDouble();
        System.out.println("kilo girin");
        double kilo=scan.nextDouble();
Example51 user1=new Example51(boy,kilo);
user1.hesapla();


    }
}
