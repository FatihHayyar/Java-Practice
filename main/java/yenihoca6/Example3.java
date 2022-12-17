package yenihoca6;

import java.util.Scanner;

public class Example3 {
    /*
      Kullanıcıdan aldığınız bir metni 'Atbash Code' yöntemi ile şifreleyen bir kod yazınız.
      Ortadoğuda kullanılan en eski şifreleme biçimlerinden biridir.
      Arami alfabesinin tersten yazılması ile oluşturulan bir kodlayıcıya sahiptir.
      Örn: A-->Z, B-->Y ...
      "abcdefghijklmnopqrstuvwxyz";
      "zyxwvutsrqponmlkjihgfedcba";
     */

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("bir metin girin");
        String metin= scan.nextLine();
        for(int i=metin.length()-1;i>-1; i--){
            System.out.print(metin.charAt(i));
        }
        System.out.println();
        System.out.println("sifrelenecek metni gir");
        String psw=scan.nextLine();
        String st1= "abcdefghijklmnopqrstuvwxyz";
        String str2="zyxwvutsrqponmlkjihgfedcba";
        for (int k=0;k<psw.length(); k++){
            for (int j=0;j<st1.length(); j++){
                if (psw.charAt(k)==st1.charAt(j)){
                    System.out.print(str2.charAt(j));

                }
            }
        }

    }
}
