package yenihoca3;

public class Practice6Runner {
    public static void main(String[] args) {
        //basit bir ev butcesi kodu yazin
Practice6 baba=new Practice6();
        System.out.println(Practice6.butce);
        baba.maasal(5000);
        System.out.println(Practice6.butce);
        baba.harclikal(1000);
        baba.haclikharca(300);
        baba.erzakal(500);
        System.out.println(Practice6.butce);
        System.out.println(baba.harclik);
        Practice6 anne=new Practice6();
        anne.maasal(3000);
        anne.harclikal(1000);
        anne.erzakal(1000);
        anne.haclikharca(900);
        System.out.println(Practice6.butce);
        System.out.println(baba.harclik);
        System.out.println(anne.harclik);
    }
}
