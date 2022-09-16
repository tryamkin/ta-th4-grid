package cource;

import java.util.Scanner;

public class Clazz {
    int x = 2;

    public int getX() {
        return x;
    }

    public static void main(String[] args) {
        Clazz c = new SubClass();
        System.out.println(c.x + " " + c.getX());

        int a = 4;
        int b = 3;
        double c1 = (double) a / b;
        System.out.println(c1);
        Integer ii;
        ii = new Integer(1);
        System.out.println(ii);


        System.out.println(5 & 6);

        String test = "";
        Scanner sc = new Scanner(System.in);
/*
        do {
            System.out.printf("Enter Hello");
            test = sc.next();
        } while (!test.equals("hello"));*/
        int xx= 1;
        do {
            System.out.println(xx);

            xx++;
        } while (xx!=10);

        for (int i = 0; i < 100; i++) {
            if (i%2==0) continue;
            System.out.println(i);
        }
    }


    static class SubClass extends Clazz {
        int x = 1;

        public int getX() {
            return x;
        }
    }
}
