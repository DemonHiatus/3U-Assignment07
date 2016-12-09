
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author baayl3669
 */
public class A7Q7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create scanner
        Scanner in = new Scanner(System.in);

        int PrimeNumber[] = new int[1001];
        for (int i = 0; i < 1001; i++) {
            PrimeNumber[i] = i;
        }
        int zero = 0;
        for (int i = 2; i < 1001; i++) {
            for (int x = 0; x < 1001; x = x + i) {
                if (x > i) {
                    PrimeNumber[x] = 0;
                }
            }
        }
        System.out.println("The prime numbers are");
        for (int i = 0; i < 1001; i++) {
            if (PrimeNumber[i] > 0) {
                System.out.println(PrimeNumber[i]);
            }
        }

    }
}