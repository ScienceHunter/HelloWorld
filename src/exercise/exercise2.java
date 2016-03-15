package exercise;

import java.util.Scanner;

public class exercise2 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        
        System.out.print("Sayi Giriniz : ");      
        int a = keyboard.nextInt();
        System.out.print("Sayi Giriniz : ");
        double b = keyboard.nextDouble();
        
        System.out.println("Toplama Sonucu : " + (a+b));
}
}
