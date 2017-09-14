import java.util.Scanner;

public class BiggestNumber
{
      public static void main (String[] args)
      {
         int int1;
         int int2;
         int sum;
         double modulus;
         double div;
         
         Scanner keyboard = new Scanner (System.in);
         
         System.out.print("First Number- ");
         int1 = keyboard.nextInt();
         
         System.out.print("Second Number- ");
         int2 = keyboard.nextInt();
         
         sum = int1 + int2;
            
         
         
         if (int1<int2)
         {
            System.out.println("a) Sorted order- " + int1 + ", " + int2);
            System.out.println("b) The sum is- " + sum);
            
            if (int2 != 0)
            {
               div = int1 / int2;
               System.out.println("c) The quotient is- " + div);
            }
            else
            {
               System.out.println("c) Cannot divide by 0");
            }
            
            if (int2 != 0)
            {
               modulus = int1 % int2;
               System.out.println("d) The modulus is- " + modulus);
            }
            else
            {
               System.out.println("d) Cannot divide by 0");
            }
         }
         else
         {
            System.out.println("a) Sorted order- " + int2 + ", " + int1);
            System.out.println("b) The sum is- " + sum);
            
            if (int2 != 0)
            {
               div = int1 / int2;
               System.out.println("c) The quotient is- " + div);
            }
            else
            {
               System.out.println("c) Cannot divide by 0");
            }
            
            if (int2 != 0)
            {
               modulus = int1 % int2;
               System.out.println("d) The modulus is- " + modulus);
            }
            else
            {
               System.out.println("d) Cannot divide by 0");
            }
         }
         
      }
   }


