package yenihoca7;

import java.util.Scanner;

public class Example5 {
    /*Girilen String'de hangi harfin kaç kere kullanıldığını yazan bir kod yazınız.
    Input: String str = "Java is so Good";
    Output: String strOutput = "J1 a2 v1 i1 s2 o3 G1 d1";
     */
    public static void main(String[] args) {


    Scanner scan=new Scanner(System.in);
        System.out.println("bir sey yazin");
        String str=scan.nextLine();
        String arr[]=str.split("");
String sonuc="";
        for (int i=0; i<str.length(); i++) {
            int counter=0;
            for (int j=0; j<str.length(); j++) {
                if(str.charAt(i)==str.charAt(j)){
                    counter++;
                }

            }
            if (!sonuc.contains(str.substring(i,i+1))){
                sonuc+=""+str.charAt(i)+counter+" ";
            }

        }
        System.out.println(sonuc);
} }
