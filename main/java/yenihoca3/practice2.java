package yenihoca3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class practice2 {
    public static void main(String[] args) {
 /*
Kullanıcdan aldığınız bir sayıyı bir list'e ekleyen,
list'ten çıkaran yada mevcut bir elementi o sayı ile güncelleyen bir kod yazınız.
 */

        Scanner input = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();

        while (true){
            System.out.println("Ekleme yapmak icin 'add'\n" +
                    "Guncelleme yapmak icin 'update'\n" +
                    "Silmek icin 'delete'\n" +
                    "Cikmak icin'quit' komutunu giriniz.");

            String option = input.next();

            if(option.equalsIgnoreCase("add")){
                System.out.println("Eklemek istediginz sayiyi giriniz");
                int eklenecekSayi =  input.nextInt();
                list.add(eklenecekSayi);
            }else if (option.equalsIgnoreCase("update")){
                System.out.println("Guncellemek istediginiz sayiyi giriniz");
                int guncellenecekSayi = input.nextInt();
                if (list.contains(guncellenecekSayi)){
                System.out.println("Girmek istediginiz yeni sayiyi giriniz.");
                int yeniSayi = input.nextInt();
                list.set(list.indexOf(guncellenecekSayi), yeniSayi);}
                else System.out.println("bu sayi listede yok");
            }else if(option.equalsIgnoreCase("delete")){
                System.out.println("Silmek istediginiz sayiyi giriniz");
                int silinecekSayi = input.nextInt();
                if (list.contains(silinecekSayi)){
                list.remove((Integer)silinecekSayi);}
                else System.out.println("bu sayi listede yok zaten");
            } else if (option.equalsIgnoreCase("quit")) {
                break;
            }else {
                System.out.println("Gecerli bir komut giriniz");
            }
            System.out.println(list);

        }
        System.out.println("Gule gule!!!");
            }

        }





