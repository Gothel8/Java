import javax.swing.*;
import java.util.*;

public class GMNv1 {
    public static void main(String[] args) {
        int i = 1;
        Random r = new Random();
        int num = r.nextInt(10);

        while(true){
            String guess = JOptionPane.showInputDialog(null,"Guess my number! (0-10)","GUESS MY NUMBER",JOptionPane.QUESTION_MESSAGE);
            int g = Integer.parseInt(guess);

            // ıf you say guess==num, you'll get an error.
            // u supposed to compare same type variables

            if(g==num){
                String message = "Congratulations! You found my number in "+i+" attempts.";
                JOptionPane.showMessageDialog(null,message,"YOU DID IT!",JOptionPane.INFORMATION_MESSAGE);
                break;
            }
            else
                i++;

        }
    }
}
