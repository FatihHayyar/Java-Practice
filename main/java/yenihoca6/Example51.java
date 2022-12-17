package yenihoca6;

public class Example51 {
    /*
    BMI hesaplama kodu yazınız. (Güvenliği göz ardı etmeyin).
    BMI(Vücut Kitle Endeksi):
    BMI, vücut kütlesinin vücut boyunun karesine bölünmesi olarak tanımlanır.
    Başlıca yetişkin BMI sınıflandırmaları, zayıf (18,5 kg/m2'nin altında), normal ağırlık (18,5 ila 25),
    fazla kilolu (25 ila 30) ve obez (30 veya daha fazla) şeklindedir.
   */
    private double boy;
    private double kilo;

    public Example51(double boy, double kilo) {
        this.boy = boy;
        this.kilo = kilo;
    }

    public Example51() {
    }

    public double getBoy() {
        return boy;
    }

    public void setBoy(double boy) {
        this.boy = boy;
    }

    public double getKilo() {
        return kilo;
    }

    public void setKilo(double kilo) {
        this.kilo = kilo;
    }

    public void  hesapla() {
double indeks=kilo/(boy*boy);
    System.out.println(indeks);
if (indeks<18.5&& indeks>0){
    System.out.println("zayıf");
} else if (indeks>18.5&& indeks<25) {
    System.out.println("normal");
}else if (indeks>25&& indeks<30) {
    System.out.println("kilolu");
}else if (indeks>30) {
    System.out.println("obez");
}else System.out.println("yanlis deger");

}

}
