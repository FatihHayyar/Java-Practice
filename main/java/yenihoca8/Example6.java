package yenihoca8;

import java.util.HashMap;

public class Example6 {
 /*

 Bir String içerisindeki kelimelerin kaç kez tekrar ettiğini bulan bir method yazınız.

 input: "Ali okula geldi ve Ayse de okula geldi."
 output: Ali = 1, okula = 2, geldi = 2, ve = 1, Ayse= 1, de = 1

*/
 public static void main(String[] args) {
     String satz="Ali , okula geldi  ve Ayse  de  okula  geldi. ";
kelimeSay(satz);
 }
 public static void kelimeSay(String s){
     String news=s.replaceAll("\\p{Punct}","").replaceAll("\\s+"," ").trim();
     String str[]=news.split(" ");
     HashMap<String,Integer> kelimeSay=new HashMap<>();
for(String w:str){
    if (!kelimeSay.containsKey(w)){
        kelimeSay.put(w,1);
    }else {
        kelimeSay.put(w, kelimeSay.get(w)+1);
    }
}
     System.out.println(kelimeSay);
 }
}
