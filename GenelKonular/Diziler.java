package GenelKonular;

import java.util.Arrays;

public class Diziler {
    public static void main(String[] args) {

        int[] dizi = {1, 6, 8, 3};
        int[] dizi2 = {2};

        Arrays.sort(dizi);

        for (int i = 0; i < dizi.length; i++) {
            System.out.println(dizi[i]);
        }
        System.out.println(Arrays.equals(dizi, dizi2));
    }
}

// Arrays.sort ile dizinin içindeki elemanları küçükten büyüğe sırala


// Arrays.sort(dizi,1,4) yazarsan 1 2 3 4. elemanları sıralayıp diğerlerini aynı yazacak

// Arrays.equals ile eşitlik kontrol et

// daha fazla bilgi için s176