import java.util.Scanner;

public class MultiAndSum
{
   public static void main (String[] args)
   {
      int int1;
      int int2;
      int int3;
      int mult;
      int sum; 
      
      Scanner keyboard = new Scanner (System.in);
      
      System.out.print("Write the first number - ");
      int1 = keyboard.nextInt();
      
      System.out.print("Write the second number - ");
      int2 = keyboard.nextInt();
      
      mult = int1 * int2;
      
      System.out.println("The result of the multiply is " + mult);
      
      System.out.print("Write the last number to sum - ");
      int3 = keyboard.nextInt();
      
      sum = mult + int3;
      
      System.out.println("The sum of the last result with the last number is " + sum);
      
      
   }
}
