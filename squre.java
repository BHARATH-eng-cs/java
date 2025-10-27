import java.util.Scanner;

public class squre {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size of squre");
        int squre = sc.nextInt();
        int total = squre*squre;
        System.out.println("total size of squre" + total);
        sc.close();

    }
}
