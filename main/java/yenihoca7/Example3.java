package yenihoca7;

import java.util.Scanner;

public class Example3 {
    /*
     Kullanıcıdan alınan bir String içerisindeki rakamların toplamını hesaplayan bir method yazınız.
     Örn:
     input : J4\/4 1$ 34$¥
     output : 16
     İpucu:
     Character.isDigit()
     Integer.valueOf()
    */
    public static int numbersum(String str){
     int sum=0;
     for(int i=0;i<str.length();i++){
         if(Character.isDigit(str.charAt(i))){
             sum+=Integer.valueOf(""+str.charAt(i));
         }
     }
    return sum;
    }

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("birsey yazin");
        String wort= scan.nextLine();
        System.out.println(numbersum(wort));

    }
}
