import java.util.Scanner;

public class GenderTest
{
   public static void main(String[] args)
   {
      Scanner input = new Scanner(System.in);
 
      
      System.out.print("Type gender (M or F): ");
      String line = input.nextLine();
      char gender = line.charAt(0);
      System.out.print("Type your age: ");
      int age = input.nextInt();
      
      
   if (gender == 'M') {
      if(age>=18) {
         System.out.print("Man");
      } else if(age<18) {
         System.out.print("Boy");
      }
   }   
   else if(gender == 'F')
   {
      if(age>=18) {
         System.out.print("Woman");
      } else if (age<18) {
         System.out.print("Girl");
      }
   } else {
      System.out.print("Invalid Gender");
   }
      
   }

}
