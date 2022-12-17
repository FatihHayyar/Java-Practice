package yenihoca9;

public class Example4 {
    //Rastgele alınan harfleri bir Stringe ekleyerek adınızı oluşturan
    // ve bunu kaç deneme ile yaptığını yazdıran bir kod yazınız.
    public static void main(String[] args) {
        String abc="abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        int counter=0;
        String yenisim="";
int max=abc.length();
        String isim="Fatih";
        for (int i=0; i<isim.length(); i++) {
            while (true){
                int rndsayi= (int) (Math.random()*max);
               char c = abc.charAt(rndsayi);
counter++;
if (isim.charAt(i)==c){
    yenisim+=c;
    System.out.println(yenisim+" "+counter);
    break;
}
            }

        }
        System.out.println(yenisim+" i "+counter+" defada buldu");
    }
}
