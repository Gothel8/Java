package GenelKonular;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ExceptionHandlingDemo {

    public static void main(String[] args) {

        // try-catch örneği: Hata oluşabilecek kodu deniyoruz
        try {
            int result = 10 / 0; // ArithmeticException
        } catch (ArithmeticException e) {
            System.out.println("Bir hata oluştu: " + e.getMessage());
        }

        // finally bloğu: Her durumda çalışır
        try {
            int[] array = {1, 2, 3};
            System.out.println(array[5]); // ArrayIndexOutOfBoundsException
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Hata: Dizi sınırlarının dışına erişildi.");
        } finally {
            System.out.println("Finally bloğu her zaman çalışır.");
        }

        // finally bloğunda try-catch kullanımı
        try {
            int number = Integer.parseInt("123");
            System.out.println("Sayı: " + number);
        } catch (NumberFormatException e) {
            System.out.println("Sayı formatı hatası.");
        } finally {
            try {
                int result = 10 / 0; // ArithmeticException
            } catch (ArithmeticException e) {
                System.out.println("Finally içinde bir hata yakalandı: " + e.getMessage());
            }
        }

        // throw ifadesi: Bir hatayı manuel olarak fırlatma
        try {
            kontrolEt(15); // Yaş 18'den küçük, IllegalArgumentException fırlatılır
        } catch (IllegalArgumentException e) {
            System.out.println("Hata: " + e.getMessage());
        }

        // throws örneği: Bir metodun hata fırlatabileceğini bildirme
        try {
            dosyaOku();
        } catch (FileNotFoundException e) {
            System.out.println("Hata: Dosya bulunamadı.");
        }

        // catch ifadesinde çoklu tip kontrolü
        try {
            int number = Integer.parseInt("abc"); // NumberFormatException
            int[] array = new int[3];
            System.out.println(array[5]); // ArrayIndexOutOfBoundsException
        } catch (NumberFormatException | ArrayIndexOutOfBoundsException e) {
            System.out.println("Bir hata oluştu: " + e.getMessage());
        }

        // Birden fazla catch bloğu ile hata yakalama
        try {
            File file = new File("yok.txt");
            Scanner scanner = new Scanner(file); // FileNotFoundException
        } catch (FileNotFoundException e) {
            System.out.println("Dosya bulunamadı.");
        } catch (Exception e) {
            System.out.println("Genel bir hata oluştu: " + e.getMessage());
        }
    }

    // throw örneği: Hata fırlatan bir metod
    public static void kontrolEt(int yas) {
        if (yas < 18) {
            throw new IllegalArgumentException("Yaş 18'den küçük olamaz.");
        }
    }

    // throws örneği: Hata fırlatabileceğini bildiren bir metod
    public static void dosyaOku() throws FileNotFoundException {
        File file = new File("dosya.txt");
        Scanner scanner = new Scanner(file); // FileNotFoundException fırlatılabilir
    }
}
