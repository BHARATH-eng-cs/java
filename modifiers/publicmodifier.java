package modifiers;

public class publicmodifier {
    static void hello(){
        System.out.println("vaanga vanakkam");
    }
    public static void main(String[] args) {
        publicmodifier obj = new publicmodifier();
        obj.hello();
    }
}