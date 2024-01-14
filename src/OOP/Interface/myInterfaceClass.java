interface myAnimalClass {
    public void animalSound(); // interface method (does not have a body)

    public void myAnnimalsleepingTime();
}

// this Pig class will implement the Animal interface
class Pig implements myAnimalClass {
    public void animalSound() {
        System.out.println("My pig sounds like --> wee wee");
    }

    public void myAnnimalsleepingTime() {
        System.out.println("My gets sleep two times in a day Zzz");
    }
}

public class myInterfaceClass {
    public static void main(String[] args) {
        Pig myPig = new Pig();
        myPig.animalSound();
        myPig.myAnnimalsleepingTime();
    }
}
