import java.util.Scanner;

public class PayrollWithTax
{
   public static void main (String[] args)
   {
      String name;
      int hours;
      double payRate;
      double netPay;
      double taxRate;
      
      Scanner keyboard = new Scanner (System.in);
      
      System.out.print("What is your name? ");
      name = keyboard.nextLine();
      
      System.out.print("How many hours did you work this week? ");
      hours = keyboard.nextInt();
      
      System.out.print("What is your hourly pay rate? ");
      payRate = keyboard.nextDouble();
      
      System.out.print("What is your tax rate? ");
      taxRate = keyboard.nextDouble();
      
      netPay = (hours * payRate) * taxRate;
      
      System.out.println("Hello " + name);
      System.out.println("Your net pay is $" + netPay);
   }
}
