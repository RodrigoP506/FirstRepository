import java.util.Scanner;

public class HowMuch
{
   public static void main(String[] args)
   {
      Scanner keyboard = new Scanner(System.in);
      System.out.println("Write integers until you write -1");
      int count = 0;
      System.out.println("Write an integer: ");
      int number = keyboard.nextInt();
      if (number != -1)
      {
         count++;
      }

      while (number != -1)
      {
         System.out.println("Write an integer: ");
         number = keyboard.nextInt();
         if (number != -1)
         {
            count++;
         }
      }
      System.out.println("You entered " + count + " integers.");
   }
}
