package yenihoca9;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class Example3 {
    public static void main(String[] args) throws IOException {
        //Bir text dosyasındaki 3. satırın kelime sayısını veren bir kod yazınız.
        BufferedReader file=new BufferedReader(new FileReader("C:/Users/fatihh07/Downloads/HelloWorld.txt"));
        file.readLine();//ilk satiri
        file.readLine();//2.satiri okur
        String line3=file.readLine();//3.satiri okur
        System.out.println(line3);
        String[] arr=line3.split(" ");
        System.out.println(Arrays.toString(arr));
        System.out.println(arr.length);

        //Son satırı okutma...
        String line = null;
        while (file.readLine() != null) {
            line = file.readLine();
        }
        System.out.println(line);
    }
}
