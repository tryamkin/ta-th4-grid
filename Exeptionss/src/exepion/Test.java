package exepion;

import java.util.Arrays;
import java.util.logging.Logger;



public class Test {
    public static void main(String[] args) throws TestExp {
        Logger logger =Logger.getLogger(TestExp.class.getName());
        int i =1;
        Test test = new Test();
        System.out.println(test.hashCode());





        while (i!=5){
          try {
              System.out.println("test");
              i++;
              if (i==4){
                  throw new TestExp("hhhh");

              }
          }catch (TestExp testExp){
              System.out.println("1234");

          }
            TestExp testExp=new TestExp("hi");
          testExp.getMessage();
          logger.info("eeee");
        }
        int x = 6;
        int y = 6;
        try{
           y=x /0;
           throw new TestExp("by zerrro");
        }
        catch(TestExp testExp){
            testExp.setStackTrace(y);
            testExp.getMessage("get");
            testExp.getCause();
            System.out.println("jjj");
        }
        catch (ArithmeticException exception){
            System.out.println("by zeroed");
           exception.getMessage();
            exception.getCause();
            System.out.println(Arrays.toString(exception.getStackTrace()));
            System.out.println(exception.getStackTrace());
        }


    }

}
