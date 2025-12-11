package Constructor;

public class Main {
    public static void main(String[] args) {

         Araba car = Araba.yeniAraba("Volvo", 2022); // method ile oluşturuldu
         Araba car2 = new Araba("Clio");

        System.out.println("Araba1 Model: "+car.model+" Yıl: "+car.yil);
        System.out.println("Araba2 Model: "+car2.model+" Yıl: "+car2.yil);
    }
}
