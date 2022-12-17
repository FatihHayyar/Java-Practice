package yenihoca5;

import java.util.Scanner;

public class Example2 {
    public static void main(String[] args) {
        //Kullanıcıdan aldığınız sayi kadar karakter uzunluğuna sahip rastgele şifre üreten bir kod yazınız.
        Scanner scan=new Scanner(System.in);
        System.out.println("sifre kac karakter olsun");
        int uzn=scan.nextInt();
        String karakterler ="ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        for (int i=0; i<uzn; i++){
            int sayi= (int) (Math.random()*karakterler.length());
            System.out.print(karakterler.charAt(sayi));
        }
    }
}
