
import java.util.Scanner;

import javax.sound.midi.SysexMessage;

public class elseIfCondition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // System.in is a standard input stream
        System.out.print("Enter first number- ");
        int num1 = sc.nextInt();
        System.out.print("Enter second number- ");
        int num2 = sc.nextInt();
        // int num1 = 10, num2 = 20;
        if (num1 > num2) {
            System.out.println("Number1 is greater than number2");
        } else {
            System.out.println("Number2 is greater than number1");

        }

        // Short Hand If...Else

    }
}
