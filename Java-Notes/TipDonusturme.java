package GenelKonular;

public class TipDonusturme {
    public static void main(String[] args) {
        String yeni = "5";
        int yeni1 = Integer.valueOf(yeni);
        int yeni2 = Integer.parseInt(yeni);
        System.out.println(yeni1*yeni2);

        int deger= 9;
        String deger1 = String.valueOf(deger);
        String deger2 = String.valueOf(deger);
        System.out.println(deger1+" "+deger2);

        double sayi1 = 345.2;
        int sayi2 = (int)sayi1;
        System.out.println(sayi2);

        int sayi3 = 345;
        double sayi4 = (double)sayi3;
        System.out.println(sayi4);


    }
}


/*

1) stringden integera dönüştürürken ya valuof ya da parseint kullanılır
valuof daha yavaştır ve int türünde bir nesne döndürür
parseint int türünde değişken döndürür = yeni

2) integerdan stringe döndürürken
ya string sınıfından valuof ya da integer sınıfından tostring kullanılır = deger

3) double ve int gibi değişkenler arasında dönüşüm yaparken (int) şeklinde
belirtmek yeterli = sayi2 ve sayi4

4) telefon numarası gibi sayıları okunurluk açısından 444_456_43_22 şeklinde yazabilirsin
arada _ yokmuş gibi işlem yapılır. 1_1 + 1_2 = 23 üşendiğğim için koda yazmadım

diğer dönüşümler sayfa 78de
 */