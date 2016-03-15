package exercise;
import java.util.Scanner;
public class exercise12 {
    public static void main(String[] args) {   
    Scanner keyboard = new Scanner(System.in);
    System.out.println("b değeri: ");
    double b = keyboard.nextDouble();
    System.out.println("c değeri: ");
    double c = keyboard.nextDouble();
    
    //Kökleri hesapla
    double discriminant = b*b - 4.0*c;
    double d = Math.sqrt(discriminant);
    double root1 = (-b + d) / 2.0;
    double root2 = (-b - d) / 2.0;
    
    System.out.println(root1);
    System.out.println(root2);
    }
}
