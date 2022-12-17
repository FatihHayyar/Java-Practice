package farkliSorular;
//2) 2520, 1'den 10'a kadar olan sayıların her birine kalansız
//        bölünebilen en küçük sayıdır.
//        1'den 20'ye kadar olan sayıların tamamına tam bölünebilen en küçük pozitif sayı
//        kaçtır ?
public class YirmiyeKadarSayilarinEkoku {
    public static void main(String[] args) {
        int top = 0;
        int j=21;

        while (true) {
            top=0;
            j++;
            for (int i = 2; i <12; i++) {
                top += j % i;
            }
            if (top==0){
                System.out.println(j);
                break;
            }
        }
    }
}
