package Static;

import static java.lang.Math.*;  // Math sınıfının static üyelerini import ediyoruz
import static Static.Helper.*;  // Kendi yazdığımız Helper sınıfının static üyelerini import ediyoruz

public class Main {
    public static void main(String[] args) {

        // Math sınıfı static üyelerinin kullanımı
        double result = pow(3,4);                  // Math.pow yerine sadece pow yazıyoruz
        double root = sqrt(16);                    // Math.sqrt yerine sqrt yazıyoruz
        System.out.println("3^4: " + result);     // Çıktı: 3^4: 81.0
        System.out.println("Karekök: " + root);  // Çıktı: Karekök: 4.0

        // Helper sınıfı static üyelerinin kullanımı
        String greeting = greet("Ahmet");       // Helper.greet yerine sadece greet
        int product = multiply(6, 7);          // Helper.multiply yerine sadece multiply
        System.out.println(greeting);               // Çıktı: Merhaba, Ahmet!
        System.out.println("Çarpım: " + product);  // Çıktı: Çarpım: 42
    }
}
