/* this program allows users to input temperature in celsius and it'll 
convert to fahrenheit
*/
package temperatureconverter;

import java.util.Scanner;
public class Temperatureconverter {

    public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);
   
    System.out.println ("What is the temperature: ");
   int temp = sc.nextInt();
   double x = (temp * 1.8) + 32;
   System .out .println("Your temperature in fahrenheit is: " + x);
   
   
   
    }
    
}
