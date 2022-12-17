package yenihoca.ilkders;

import java.util.Scanner;

public class C02_IfDiskremnant {
    public static void main(String[] args) {
//        katsayıları verilen 1 bilinmeyenli denklemin kökleriniz bulunuz.
//        ax^2 + bx + c;
//        Çözüm adımları
//        kullanıcıdan a,b,c yi alın.
//        Diskriminant formulü: (-b +/- karekök(delta)) / (2a)
//        Delta = bb - 4ac
//        Delta > 0 => 2 tane kök vardır x1=(-b + kök(d)) / (2a)  , x2= (-b - kök(d)) / (2*a)
//        Delta = 0 => 1 tane kök vardır x = -b/2a
//        Delta < 0 ise kök yoktur.
//                */
Scanner scan=new Scanner(System.in);
        System.out.println("a yi giriniz"  );
        double a=scan.nextDouble();
        System.out.println("b yi giriniz"  );
        double b=scan.nextDouble();
        System.out.println("c yi giriniz"  );
        double c=scan.nextDouble();
        double delta=(b*b)-(4*a*c);
        if(delta>0){
            System.out.println("2 tane kok vardir");
            double x1=(-b - Math.sqrt(delta)) / (2*a);
            double x2=(-b + Math.sqrt(delta)) / (2*a);
            System.out.println("1. kok= "+x1);
            System.out.println("2. kok= "+x2);
        }else if(delta==0){
            System.out.println("1 tane kok vardir");
            double x3=-b/(2*a);
            System.out.println("1. kok= "+x3);
        }else System.out.println("kok yoktur");




    }
}
