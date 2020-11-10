package Decimelround;

import java.util.Locale;
import java.util.Scanner;

public class Round {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        scan.useLocale(Locale.US);
        System.out.println("Ondalıklı bir sayı giriniz: ");
        double i = scan.nextDouble();

        System.out.println("Girdiğiniz sayıyı aşağı yuvarlamak isterseniz DOWN," +
                " yukarı yuvarlamak isterseniz TOP yazınız: ");

        String onay = "DOWN";
        String onay2 = "TOP";
        String giris = scan.next();

        if (onay.equals(giris)) {
            System.out.println("Sayınız aşağı yuvarlandı:" + Math.floor(i));

        } else if (onay2.equals(giris)) {
            System.out.println("Sayınız yukarı yuvarlandı: " + Math.ceil(i));
        } else {
            System.out.println("Geçersiz giriş yaptınız.");
        }

    }
}



