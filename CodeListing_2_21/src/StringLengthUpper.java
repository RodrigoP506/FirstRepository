
public class StringLengthUpper
{
   public static void main (String[] args)
   {
      String name = "Herman";
      String nameUpper = name.toUpperCase();
      int stringSize;
      
      stringSize = name.length();
      System.out.println(nameUpper + " has " + stringSize + " characters.");
   }
}
