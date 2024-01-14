public class myMethod {
    static void myDemoMethod() { // Here we are creating our own customized methods
        System.out.println("This is my first method");
    }

    static void myDemoMethod1() { // Here we created our another customized method
        int num1 = 10, num2 = 20;

        System.out.println("The summation of two numbers is: " + (num1 + num2));
    }

    public static void main(String[] args) { // Now from inside the main function we will simply call the methods!
        myDemoMethod();
        myDemoMethod();
        myDemoMethod();
        myDemoMethod1();
    }
}
