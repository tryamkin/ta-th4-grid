import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        System.out.println("Проверка" );
        String name = "ENTER " ;
        int i = 0;
        Scanner scanner=new Scanner(System.in);
        boolean stop = false;
        while (!stop){
            while (scanner.hasNextInt()) {
                int x = scanner.nextInt();
                i=i+x;
                System.out.println(i);
            }
            String s=scanner.nextLine();
            stop = s.equals("ENTER");
            }
    }
}
