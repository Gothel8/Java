package GenelKonular;

public class StaticFinal {
    final String x1= "dista ve static degil";
    final static String x2 = "dista ama static";
    static String x4 = "orjinal";

    void degistir() {
        x4 = "degistirildi";
    }


    public static void main(String[] args) {
        final String x3;
        x3 = "metod icinde";

        StaticFinal degisme = new StaticFinal();
        degisme.degistir();

        System.out.println(x3);
        System.out.println(x2);
        StaticFinal erisme = new StaticFinal();
        System.out.println(erisme.x1);
        System.out.println(erisme.x4);
    }
}

/*

1) final değişkeni metod içinde tanımladıysan alt satırda da değer verebilirsin
ama metod dışında tanımladıysan ilk değeri aynı satırda vermen gerek x1 x2 x3

2) static değişkenlere direkt erişebilirsin diğerleri için nesne oluşturman lazım x1 ve x2

3) Static değişkenler sınıf düzeyinde paylaşıldığı için, herhangi bir nesne tarafından
yapılan değişiklik tüm nesneleri etkiler. x4

4) java static değerlere kendi üstünden erişilmesini tercih ettiği için uyarı verdi erisme.x4

5) her pakette sadece 1 public class olabilir o da paket adıyla aynı olmak zorundadır

6) public classa her yerden erişilebilir, default classlara sadece o paketten erişilir

*/

