import java.util.*;

public class GMNv1 {
    public static void main(String[] args) {
        int sayac = 1;
        Random r = new Random ();
        int random = r.nextInt(10);
        Scanner sc = new Scanner (System.in);

        System.out.println("\n----- WELCOME TO THE GAME -----\n\n");
        while(true){
            System.out.println("Guess my number! (0-10)");
            int tahmin = sc.nextInt();

            if(tahmin==random){
                System.out.println("Congratulations! You found my number in "+sayac+" attempts.");
                break;
            }
            else
                sayac += 1;
        }
    }
}
