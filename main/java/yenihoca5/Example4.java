package yenihoca5;

public class Example4 {
    //Kütüphaneye eklemek istediğiniz kitapları, adı
    // , yazar adı, sayfa sayısı, seri numarası ile yazdıran bir kod yazınız.
    String kitapadi;
   String yazaradi;
   int sayfasay;
   int serino;
    public Example4(String kitapadi, String yazaradi, int sayfasay, int serino){
        this.kitapadi = kitapadi;
        this.yazaradi = yazaradi;
        this.serino = serino;
        this.sayfasay = sayfasay;
    }
public void kitapbilgiler(){
    System.out.println("kitap adi: " + kitapadi+"\nYazar adi: " + yazaradi+"\nSeri no: " + serino+"\nSayfa sayisi: " + sayfasay);
}
    public static void main(String[] args) {
        Example4 kitaplar=new Example4("cin ali","behcet necatigil",249,2);
kitaplar.kitapbilgiler();

    }
}
