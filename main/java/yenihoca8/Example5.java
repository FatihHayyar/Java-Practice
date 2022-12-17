package yenihoca8;

import java.util.HashMap;

public class Example5 {
    /*
      İki farklı Array'de aynı indekste barındırırılan ad ve soyadları örnekteki gibi yazdıran bir kod yazınız.
          input : {"John", "Mark", "Ali"}; {"Doe", "Twain", "Can"};
          output : {John=Doe, Mark=Twain, Ali=Can};
       */
    public static void main(String[] args) {
        String name[]={"John", "Mark", "Ali"};
        String surname[]={"Doe", "Twain", "Can"};
        HashMap<String,String>  fullname = new HashMap<>();
        for (int i=0;i< name.length;i++) {
            fullname.put(name[i],surname[i]);
        }
        System.out.println(fullname);

    }
}
