package farkliSorular;

import java.util.Scanner;

public class Parola {
    public static void main(String[] args) {
//        3) Ternary kullanarak, aşağıdaki kodları konsolda yazdırınız.
//                Parola boşluk karakterinden farklı olarak en az 8 karakter içeriyorsa, "Geçerli Parola",
//                Parola boşluk karakterinden farklı olarak 8 karakterden daha az ise, "Geçersiz Parola"
        Scanner scan=new Scanner(System.in);
        System.out.println("bir parola giriniz");
        String pasword = scan.nextLine();
        String npassword=pasword.replaceAll(" ","");
        System.out.println(npassword.length()>7 ? "gecerli parola" : "gecersiz parola");
    }
}
