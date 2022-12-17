package yenihoca7;

public class Example1 {
    /*
             Alttaki şekli veren bir kod yazınız:
                  1 2 3 4 5 6
                   2 3 4 5 6
                    3 4 5 6
                     4 5 6
                      5 6
                       6
         */
    public static void main(String[] args) {
        String a=" ";
        for (int i = 1; i <7; i++){
            for (int k=0; k <i; k++){
                System.out.print(" ");
            }
            for (int j = i; j <7; j++){
                System.out.print(" "+j);

            }

            System.out.println();
        }


    }
}
