package yenihoca4;

public class Example3 {
    public static int  hacim(int a){

        return a*a*a;
    }
    public static void hacim(int a,int h){
        System.out.println(a*a*h);
    }
    public static void hacim(int a,int h,int b){
        System.out.println(a*b*h);
    }
    public static void main(String[] args) {
//Küp, kare prizma ve dikdörtgen prizmanın hacmini hesaplayan bir method oluşturunuz.(Method overloading kullanınız)

        System.out.println(hacim(5)); //metotlari static yaptigim icin object olusturmaya gerek yok
hacim(5,6); //ama baska class dan statik olmayan metodu cagirmak icin object olusturmak zorundayim.
hacim(5,6,7);

    }
}
