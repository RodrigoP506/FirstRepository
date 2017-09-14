import java.util.Scanner;

public class ValidationNumber
{
   public static void main(String[] args)
   {
      
   Scanner keyboard = new Scanner(System.in);
   int number;
   
   System.out.print("Type an integer in the range of 10 through 25: ");
   number = keyboard.nextInt();
   
   while (number<10 || number>25)
   {
      System.out.print("Invalid Number - Try again ");
      System.out.print("Type an integer in the range of 10 through 25: ");
      number = keyboard.nextInt();
   }
   
   System.out.println("Good Job!!!");
   
}
   }