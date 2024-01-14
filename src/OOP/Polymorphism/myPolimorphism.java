class myAnimalClass {

    public void animalSound() {
        System.out.println("The animal makes a sound");
    }
}

class myPig extends myAnimalClass {
    public void animalSound() {
        System.out.println("The pig says: wee wee");
    }
}

class myDog extends myAnimalClass {
    public void animalSound() {
        System.out.println("The dog says: bow wow");
    }
}

class myPolimorphism {
    public static void main(String[] args) {
        myAnimalClass myAnimal = new myAnimalClass();
        myAnimalClass myPig = new myPig();
        myAnimalClass myDog = new myDog();
        myAnimal.animalSound();
        myPig.animalSound();
        myDog.animalSound();
    }
}
