package helloworld;
public class IntOps {
    public static void main(String[] args) {

        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        
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