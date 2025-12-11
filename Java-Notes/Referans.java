package GenelKonular;

public class Referans {
    int x;

    public static void main(String[] args) {
        Referans r1 = new Referans();
        r1.x = 5;
        System.out.println("eski deger; "+r1.x);

        r1.degistir(r1);
        System.out.println("yeni deger; "+r1.x);
    }
    void degistir(Referans r1){
        r1.x = r1.x + 10;

    }
}

// degistir static olmadığı için çağrılmak için nesneye ihityaç duyar
// o yüzden r1.degistir şeklinde