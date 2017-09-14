import java.util.Scanner;

public class array
{
   public static void main(String[] args)
   {
      final int Total_Ints = 10; // Number of integers
      int x = 9;
      
      // Create an array to hold employee hours.
      int[] numbers = new int[Total_Ints];

      // Create a Scanner object for keyboard input.
      Scanner keyboard = new Scanner(System.in);

      System.out.println("Enter the numbers of the positions");

      // Cycle through the array, getting each
      // employee's hours.
      for (int i = 0; i < Total_Ints; i++)
      {
         System.out.print("Number " + (i + 1) + ": ");
         numbers[i] = keyboard.nextInt();
      }

      // Cycle through the array displaying each element.
      System.out.println("The numbers in reverse ->");
      for (int i = 0; i < Total_Ints; i++)
      {
         System.out.println(numbers[x]);   
         x = x-1;
      }
         
   }

         
   }
