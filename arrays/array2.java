package arrays;

public class array2 {
    public static void main(String[] args) {
        int[] arr;
        arr = new int [5];
        arr[0] = 42;
        arr[1] = 2;
        arr[2] = 122;
        arr[3] = 342;
        arr[4] = 256;
        
        for (int i = 0;i < 5; i++)
        System.out.println("Element at index" + i +":" +arr[i]);
    }
}
