package GenelKonular;

public class Operatorler {
    public static void main(String[] args) {

        int x = 2, y = 3, z;
        z = x = y;
        System.out.println(x + " " + y + " " + z);
        // b nin değerini a ya, a nın değerini c ye atadı

        z = x += y;
        System.out.println(x + " " + y + " " + z);
        // a+b yi a ya, a yı c ye atadı

        /*
        ^ operatörü xor işlemi yapar. sayıları binary olarak alır
        aynıysa 0, farklıysa 1 yapar.
        a = 5'in binary hali: 0101
        b = 3'ün binary hali: 0011
        Bu durumda, XOR sonucu 0110 (binary) olacaktır ki bu da 6'ya karşılık gelir.
        */


        int a = 5;
        int b = 3;

        a = a ^ b;
        // a+b yapmış gibi düşün 8 (binary olarak farklı değer aldı ama anlaşılsın diye)
        b = a ^ b;
        // b yi tekrar xor edince -b olmuş gibi 5
        a = a ^ b;
        // yine b yi xor etti ama 5 olarak 3

        System.out.println("a: " + a + ", b: " + b); // a: 3, b: 5


        // tek sayıda tekrarlanan sayıyı bulur
        int[] arr = {4, 5, 4, 6, 6};
        int result = 0;

        for (int num : arr) {
            result ^= num;
        }

        System.out.println(result);  // 5

    // continue kullanıldığında o işlem atlanır
        int i;
         for(i=1; i<10; i++)
         {
             if (i%2==1)
                 continue;
             else
                 System.out.println(i+" sayisi 2'ye bölünür");
         }

    }
}
