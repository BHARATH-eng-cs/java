import java.util.Scanner;
public class positiveornegative {
public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);
    System.out.println("enter number; ");
    int num =sc.nextInt();

    if (num > 0){
        System.out.println("the number is possitive");
    }
    else if(num < 0){
        System.out.println("the number is ngative");
    }
  sc.close();
}
    
}