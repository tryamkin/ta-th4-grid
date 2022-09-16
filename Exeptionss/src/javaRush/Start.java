package javaRush;

import java.util.Scanner;

public class Start {
    public static void main(String[] args) {

                String text = " любит меня.";
                //напишите тут ваш код
        String name = "ENTER " ;
    int i = 0;
    while (!name.equals("ENTER")){
        Scanner scanner=new Scanner(System.in);
        System.out.println( text);
        int x = Integer.parseInt(scanner.nextLine());
        int z = i+x;
        i+=x;
        System.out.println(z);
    }

    }
}
