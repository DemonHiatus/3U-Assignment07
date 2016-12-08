
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author baayl3669
 */
public class A7Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Create a scanner
        Scanner input = new Scanner(System.in);
        // Create an array
        int[] marks = new int[10];
        // Ask the user to input 10 of the marks
        System.out.println("Please enter the marks.");

        // For loop that goes through array 
        for (int i = 0; i < marks.length; i++) {
            marks[i] = input.nextInt();
        }
        // For loop that goes through the array to arrange the numbers 
        // Rearange 10 of the marks in ascending order
        for (int i = 0; i < 10; i++) {
            for (int k = 0; k < 10; k++) {
                int x = marks[i];
                int y = marks[k];
                // Sorting the numbers 
                if (marks[i] < marks[k]) {
                    marks[i] = y;
                    marks[k] = x;
                }
            }
        }
        // Print the marks for user
        System.out.println("The student marks from lowest to hightest are: ");
        // Print the marks in ascending order
        for (int i = 0; i < 10; i++) {
            System.out.println(marks[i]);
        }
    }
}