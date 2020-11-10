package Average;

public class Average53 {
    public static void main(String[] args) {
        int toplam;
        toplam = 0;
        double sayac= 0;
        double ortalama;

        for (int i =0; i <= 2000; i++){
            if (i%53== 0 ){
                System.out.println(i );
                toplam = toplam + i ;
                sayac++;
            }         }
        System.out.println( "53 e bölünebilen sayıların toplamı: " + toplam );
        System.out.println( "53 e bölünebilen sayı adedi "+ "(0 dahil) :" + sayac );
        ortalama = toplam/sayac;
        System.out.println("Bölünbilen sayıların toplamının ortalaması: " + ortalama );
    }
}
