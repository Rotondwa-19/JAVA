/*this java program calculates discounts based on the number of items a student as a customer will buy
*/

package receipt;

import java.util.Scanner;

public class Receipt {

    public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
   System.out.println("===========================================================");
   System.out.println("         DISCOUNT SYSTEM         ");
   System.out.println("===========================================================");
   
   System.out.println("Enter Username(student number): ");
   int userName = sc.nextInt();
   
   System.out.println("Enter Password(first 6 digits of your id): ");
   int  password = sc.nextInt();

   
   if (userName == 1111 && password == 1111) {
       System.out.println("Sale person has loged in");
       }
   else {
       System.out.println(userName + "  has logged in");
   }
   System.out.println("Enter Item(s) Quantity: " );
       int items = sc.nextInt();
   
       
       double itemsPrice = 10.45;
       double totalPrice = items * itemsPrice;
        
    
   
   System.out.println("===========================================================");
   System.out.println("         RECIEPT         ");
   System.out.println("===========================================================");
   
   System.out.println("Items Amount                 " + itemsPrice);
   System.out.println("Item Quantity                " + items );
   System.out.println("Total original Price         " + totalPrice);
   
   double a = 1;
   double b = 0.05;
   double c = 0.08;
   double d = 0.12;
   double e = 0.2;
   
   
   
   if (items > 0 && items <= 14){
      double discount = a * totalPrice;
       double discountAmount = totalPrice - discount;
       double discountedAmount = totalPrice - discountAmount;
       System.out.println("Discount Amount:             " + discountAmount);
      System.out.println("Discount Percentage:          " + a);
      System.out.println("Discounted Amount:            " + discountAmount);
      System.out.println("total price                   " + discount);
  }
  else if (items >14 && items <= 20){
      double discount = b * totalPrice;
        double discountAmount = totalPrice - discount;
        double discountedAmount = totalPrice - discountAmount;
       System.out.println("Discount Amount:             " + discountAmount);
        System.out.println("Discount Percentage:        " + b);
         System.out.println("Discounted Amount:         " + discountAmount);
       System.out.println("total price                  " + discount);
   }
  else if (items > 20 && items <= 30){
      double  discount = c * totalPrice;
       double discountAmount = totalPrice - discount;
       double discountedAmount = totalPrice - discountAmount;
       System.out.println("Discount Amount:             " + discountAmount);
        System.out.println("Discount Percentage:        " + c);
         System.out.println("Discounted Amount:         " + discountAmount);
       System.out.println("total price                  " + discount);
  }
  else if (items > 30 && items <= 40){
      double discount = d * totalPrice;
       double discountAmount = totalPrice - discount;
       double discountedAmount = totalPrice - discountAmount;
       System.out.println("Discount Amount:             " + discountAmount);
        System.out.println("Discount Percentage:        " + d);
         System.out.println("Discounted Amount:         " + discount);
       System.out.println("total price                  " + discountAmount);
     }
  else if (items > 40){
      double discount = e * totalPrice;
       double discountAmount = totalPrice - discount;
       double discountedAmount = totalPrice - discountAmount;
       System.out.println("Discount Amount:             " + discountAmount);
        System.out.println("Discount Percentage:        " + e);
         System.out.println("Discounted Amount:         " + discountAmount);
       System.out.println("total price                  " + discount);
  }
   
   
    }
    
}
