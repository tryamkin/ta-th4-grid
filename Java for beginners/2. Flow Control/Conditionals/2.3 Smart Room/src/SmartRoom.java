public class SmartRoom
{
   public static void main(String[] args)
   {
      double temperature; //in Celsius degrees
      double humidity; //as a percentage
      boolean smartMode;

      if (smartMode)
      {
         if (humidity > 0.7)
            System.out.println("Dehumidifier activated.");
         else
            System.out.println("Smart save mode on. Only fan activated.");
      }
      else
      {
         if (humidity > 0.7)
            System.out.println("Dehumidifier activated.");
         else if (temperature > 24)
            System.out.println("Fan activated.");
      }
   }
}