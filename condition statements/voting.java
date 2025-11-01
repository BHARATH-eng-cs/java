import java.util.Scanner;

public class voting {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter your age:");
int age = sc.nextInt();
if (age > 18) 
System.out.println("eligble to vote");
else
System.out.println("not eligible to vote");
sc.close();
    }
    
}
