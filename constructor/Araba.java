package constructor;

public class Araba {
    String model;
    int yil;

    Araba (String model){
        this(model,2020);   // constructor içinden constructor çağırdın
    }

    Araba (String model, int yil){
        this.model = model;
        this.yil = yil;
    }

    public static Araba yeniAraba(String model, int yil) {
        return new Araba(model, yil);  // Araba nesnesi oluşturan bir method
    }

class ElektrikliAraba extends Araba{  // Araba sınıfının constructorına erişmek için
        int bataryaKapasite;

        ElektrikliAraba(String model,int bataryaKapasite){
            super(model);  // üst sınıftaki constructora erişmek için
            this.bataryaKapasite = bataryaKapasite;
        }
}



}
