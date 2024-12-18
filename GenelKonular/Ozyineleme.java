package GenelKonular;

public class Ozyineleme {

    // Faktoriyel
    static int faktoriyel(int sayi){
        if(sayi==1)
            return 1;
        else
            return (sayi*(faktoriyel(sayi-1)));
    }

    // Girilen sayiya kadar ki sayilari toplama
    static int topla(int sayi){
        if(sayi==0)
            return 0;
        else
            return (sayi+(topla(sayi-1)));
    }

    // Fibonacci
    static int fibonacci(int sayi){
        if(sayi<=1)
            return sayi;
        else
            return fibonacci(sayi-1)+fibonacci(sayi-2);
    }

    public static void main(String[] args) {
        System.out.println(faktoriyel(5));
        System.out.println(topla(10));
        System.out.println(fibonacci(6));
        System.out.println((int)Math.pow(2,6));
    } 
}
