package yenihoca3;

import java.util.Scanner;

public class Practice5 {
    public static void main(String[] args) {
        //Bir string in Palindrome olup olmadigini Stringbuilder ile yapin
        Scanner scan=new Scanner(System.in);
        System.out.println("bir kelime girin");
        String klm= scan.nextLine();
        StringBuilder sb=new StringBuilder(klm);
        String revers= String.valueOf(sb.reverse());

        System.out.println(sb);
        System.out.println(revers);
        if (klm.equals(revers)){
            System.out.println("palindromdur");
        }else System.out.println("degildir");
    }
}
