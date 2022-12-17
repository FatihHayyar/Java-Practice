package inheritance;

import java.awt.desktop.SystemSleepEvent;
import java.util.Scanner;

public class Test {
    public Test() {
        System.out.println("hedef 1");

    }
    public Test(String name) {
        this();
        for (int i=name.length()-1; i>=0; i--){
            System.out.print(name.substring(i,i+1).toLowerCase());
        }
        System.out.println();
    }

}
