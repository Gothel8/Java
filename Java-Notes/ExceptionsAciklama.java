package GenelKonular;

public class ExceptionsAciklama {
    /*

    Throwable
├── Error (Hatalar)
│   ├── OutOfMemoryError
│   ├── StackOverflowError
│   └── ...
└── Exception
    ├── RuntimeException (Unchecked Exceptions)
    │   ├── NullPointerException
    │   ├── ArithmeticException
    │   ├── ArrayIndexOutOfBoundsException
    │   └── ...
    ├── IOException (Checked Exceptions)
    ├── SQLException
    ├── FileNotFoundException
    └── ...

    */




    /*

    1. Checked Exceptions (Kontrollü İstisnalar)
    Bu tür istisnalar, derleme (compile-time) sırasında kontrol edilir ve kodunuzda try-catch kullanarak ya da throws anahtar kelimesiyle ele alınmaları zorunludur. Genelde dış kaynaklardan (dosya, veritabanı, ağ) kaynaklanan hatalar bu kategoriye girer.

    Örnekler:
    IOException: Giriş/çıkış işlemlerinde oluşan hatalar (örn. dosya bulunamadı, okuma hatası).
    SQLException: Veritabanı işlemleri sırasında oluşan hatalar.


    2. Unchecked Exceptions (Kontrolsüz İstisnalar)
    Bu istisnalar, çalışma zamanı (runtime) sırasında oluşur ve derleme sırasında kontrol edilmez. Genelde programlama hatalarından kaynaklanır (örneğin, yanlış bir değişken kullanımı, yanlış aritmetik işlemler).

    Tüm Unchecked Exceptions, RuntimeException sınıfını genişletir.

    Örnekler:
    ArithmeticException: Matematiksel bir işlem hatası (örn. sıfıra bölme).
    NullPointerException: null referansı üzerinden bir metoda veya değişkene erişilmeye çalışıldığında oluşan hata.
    ArrayIndexOutOfBoundsException: Dizi sınırlarının dışında bir indekse erişim.

    3. Error Sınıfı
    Error sınıfı, genelde programın kurtarılamaz durumlarını ifade eder. Bu hatalar, JVM (Java Virtual Machine) ile ilgilidir ve program tarafından yönetilmesi beklenmez.

    Örnekler:
    OutOfMemoryError: JVM’in belleği tükenirse oluşur.
    StackOverflowError: Sonsuz döngüde veya çok derin bir özyinelemeli (recursive) çağrıda yığın (stack) taşarsa oluşur.
     */

}
