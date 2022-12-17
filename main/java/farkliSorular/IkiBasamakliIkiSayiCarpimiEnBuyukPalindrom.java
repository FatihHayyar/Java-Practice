package farkliSorular;

public class IkiBasamakliIkiSayiCarpimiEnBuyukPalindrom {
    public static void main(String[] args) {
//        1) Palindromik bir sayı her iki şekilde de aynı şekilde
//        okunur. 2 basamaklı iki sayının çarpımından elde edilen en büyük palindrom
//        9009 = 91 × 99'dur.
//        3 basamaklı iki sayının çarpımından oluşan en büyük palindromu
//        bulun.

    int c;
    int ikincisayi=0;
    int ilksayi=0;
    int max = 100;
        for (int i = 100; i <1000; i++) {
        for (int j =100; j <1000; j++) {
            c=i*j;
            if (c==terscevir(c)&&c>max){
                max = c;
                ilksayi=i;
                ikincisayi=j;
            }

        }
    }
        System.out.println(ilksayi+"*"+ikincisayi+"="+max);

}
    public static int terscevir(int a){
        String kutu="";
        int ters = 0;
        String terssayi=String.valueOf(a);
        for (int i =terssayi.length()-1; i>-1; i--) {
        kutu+=terssayi.charAt(i);
        ters=Integer.valueOf(kutu);
        }
        return ters;

} }
