package GenelKonular;

public class Overloading {
    /* diyelim int değer alan bir hesapla fonksiyonu yazdın
    aynı fonksiyonu double değerler için de yazarsan overload yapmış olursun.
    overload olması için: metodların adı aynı olabilir fakat parametre tipi,
    parametre sırası veya parametre sayısının farklı olması gerekir
    */
    static int hesapla (int sayi1, int sayi2){
        return (sayi1+sayi2);
    }
    static double hesapla (double sayi1, double sayi2){
        return (sayi1+sayi2);
    }

    public static void main(String[] args) {
        System.out.println(hesapla(2,3));
        System.out.println(hesapla(2.2,3.3));
    }
}
