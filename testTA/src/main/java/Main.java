import java.time.LocalTime;

public class Main {
    public static void main(String[] args) {
        LocalTime time = LocalTime.now();
        String t = time.toString();
        System.out.println("This is my first test");
        System.out.println(time.getMinute() + t);
    }
}
