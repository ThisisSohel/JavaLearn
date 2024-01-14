abstract class myAnimalClass {

    public abstract void animalSound();

    // Regular method
    public void myAnimalsleepingTime() {
        System.out.println("He gets sleep two times a day.... Zzz");
    }
}

// Pig is an Subclass (inherit from Animal)

class Pig extends myAnimalClass {
    public void animalSound() {
        System.out.println("My pig sounds like --> wee wee");
    }
}

public class myAbstraction {
    public static void main(String[] args) {
        Pig myPig = new Pig();
        myPig.animalSound();
        myPig.myAnimalsleepingTime();
    }
}
