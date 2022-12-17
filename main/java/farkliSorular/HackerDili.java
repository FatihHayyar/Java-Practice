package day03IfStatement;

import java.util.Scanner;

public class HackerDili {
    public static void main(String[] args) {
        /*
    Interwiew
    Kullanıcının yazdığı metni, 'hacker'ların konuşma diline çeviren kodu yazınız.
    Hackerlar bazı harfleri sayılara çevirerek yazışabiliyorlar. Genellikle çevirdikleri harfler şu şekilde:
    s -> 5
    a -> 4
    e -> 3
    i -> 1
    o -> 0
    Test data
    hackerDili("java ile hersey guzel")
    j4v4 1l3 h3r53y guz3l
    İpucu harfleri değiştirin ve ekrana yazdırın.

   */





            Scanner input = new Scanner(System.in);
            System.out.println("Lutfen bir cumle giriniz");
            String cumle=input.nextLine().toLowerCase();

            String arr[]=new String[cumle.length()];

            for (int i = 0; i <cumle.length(); i++) {
                arr[i]=cumle.substring(i,i+1);
                System.out.print(arr[i]);

            }
            System.out.println();

            for (int i = 0; i <cumle.length() ; i++) {
                if(arr[i].contains("s")){
                    arr[i]="5";
                }
                if(arr[i].contains("a")){
                    arr[i]="4";
                } if(arr[i].contains("e")){
                    arr[i]="3";
                } if(arr[i].contains("i")){
                    arr[i]="1";
                } if(arr[i].contains("o")){
                    arr[i]="0";
                }
                System.out.print(arr[i]);
            }
    }
}
