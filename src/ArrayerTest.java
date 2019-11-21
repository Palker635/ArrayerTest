import javax.swing.*;
import java.util.*;

public class ArrayerTest {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Hur många tal vill du få ut ett medelvärde på?");
        int length = in.nextInt();

        int[] numbers = new int[length];

        for (int i = 0; i < length; i++) {
            System.out.println("Ange ett tal: ");
            numbers[i] = in.nextInt();

        }

        double summa = 0;
        for (int i = 0; i < length; i++){
            summa += numbers[i];


        }
        System.out.println("Medelvärdet på dina tal är: " + (summa/length));

    }
}
