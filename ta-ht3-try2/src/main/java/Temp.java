import com.google.common.base.CharMatcher;

public class Temp {
    public static void main(String[] args) {
        int x = (int) (Math.random()*9)+1;
        System.out.println(x);

        int range = getRandomItems();
        System.out.println(range);

        // generate random numbers within 1 to 10
        for (int i = 0; i < 10; i++) {
            int rand = (int) (Math.random() * range) +1;
          //  System.out.println(rand);
        }
        int i = 0;
        while (i != x) {
            System.out.println(x + " " + i);
            i++;
        }
        String theDigits = CharMatcher.DIGIT.retainFrom("27469 грн");

        int item = Integer.parseInt(theDigits) ;
        System.out.println(theDigits);
        System.out.println(item + " item");


    }

    private static int getRandomItems() {
        int max = 9;
        int min = 1;
        int range = max - min + 1;
        int out = (int) (Math.random() * range) +1;
        return range;
    }



}
