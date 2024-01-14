public class constructor {
    String myfName;
    String mylName;
    int myAge;

    // Create a class constructor for the constructor class with multiple
    // parameters.

    public constructor(String fName, String lName, int age) {
        myfName = fName;
        mylName = lName;
        myAge = age;
    }

    public static void main(String[] args) {
        constructor myObj = new constructor("Touhidujjaman", "Sohel", 24);

        System.out.println("My name is " + myObj.myfName + " " + myObj.mylName + ". My age is " + myObj.myAge);
    }
}
