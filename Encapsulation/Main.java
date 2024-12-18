package Encapsulation;

public class Main {
    public static void main(String[] args) {
        // Yeni bir Person nesnesi oluşturulur
        Person person = new Person("Ahmet", 25);

        // Getter ile bilgileri al
        System.out.println("İsim: " + person.getName());
        System.out.println("Yaş: " + person.getAge());

        // Setter ile bilgileri değiştir
        person.setName("Mehmet");
        person.setAge(30);     // negatif sayı verilmeye çalışılsaydı hata vercek ve atama yapmıcaktı

        // Değiştirilen bilgileri yazdır
        System.out.println("Yeni İsim: " + person.getName());
        System.out.println("Yeni Yaş: " + person.getAge());

    }
}
