public class javaTypeCasting {
    public static void main(String[] args) {
        // Widening Casting
        int myIntNum = 100;
        double myDoubleNum = myIntNum;

        System.out.println(myIntNum);
        System.out.println(myDoubleNum);

        System.out.println("..................");

        // Narrowing Casting
        double myDoubleNumber = 100.00;
        int myIntNumber = (int) myDoubleNumber;

        System.out.println(myDoubleNumber);
        System.out.println(myIntNumber);

    }
}
