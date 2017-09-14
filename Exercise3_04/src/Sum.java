import java.util.Scanner;

public class Sum
{
   public static void main (String []args)
   {
      int int1;
      int int2;
      int int3;
      int sum;
      
      Scanner keyboard = new Scanner (System.in);
      
      System.out.print("Write the first number - ");
      int1 = keyboard.nextInt();
      
      System.out.print("Write the second number - ");
      int2 = keyboard.nextInt();
      
      System.out.print("Write the third number - ");
      int3 = keyboard.nextInt();
      
      sum = int1 + int2 + int3;
      System.out.println("The sum of your numbers is = " + sum);
      
   }
}
