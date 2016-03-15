package exercise;

import java.util.Scanner;

public class exercise15 {
        public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Yıl : ");
        int year = keyboard.nextInt();
        
            //Dörde bölünebilen fakat 100'e bölünemeyen
            boolean isLeapYear = (year % 4 == 0) && (year % 100 != 0); // Boolean olmalı demek ki
        
        //ya da  400'e bölünebilen
        isLeapYear = isLeapYear || (year % 400 == 0);
        System.out.println(isLeapYear);
}
}