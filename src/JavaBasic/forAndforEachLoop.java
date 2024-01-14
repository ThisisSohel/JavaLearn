
public class forAndforEachLoop {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
        for (int i = 0; i <= 10; i = i + 2) {
            System.out.println(i);
        }

        // Nested for loop

        for (int i = 1; i <= 2; i++) {
            System.out.println("Outer loop: " + i); // Executes 2 times

            // Inner loop
            for (int j = 1; j <= 3; j++) {
                System.out.println(" Inner loop: " + j); // Executes 6 times (2 * 3)
            }
        }

        // Forech Loop

        String[] cars = { "Volvo", "BMW", "Ford", "Mazda" };
        for (String i : cars) {
            System.out.println(i);
        }
    }
}
