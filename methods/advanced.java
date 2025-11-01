package methods;

import java.util.Scanner;

public class advanced {
    static int multiply( int a , int b){
        return a * b;
    }
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

         System.out.print("Enter first number: ");
         int a =sc.nextInt();

         System.out.print("Enter the second number: ");
         int b =sc.nextInt();

         int result = multiply(a, b);
         System.out.print("Result of multiply: "+ result);
         sc.close();
    }
}
