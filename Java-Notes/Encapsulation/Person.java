package Encapsulation;

public class Person {
    // Private alanlar: Dışarıdan doğrudan erişilemez
    private String name;
    private int age;

    // Constructor (Kurucu metot)
    public Person(String name, int age) {
        this.name = name;
        setAge(age); // Setter kullanımı (doğrulama yapılabilir)
    }

    // Getter: Name değerini dışarıya döndürür
    public String getName() {
        return name;
    }

    // Setter: Name değerini dışarıdan alır ve atar
    public void setName(String name) {
        if (name != null && !name.isEmpty()) {
            this.name = name;
        } else { // kullanıcı adını girmeden enter a basarsa
            System.out.println("Geçersiz isim!");
        }
    }

    // Getter: Age değerini döndürür
    public int getAge() {
        return age;
    }

    // Setter: Age değerini dışarıdan alır ve atar
    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        } else {
            System.out.println("Yaş 0'dan büyük olmalıdır!");
        }
    }
}
