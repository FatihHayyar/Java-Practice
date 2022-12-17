package yenihoca.ilkders;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class C02_ArraysElementSil {
    public static void main(String[] args) {
/*
     Elementlerini kullanıcan alarak bir integer Array oluşturunuz.
     Kullanıcıdan bir indeks alınız ve o indeksteki elementi siliniz.
     */
Scanner scan=new Scanner(System.in);
        System.out.println("array kac elemanli olsun");
int a= scan.nextInt();
int arr[]=new int[a];
int yenarr[]=new int[a-1];
int sayac=0;
for ( int i=0 ;i<a; i++) {
    System.out.println("Array in "+(i+1)+". ci elmani girin");
    arr[i]=scan.nextInt();
}
        System.out.println("kacinci indexi silmek istiyorsun");
int index= scan.nextInt();
for ( int i=0 ;i<a; i++) {

    if (i==index){
        continue;

    }else {
        yenarr[sayac] = arr[i];
        sayac++;
    }
}

        System.out.println(Arrays.toString(yenarr));

//2.yol
        List<Integer> liste=new ArrayList<>();
        for (int w:arr){
            liste.add(w);
        }liste.remove(index);
        System.out.println(liste);
}
}