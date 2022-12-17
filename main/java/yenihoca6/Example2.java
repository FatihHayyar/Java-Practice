package yenihoca6;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Example2 {
    /*
          Kullanıcıdan alınan cümledeki en uzun kelimeyi(kelimeleri) return eden bir method oluşturunuz.
         */

    public static void main(String[] args) {
        String kelime=findlanwort("damlaya damlaya gol olur");
        System.out.println(kelime);
        System.out.println(enUzunKelime());
    }
    public static String findlanwort(String arr){
        String lang="";
        String arry[]=arr.split(" ");
        for(String w:arry){
            if(w.length()>lang.length()){
                lang=w;
            }


        }
        return lang;
    }//2.yol
    public static List<String> enUzunKelime(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Bir cumle giriniz");
        String cumle = scan.nextLine();
        String arr[] = cumle.split(" ");

        List<String> list = new ArrayList<>();
        int max = 0;
        for (String w : arr) {
            max = Math.max(w.length(), max);
        }
        for (String w : arr) {
            if (w.length() == max) {
                list.add(w);
            }
        }
        return list;
    }
}
