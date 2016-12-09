
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author baayl3669
 */
public class A7Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create a scanner
        Scanner in = new Scanner(System.in);

        // ask the user how many students are in the class
        System.out.println("How many number of students heights are you collecting ?");
        int people = in.nextInt();
        int nums[] = new int[people];

        // ask the user for each students heights
        System.out.println("Enter the heights");
        for (int i = 0; i < nums.length; i++) {
            nums[i] = in.nextInt();
        }
        // calculate total of heights
        int total = 0;
        for (int i = 0; i < nums.length; i++) {
            total = total + nums[i];
        }
        total = total / people;
        // print out total
        System.out.println("The average height is " + total);

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > total) {
                System.out.println(nums[i] + " is above average");
            }
        }
    }
}
