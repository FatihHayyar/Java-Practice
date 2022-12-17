package yenihoca3;

import java.util.ArrayList;
import java.util.List;

public class Practice4 {
    public static void main(String[] args) {
        /*
         * İki Array'de ortak bulunan elementleri yazdırınız.
         * (case sensitivity olmadan)

         * Input1 : {John,Brad,Angel,Sofia,Emily} Input2 : {sofia,brad,grace,emily,hazel}

         * Output : [brad,sofia,emily]
         */
        String arr1[]={"John","Brad","Angel","Sofia","Emily"};
        String arr2[]={"grace","Brad","hazel","Sofia","Emily"};
        List<String> list=new ArrayList<String>();
        for (String w:arr1) {
            for (String v:arr2) {
                if (w.equals(v)) {
                    list.add(w);
                }


            }
        }
        System.out.println(list);

    }
}
