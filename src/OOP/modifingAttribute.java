
public class modifingAttribute {
    int myNumber = 20;

    public static void main(String[] args) {
        modifingAttribute myObj = new modifingAttribute();
        System.out.println("My number is:  " + myObj.myNumber);

        myObj.myNumber = 40; // Here we oberriding the exiting value(20->40), this is called overriding
                             // actually
        // another thing is if somehow you do not want to override the value, you can
        // simply define the value using (final keyword) like ... final myNumber = 30;

        System.out.println("My modified number is: " + myObj.myNumber);
    }
}
