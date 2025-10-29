import java.util.Scanner;

public class swappingtwonumbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter value of a:");
        int a = sc.nextInt();
        System.out.print("enter value of b: ");     
        int b = sc.nextInt();
        int  temp = a;
        a = b;  
        b = temp;
        System.out.println("after swapping");
        System.out.println("value of a: " + a);
        System.out.println("value of b: " + b);
        System.out.println("thank you");
        sc.close();
    }
}
