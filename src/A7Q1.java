
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
        
        // create scanner 
        Scanner in = new Scanner(System.in);
        
        //
        System.out.println("How many students are in your class ?");
        int students = in.nextInt();
        int[] nums = new int[students];
        //
        System.out.println("Enter the marks");
        for(int i = 0; i < nums.length; i++){
            nums[i] = in.nextInt();            
        }
        //
        int total = 0;
        for(int i = 0; i < nums.length; i++){
            total = total + nums[i];
        }
        total = total/students;
        //
        System.out.println("The average is " + total);
        
    }
}
