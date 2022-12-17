package yenihoca9;

public class Example2 {
    public static void main(String[] args) throws Exception {
        //Faktoriyel hesaplayan bir method yazınız.(Loop kullanmayınız.)

        System.out.println(faktoriyel(5));

    }

    public static int faktoriyel(int sayi) throws Exception {

        if(sayi>0){
            if(sayi==1){
                return 1;
            }else {
                return sayi * faktoriyel(sayi-1);
            }
        }else {
            throw new Exception("Sayi sifirdan buyuk olmali");
        }
    }
}
