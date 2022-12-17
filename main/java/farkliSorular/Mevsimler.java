package farkliSorular;

import java.util.Locale;
import java.util.Scanner;

public class Mevsimler {
    public static void main(String[] args) {
//        4)1) Aşağıdaki seçenekler doğrultusunda gereken kodu yazınız.
//        a) Aralık, Ocak, Şubat için "Kış"
//        b) Mart, Nisan, Mayıs için "İlkbahar"
//        c) Haziran, Temmuz, Ağustos için "Yaz"
//        d) Eylül, Ekim, Kasım için "Sonbahar"
//        e) Diğerleri için "Geçersiz ay adı"
        Scanner scan=new Scanner(System.in);
        System.out.println("bir ay girin");
        String ay=scan.nextLine();
        String yay=ay.trim().toLowerCase();
        switch (yay){
            case "aralik": case "ocak": case "subat":
                System.out.println("kis mevsimindeyiz");
                break;
            case "mart": case "nisan": case "mayis":
                System.out.println("ilkbahar mevsimindeyiz");
                break;
            case "haziran": case "temmuz": case "agustos":
                System.out.println("kis mevsimindeyiz");
                break;
            case "eylul": case "ekim": case "kasim":
                System.out.println("kis mevsimindeyiz");
                break;
        }
    }
}
