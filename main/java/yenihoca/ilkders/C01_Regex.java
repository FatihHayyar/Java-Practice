package yenihoca.ilkders;

public class C01_Regex {
    public static void main(String[] args) {
        //Bir String değerin belirli sayıda karakter içerip belirli
        // bir karakter ile bitip bitmediğini kontrol eden bir kod yazınız
String str="as13er";
        System.out.println(str.matches(".."));//2 nokta 2 karakterli mi demek
        str.matches(".s");// herhangi bir karakterle baslayip "s" ile mi bitiyor
        str.matches("..s");// 3 karakterli mi
//2.karakter s mi in belirli bir karakter olup olmadigini kontrol edin
        str.matches(".s.*");
//Bir String değerin sadece harf içerip içermediğini kontol eden bir kod yazınız.
        str.matches("[a-zA-Z]*");
        //Bir String değerin belirli bir sayıda belirli karakterleri
        // içerdiğini kontrol eden bir kod yazınız.
        str.matches("[a-zA-Z]{5}"); // 5 tane harf olsun
        //Bir String değerin belirli karakterleri en az belirli
        // sayıda içerip içermediğini kontrol eden bir kod yazınız.
        str.matches("[0-9]{5,}");//5 ve fazla rakam olsun
//Bir String değerin belirli karakterleri en az ve en çok belirli
// sayıda içerip içermediğini kontrol eden bir kod yazınız.
        System.out.println(str.matches("\\w{4,6}")); //4 en fazla 6 olsun. sayilar dahildir
        // ilk karakter 1, ikinci karekter noktalama işareti ve
        // kalan 8 karakter rakam toplam 10 karakter olmali
        System.out.println(str.matches("[1][\\p{Punct}][0-9]{4}"));
    }
}
