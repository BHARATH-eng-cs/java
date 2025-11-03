import java.util.Scanner;

public class largerorsmaller {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first number: ");
         int a = sc.nextInt();
         System.out.print("Enter second number: ");
         int b = sc.nextInt();
         if (a > b) {
            System.out.println("The first number is grater than and the number is"+a);
         }
         else if(a < b){
            System.out.println("The second number is grater than and the number is"+b);
         }
         else
         {System.out.println("The two numbers are eqal");}
    }
}
