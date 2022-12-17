package yenihoca9;

import java.util.Scanner;

public class Example7 {
    public static void main(String[] args) {
        //Uc haneli bir sayıyı ingilizce okunuşuna çeviren bir kod yazınız.
        Scanner input = new Scanner(System.in);
        System.out.println("Uc basamakli sayi giriniz");
        int sayi = input.nextInt();
        int birlerbas = sayi % 10;
        int onlarbas = (sayi / 10) % 10;
        int yuzler = sayi / 100;
        if (sayi > 99 && sayi < 1000) {

            switch (yuzler) {
                case 1:
                    System.out.print("Yüz");
                    break;
                case 2:
                    System.out.print("İkiyüz");
                    break;
                case 3:
                    System.out.print("Üçyüz");
                    break;
                case 4:
                    System.out.print("Dörtyüz");
                    break;
                case 5:
                    System.out.print("Beşyüz");
                    break;
                case 6:
                    System.out.print("Altıyüz");
                    break;
                case 7:
                    System.out.print("Yediyüz");
                    break;
                case 8:
                    System.out.print("Sekizyüz");
                    break;
                case 9:
                    System.out.print("Dokuzyüz");
                    break;
            }
            switch (onlarbas) {
                case 1:
                    System.out.print("On");
                    break;
                case 2:
                    System.out.print("Yirmi");
                    break;
                case 3:
                    System.out.print("Otuz");
                    break;
                case 4:
                    System.out.print("Kırk");
                    break;
                case 5:
                    System.out.print("Elli");
                    break;
                case 6:
                    System.out.print("Atmış");
                    break;
                case 7:
                    System.out.print("Yetmiş");
                    break;
                case 8:
                    System.out.print("Seksen");
                    break;
                case 9:
                    System.out.print("Doksan");
                    break;
            }

            switch (birlerbas) {
                case 1:
                    System.out.print("Bir");
                    break;
                case 2:
                    System.out.print("İki");
                    break;
                case 3:
                    System.out.print("Üç");
                    break;
                case 4:
                    System.out.print("Dört");
                    break;
                case 5:
                    System.out.print("Beş");
                    break;
                case 6:
                    System.out.print("Altı");
                    break;
                case 7:
                    System.out.print("Yedi");
                    break;
                case 8:
                    System.out.print("Sekiz");
                    break;
                case 9:
                    System.out.print("Dokuz");
                    break;
            }

        } else {
            System.out.println("Geçerli pozitif sayı giriniz");
        }
    }}
