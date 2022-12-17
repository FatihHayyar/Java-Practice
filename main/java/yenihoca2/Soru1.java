package yenihoca2;

import java.util.Arrays;

public class Soru1 {
    public static void main(String[] args) {
        //Array içerisindeki elementlerin işaretlerini(+-) değiştiren bir kod yazınız.
// input : 1,2,-3,4,-5,-6
//output :-1,-2,3,-4,5,6
        int arr[] = {1,2,3,-4,-5};
        int arr2[] =new int[arr.length];
        int i = 0;
        for (int w:arr) {
         arr2[i] =-w;
i++;
        }
        System.out.println(Arrays.toString(arr2));




    }
}
