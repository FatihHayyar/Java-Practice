package yenihoca5;

public class Example3 {
    public static void main(String[] args) {
        //Bir Array'in simetrik olup olmadığını kontrol eden bir method yazınız.
        int a[]={1,2,3,4,4,3,2,1};
        boolean ab=true;
        for (int i = 0; i < a.length; i++){
            if (a[i]!=a[a.length-1-i]){
                ab=false;
                break;
            }
        }if (ab==true){
            System.out.println("simetriktir");
        }else System.out.println("simetrik degildir");
    }
}
