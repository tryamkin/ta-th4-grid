package exepion;

public class Test1 {
    public static void main(String[] args) throws TestExp {

        int x = 1;

        showMeX(x);

        System.out.println("finish" + x);



    }

    private static void showMeX(int x) {
        for (int i = 0; i < 10; i++) {
            if (x %2 == 0)   try {

         }catch (TestExp exp){
            exp.getMessage("x =  " + x);
             exp.setStackTrace(i);
             exp.getCause();
         }

            x++;
        }
    }
}
