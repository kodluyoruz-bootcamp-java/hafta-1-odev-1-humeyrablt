package Average;

public class Average {
    public static void main(String[] args) {
        // 0 ile 2000 *arasında 3,5,7 ve 53'e bölünebilen sayılar?
        int toplam;
        toplam = 0;
        double sayac = 0;
        double ortalama;

        for (int i = 0; i <= 2000; i++) {
            if (i % 3 == 0 && i % 5 == 0 && i % 7 == 0 && i%53==0) {
                System.out.println("Bölünebilen sayılar: " + i);
                toplam = toplam + i;
                sayac++;
            }
        }
        System.out.println("Ortak bölünebilen sayıların toplamı: " + toplam);
        System.out.println("Ortak bölünebilen sayı adedi: " + sayac);
        ortalama = toplam / sayac;
        System.out.println("Bölünebilen sayıların toplamının ortalaması:" + ortalama);

        if (toplam == 0) {
            System.out.println("Sonuç olarak 0 ile 2000 arasında bu sayılara 0 dan başka ortak bölünebilen"
                    + " bir sayı yoktur.");
        } else {
            System.out.println("işlem tamamlanmıştır");
        }
    }

}

