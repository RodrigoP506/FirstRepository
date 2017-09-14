public class Sucessions
{
   public static void main (String[] args)
   {
      int i;
      double ans;
      
      for(i=0;i>100;i++) {
         if (i==5 || i==25 || i==100) {
            ans = Math.pow((1/2), i+1);
            System.out.println("The answer to the succession of S(" + i +") is - " + ans);
         } 
      }
  }
}
