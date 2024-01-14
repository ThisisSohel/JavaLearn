import java.util.Scanner;

public class arrayMethod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the array size: ");
        int arraySize = sc.nextInt();

        int[] myArray = new int[20]; // Initializing the array with the specified size

        for (int i = 0; i < arraySize; i++) {
            System.out.println("Enter element " + (i + 1) + ": ");
            int arrayInput = sc.nextInt();
            myArray[i] = arrayInput;
        }

        System.out.println("Elements in the array:");
        for (int i = 0; i < arraySize; i++) {
            System.out.println(myArray[i]);
        }
    }
}