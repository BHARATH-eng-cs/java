import java.util.Scanner;



public class variable1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter your name: ");
          String name = sc.nextLine(); 
        System.out.print("Enter your name: ");
        int age =sc.nextInt();
        System.out.println("your name is :"+name);
        System.out.println("youe age:"+age);

    
        sc.close();
    }
    
}
