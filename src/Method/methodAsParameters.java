public class methodAsParameters {
    static void myDemoMethod(String fName) { // Created single parameter
        System.out.println(fName + " Sohel");
    }

    static void methodForMultipleParameters(String fName, int age) { // Created multiple parameters
        System.out.println("My first name is " + fName + "and my age is " + age);

    }

    public static void main(String[] args) {
        myDemoMethod("Touhidujjaman");
        methodForMultipleParameters("Touhidujjaman", 24);
    }
}
