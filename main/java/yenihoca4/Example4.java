package yenihoca4;

public class Example4 {
    public static void main(String[] args) {
//Ürün adı, ürün fiyatı ve (varsa) son kullanma tarihlerini yazdıran bir market programı yazınız..

        Example4Market product = new Example4Market("tomate",2.99,"10.10.2023");
        Example4Market product2 = new Example4Market("Water",1,"10,10.2023");
        System.out.println(product.nameOfPrdoduct+" "+product.priceOfPrdoduct+" "+product.lastDateOfPrdoduct);
        System.out.println(Example4Market.totalproduct);

    }
}
