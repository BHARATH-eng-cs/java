import java.util.Scanner;
public class positiveornegative {
public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);
    System.out.print("Enter number: ");
    int num =sc.nextInt();

    if (num > 0){
        System.out.println("The number is possitive.");
    }
    else if(num < 0){
        System.out.println("The number is negative.");
    }
    else {
        System.out.println("The number is zero");
    }
  sc.close();
}
    
}