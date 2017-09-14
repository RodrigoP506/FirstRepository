import java.util.Scanner;

public class PrintAverage
{
   public static void main(String[] args)
   {
      
   Scanner input = new Scanner(System.in);
   double sum = 0;
   double ave;
   for (int i=0; i<5; i++)
   {
   System.out.print("Type an integer: ");
   double value = input.nextInt();
   sum += value;
   }
   ave = sum / 5;
   
   System.out.println("The average is " + ave);
   } 
}
