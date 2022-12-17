package yenihoca3;

import java.util.ArrayList;
import java.util.List;

public class practice3 {
    public static void main(String[] args) {
List<Integer> list=new ArrayList<>();
        List<Integer> list2=new ArrayList<>();
list.add(16);
list.add(20);
list.add(30);
list.add(40);
list.add(50);
int top=0;
        for(int w:list) {
            top+=w;
        }
for(int w:list) {
    if (w>top/list.size()){
        list2.add(w);
    }
}
        System.out.println("ortalama= "+top/list.size());
        System.out.println("ortalamanin ustundeki sayilar= "+list2);
    }
}
