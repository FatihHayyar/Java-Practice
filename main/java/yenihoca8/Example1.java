package yenihoca8;

public class Example1 {
    //	4 öğrencinin not ortalamasını sırasıyla 6, 4, 3 ve 5 sınav olacak şekilde hesaplayan bir method yazınız.
    public static void ortalamabul(double ...a){
        double top=0;
        for (double w:a){
            top+=w;
        }double ortalama=top/a.length;
        System.out.println(String.format("%.2f",ortalama));
    }

    public static void main(String[] args) {
        ortalamabul(65,78,96,45);
    }
}
