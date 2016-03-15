package exercise;

import java.util.Scanner;

public class exercise11 {
    public static void main(String[] args) {   
    Scanner keyboard = new Scanner(System.in);
    
    System.out.println("İlk Sayıyı Giriniz: ");
    int a = keyboard.nextInt();
    
    System.out.println("İkinci Sayıyı Giriniz: ");
    int b = keyboard.nextInt();
    
    int sum, prod, quot, rem;    
    
    sum = a + b;
    prod = a * b;
    quot = a / b;
    rem = a % b;
    
    System.out.println(a + "+" + b + "=" + sum);
    System.out.println(a + "*" + b + "=" + prod);
    System.out.println(a + "/" + b + "=" + quot);
    System.out.println(a + "%" + b + "=" + rem);    
    }
}
