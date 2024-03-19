
package age.calculator;

import java.util.Scanner; 
public class AgeCalculator {

    public static void main(String[] args) {
        Scanner year = new Scanner(System.in);
        System.out.println("enter year of birth");
        int thisYear = java.time.Year.now().getValue();
        
        int yearOfBirth = year.nextInt();
      
        
        int age = thisYear - yearOfBirth;
        
        System.out.println("you are" + age + "years old");
        
        if (age >= 18){
            System.out.println("You are old enough to smoke and drink");
            
        } 
        else if (age >= 16){
            System.out.println("you are old enough to smoke");
        }
        else{
            System.out.println("you are not old enough to drink or smoke");
        }
     
        
           

    }
    
}
