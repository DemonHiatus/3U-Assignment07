
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author baayl3669
 */
public class A7Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // create a scanner 
        Scanner in = new Scanner(System.in);

        // ask user how many students in the class
        System.out.println("How many students are in your class ?");
        int students = in.nextInt();
        int[] nums = new int[students];

        // ask for the marks and put into array
        System.out.println("Enter the marks");
        for (int i = 0; i < nums.length; i++) {
            nums[i] = in.nextInt();
        }
        // calculate total of marks
        int total = 0;
        for (int i = 0; i < nums.length; i++) {
            total = total + nums[i];
        }
        total = total / students;

        // print out total
        System.out.println("The average is " + total);

    }
}
