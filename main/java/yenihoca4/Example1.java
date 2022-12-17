package yenihoca4;

import java.util.Scanner;

public class Example1 {
    public static void main(String[] args) {
        //Kullanıcıdan aldığınız iki karakterin arasında bulunan tüm karakterleri yazdıran bir kod yazınız.

        Scanner scan=new Scanner(System.in);
        System.out.println("bir karakter girin");
        char ilk=scan.next().charAt(0);
        System.out.println("ikinci karakter girin");
        char iki=scan.next().charAt(0);
        if(ilk<iki){
        for(char i=++ilk; i<iki; i++) {
            System.out.print(i+" ");
        }}
        else { for(char i=++iki; i<ilk; i++) {
            System.out.print(i+" ");
        }
        }
    }
}
