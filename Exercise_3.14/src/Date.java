import java.util.Scanner;

public class Date
{
   public static void main(String[] args)
   {
      int day, mounthN, year;

      Scanner keyboard = new Scanner(System.in);
      System.out.println("Input the date");
      System.out.print("What is the day? ");
      day = keyboard.nextInt();
      System.out.print("What is the mounth(number)? ");
      mounthN = keyboard.nextInt();
      System.out.print("What is the year? ");
      year = keyboard.nextInt();

      if (mounthN <= 12 || mounthN >= 1)
      {
         switch (mounthN)
         {
            case 1:
               if (day > 31 || day < 1)
                  System.out.println("ILLEGAL DATE");
               else
                  System.out.println(day + "/" + mounthN + "/" + year);
               break;

            case 2:
               if (day > 29 || day < 1)
                  System.out.println("ILLEGAL DATE");
               else
                  System.out.println(day + "/" + mounthN + "/" + year);
               break;

            case 3:
               if (day > 31 || day < 1)
                  System.out.println("ILLEGAL DATE");
               else
                  System.out.println(day + "/" + mounthN + "/" + year);
               break;

            case 4:
               if (day > 30 || day < 1)
                  System.out.println("ILLEGAL DATE");
               else
                  System.out.println(day + "/" + mounthN + "/" + year);
               break;

            case 5:
               if (day > 31 || day < 1)
                  System.out.println("ILLEGAL DATE");
               else
                  System.out.println(day + "/" + mounthN + "/" + year);
               break;

            case 6:
               if (day > 30 || day < 1)
                  System.out.println("ILLEGAL DATE");
               else
                  System.out.println(day + "/" + mounthN + "/" + year);
               break;

            case 7:
               if (day > 31 || day < 1)
                  System.out.println("ILLEGAL DATE");
               else
                  System.out.println(day + "/" + mounthN + "/" + year);
               break;

            case 8:
               if (day > 31 || day < 1)
                  System.out.println("ILLEGAL DATE");
               else
                  System.out.println(day + "/" + mounthN + "/" + year);
               break;

            case 9:
               if (day > 30 || day < 1)
                  System.out.println("ILLEGAL DATE");
               else
                  System.out.println(day + "/" + mounthN + "/" + year);
               break;

            case 10:
               if (day > 31 || day < 1)
                  System.out.println("ILLEGAL DATE");
               else
                  System.out.println(day + "/" + mounthN + "/" + year);
               break;

            case 11:
               if (day > 30 || day < 1)
                  System.out.println("ILLEGAL DATE");
               else
                  System.out.println(day + "/" + mounthN + "/" + year);
               break;

            case 12:
               if (day > 31 || day < 1)
                  System.out.println("ILLEGAL DATE");
               else
                  System.out.println(day + "/" + mounthN + "/" + year);
               break;

         }
      }
      else if (mounthN > 12 || mounthN < 1)
      {
         System.out.println("ILLEGAL DATE");
      }
     
   }
}
