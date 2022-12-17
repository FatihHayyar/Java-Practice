package yenihoca6;

public class Example1 {
/*
      Array olarak verilen bir cümleyi String olarak negatif anlamıyla yazdıran bir kod yazınız.
      Input:
      String[] arr={"J","a","v","a","I","s","D","i","f","f","i","c","u","l","t"};
      Output:
      String output ="JavaIsNOTDifficult";
       */
public static void main(String[] args) {
    String[] arr={"J","a","v","a","I","s","D","i","f","f","i","c","u","l","t"};
    for (int i=0; i<6; i++) {
        System.out.print(arr[i]);
    }
    System.out.print("not");
    for (int i=6;i<arr.length; i++) {
        System.out.print(arr[i]);
    }

}
}
