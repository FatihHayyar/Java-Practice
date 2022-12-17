package farkliSorular;
//2). Soru
//        İlk altı asal sayıyı listeleyerek: 2, 3, 5, 7, 11 ve 13, 6. asal
//        sayının 13 olduğunu görebiliriz.
//        10001. asal sayı kaçtır?
import java.util.Scanner;

public class KacinciAsalSayi {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("kacinci asal lazim ?");
        int n=scan.nextInt();
int top=0;
int counter=0;
for (int j = 2; j >0;j++){
    top=0;
for (int i = 1; i <j; i++) {

    if (j%i==0) {
        if (i==1){
            continue;
        }

        top += i;
    }
}if (top == 0) {
        counter++;
    }

if (counter==n){
    System.out.println(n+". asal sayi= "+j);
    break;
}
}
    }
}

