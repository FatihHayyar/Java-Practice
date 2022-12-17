package yenihoca.ilkders;

import java.util.Scanner;

public class C01_StringManipulations {
    public static void main(String[] args) {
/*
       Kullanıcıdan tek seferde alacağınız 2 kelimelik ad soyadı 2 ayrı kelimeye ayırınız,
       ad ayrı soyad ayrı sekilde ekrana yazdırınız.
       Örn:
       Ad: Ali
       Soyad: Can
       */
        Scanner scan=new Scanner(System.in);
        System.out.println("tam adinizi girin");
//        String s=scan.next();
//        String s2= scan.next();
//        System.out.println("Ad: "+s);
//        System.out.println("Soyadd: "+s);
//2.yol

        String tamisim= scan.nextLine();
int i=tamisim.indexOf(" ");
String isim= tamisim.substring(0,i);
String soyisim=tamisim.substring(i+1);
        System.out.println(isim);
        System.out.println(soyisim);
    }
}
