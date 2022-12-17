package yenihoca2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class soru5 {
    public static void main(String[] args) {
        /*
Bir Array'in Mountain Array olup olmadığını kontrol eden bir kod yazınız.
Mountain Array: Element değerleri bir noktaya kadar sürekli artıp o noktadan sonra sürekli azalan Array.
 */int mount[]={-999,1, 2, 5, 7, 9, 22, 8, 3, 1, -100};
        List<Integer> liste=new ArrayList<Integer>();
        for (int w:mount) {
            liste.add(w);
        }
int max= liste.get(0);
        for (int w:liste) {
            max=Math.max(max,w);
        }
List<Integer> list1=new ArrayList<Integer>();
List<Integer> list2=new ArrayList<Integer>();
   for (int i=0;i<liste.size();i++) {
list1.add(liste.get(i));
if (liste.get(i)==max){
    break;
}
   }
   for (int i= list1.indexOf(max);i<liste.size();i++){
       list2.add(liste.get(i));
   }
        List<Integer> list3=new ArrayList<Integer>();
        List<Integer> list4=new ArrayList<Integer>();
        list3.addAll(list1);
        list4.addAll(list2);
        Collections.sort(list1);
        Collections.sort(list2);
        Collections.reverse(list2);
        if (list1.equals(list3)&&list2.equals(list4)){
            System.out.println("Mounten arraydir");
        }else System.out.println("mounten array degildir");
    }
}
