class myOuterClass {
    int OuterNumber = 10;

    class myInnerClass {
        int InnerNumber = 5;
    }
}

public class innerClass {
    public static void main(String[] args) {
        myOuterClass myOuter = new myOuterClass();
        myOuterClass.myInnerClass myInner = myOuter.new myInnerClass();
        System.out.println(myInner.InnerNumber + myOuter.OuterNumber);
    }
}
