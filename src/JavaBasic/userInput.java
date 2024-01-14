import java.util.Scanner; // import the Scanner class 

public class userInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // System.in is a standard input stream
        System.out.print("Enter first number- ");
        int num1 = sc.nextInt();
        System.out.print("Enter second number- ");
        int num2 = sc.nextInt();
    }
}