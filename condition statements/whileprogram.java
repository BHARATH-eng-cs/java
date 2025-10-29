public class whileprogram {

    public static void main(String[] args) {
        int i = 1;
        while(i <= 10)
        {
           if (i == 5){
            System.out.println("found 5 breaking the loop...");
            break;
        
           }
           System.out.println("Number:"+ i);
           i++;
        }
        System.out.println("loop ended.");
    }
}
