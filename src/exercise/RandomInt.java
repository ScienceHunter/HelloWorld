package exercise;

import java.util.Scanner;

public class RandomInt {
        public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Yıl: ");
        int N = keyboard.nextInt();

        double r = Math.random();
        int n = (int)(r * N);
        System.out.println("r is " + r);
        System.out.println("random integer is " + n);
}
}