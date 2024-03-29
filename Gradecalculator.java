/* this is a simlpe program that takes in students percentage and 
assigns them a grade
*/
package gradecalculator;

import java.util.Scanner;
public class Gradecalculator {

    public static void main(String[] args) {
        Scanner grades = new Scanner (System.in);
        
        System.out.println("Enter you mark: ");
        int  mark = grades.nextInt();
        
        if (mark < 40){
            System.out.println("D");  
        }
        else if (mark >= 40 && mark < 60){
            System.out.println("C");
            
        }
        else if ( mark >= 60 && mark < 80){
            System.out.println("B");
    }
        else if (mark > 80){
            System.out.println("A"); 
        }
    }
    
}
