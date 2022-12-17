package yenihoca5;

import java.util.Scanner;

public class Example1 {
    public static void main(String[] args) {
        /*

Kullanıcıdan aldığınız bir sayi kadar satır ve sütun sayısına sahip alttaki rastgele 0 ve 1'lerden oluşan matriksi yazdırın.

Input: 10

Output:
1 0 0 1 1 0 0 0 1 1
0 0 1 0 1 0 1 0 0 0
0 1 0 1 0 0 0 0 0 1
1 1 1 0 0 0 0 1 1 1
1 1 0 1 1 1 0 1 0 0
1 0 0 0 1 1 0 0 0 0
0 0 1 0 0 0 0 1 1 1
1 1 0 1 0 1 0 0 1 0
0 0 1 0 0 0 0 1 1 0
1 1 1 0 0 1 1 1 1 0

*/
        Scanner scan=new Scanner(System.in);
        System.out.println("satir ve sutun sayisini giriniz");
        int satir=scan.nextInt();
        int sutun=scan.nextInt();
        for(int i=0;i<satir;i++){
            for(int j=0;j<sutun;j++){
                int v= (int) (Math.random()*2);
                System.out.print(v+" ");

            }
            System.out.println();
        }
    }
}
