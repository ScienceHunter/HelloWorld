package exercise;
import java.util.Scanner;
public class exercise13 {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Dairenin yarıçapını giriniz: ");
        int r = keyboard.nextInt();
        int dairenin_cevresi, dairenin_alani;
        int pi = (int) Math.PI;
       
        dairenin_cevresi = 2 * pi * r;
        dairenin_alani = pi * r * r;
        
        System.out.println("Dairenin Çevresi" + " = " + dairenin_cevresi);
        System.out.println("Dairenin Alanı" + " = " + dairenin_alani);
}
}
