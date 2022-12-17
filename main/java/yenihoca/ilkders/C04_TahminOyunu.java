package yenihoca.ilkders;

import java.util.Scanner;

public class C04_TahminOyunu {
    public static void main(String[] args) {
        //0 ile 100 arasında rastgele numara tahmini yapan bir kod yazın.
        //İpucu: Girdiğiniz numara rastgeleNumara'dan küçükse ==> Daha büyük bir numara giriniz.
        //       Girdiğiniz numara rastgeleNumara'dan büyükse ==> Daha küçük bir numara giriniz.
        //       Girdiğiniz numara rastgeleNumara'ya eşitse ==> Tebrikler!!
        Scanner scan=new Scanner(System.in);

        int sayi;
        int say= (int) (Math.random()*100)+1;
        int caunter=1;
        System.out.println("Sayi yarismasina hosgeldiniz...\n0 ile 100 arasi bir sayi girmelisiniz\n5 hakkiniz vardir");
       do {System.out.println("Bir sayi girin");
           sayi=scan.nextInt();
          if
           (sayi==say){
               System.out.println("tebrikler... Kazandiniz...");
break;
           }else if(caunter==6){
               break;
           }
           else if (sayi<say){
               System.out.println("daha buyuk \n"+(5-caunter)+" hakkiniz kaldi ");
               caunter++;
           }else if (sayi>say) {System.out.println("daha kucuk \n"+(5-caunter)+" hakkiniz kaldi ");
               caunter++;
           }



       }while (caunter!=6);
        if
        (caunter==6){
            System.out.println("hakkiniz bitmistir.\nAradiginiz sayi "+say+" dir\nGule gule");

        }
    }
}
