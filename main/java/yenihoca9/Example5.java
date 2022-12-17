package yenihoca9;

public class Example5 { /*
Parametrelerinin ilki hariç  karakter sayılarını toplayan ve
 bu toplamı birinci parametrenin karakter sayısıyla çarpan bir kod yazınız.
(indeks ve if statement kullanmayınız)
   */
    public static void main(String[] args) {
        System.out.println(carp("hasan", "veli", "ali"));
    }
public static int carp(String... a){
    int top=0;
    for(int i=1;i<a.length;i++){
       top+=a[i].length();
        }
    int sonuc=top*a[0].length();
    return sonuc;
    }
}

