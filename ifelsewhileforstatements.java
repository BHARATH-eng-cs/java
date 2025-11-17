public class SimpleProgram {
    public static void main(String[] args) {

        int number = 5;

        // Simple if-else
        if (number > 0) {
            System.out.println(number + " is positive.");
        } else {
            System.out.println(number + " is not positive.");
        }

        // For loop
        System.out.println("For loop output:");
        for (int i = 1; i <= 5; i++) {
            System.out.println("i = " + i);
        }

        // While loop
        System.out.println("While loop output:");
        int count = 1;
        while (count <= 5) {
            System.out.println("count = " + count);
            count++;
        }
    }
}
