package yenihoca6;

public class Example4 {
    public static void main(String[] args) throws Exception {
        /*
   randomSayi isminde bir method oluşturunuz.
   Bu method içerisinde iki int random sayı oluştursun. (0'dan 10 a kadar)
   Bu iki random sayının toplamını yazdırın.
   Eğer bu iki random sayının toplamı 12 den küçükse "Exception" versin ve mesaj olarak
   ("Sayı 12'den küçük ise hata verir") yazdırın.
     */

        System.out.println(randomSayi());
    }
    public static int randomSayi() throws Exception {
      int  a= (int) (Math.random()*10);
        int b= (int) (Math.random()*10);
        int top=a+b;
        if (top<12){
            throw new Exception("Sayi 12 den kucuk olamaz");

        }else
        return top;
    }

}
