package farkliSorular;

public class UcBasamakliEnBuyukPalindrom {
    public static void main(String[] args) {
        int maks=100;
        for (int i = 100; i <1000; i++) {
            String k=String.valueOf(i);
            String kutu="";

            for (int j = 2; j >-1; j-- ){
                kutu+=k.charAt(j);
            }
            int yenii= Integer.valueOf(kutu);
            if (yenii==i&&i>maks){
                maks=i;
            }
        }
        System.out.println(maks);

    }
}
