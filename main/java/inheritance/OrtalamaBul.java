package inheritance;

public class OrtalamaBul extends Test{
    public void findAverage(int a, int b) {
        int average=(a+b)/2;
        System.out.println("Aritmetic Average: " + average);
    }
    public double getAverage(int a,int b) {
        double average=Math.sqrt(a*b);
        return (average);
    }
    public OrtalamaBul(){
this("12","hasan");


    }
    public OrtalamaBul(int ...a){
        int top=0;
        for(int i=0;i<a.length;i++){
            top+=a[i];
        }
        int ort=top/a.length;
        System.out.println("ortalama="+ort);
    }
    public OrtalamaBul(String name, String vorname){
super("ali");
        System.out.println("hedef c");
    }
}
