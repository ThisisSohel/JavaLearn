class Vehicle {
    protected String brand = "Ford";

    public void honkSound() { // Vehicle method
        System.out.println("Tuut, tuut!");
    }
}

class Car extends Vehicle {
    public String modelName = "Mustang";

}

public class inheritance {
    public static void main(String[] args) {

        Car myCar = new Car();

        myCar.honkSound();

        System.out.println(myCar.brand + " " + myCar.modelName);
    }
}
