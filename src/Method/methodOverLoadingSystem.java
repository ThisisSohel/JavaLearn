public class methodOverLoadingSystem {
    static int twoSum(int num1, int num2) { // The name of the function is same but different variable
        return num1 + num2;
    }

    static double twoSum(double num1, double num2) {
        return num1 + num2;
    }

    public static void main(String[] args) {
        int mySum1 = twoSum(10, 20);
        double mySum2 = twoSum(10.20, 10.20);
        System.out.println("My two sum in integer number-" + mySum1);
        System.out.println("My two sum in Double number-" + mySum2);

    }
}
