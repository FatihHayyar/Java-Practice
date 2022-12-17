package yenihoca8;

import java.util.HashMap;

public class Example2 {
    //    Bir map içerisinde verilen fiyatların toplamını bulan bir kod yazınız.(for each loop kullanınız)
//    Örn: {Kemer=19.99, Gömlek=29.99, Ayakkabı=89.99, Kazak=24.99, Kravat=19.99} ==> Toplam: 184.95}
    public static void main(String[] args) {
        HashMap<String,Double> kiyafet=new HashMap<>();
        kiyafet.put("Kemer",19.99);
        kiyafet.put("Gömlek",29.99);
        kiyafet.put("Ayakkabı",89.99);
        kiyafet.put("Kazak",29.99);
        kiyafet.put("Kravat",19.99);
        double top=0;
        for(double w:kiyafet.values()) {
            top +=w;
        }
        System.out.println("toplam="+top);
    }
}