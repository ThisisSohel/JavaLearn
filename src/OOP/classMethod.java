public class classMethod {
    public void tiger() {
        System.out.println("The tiger can run at ");
    }

    public void speed(int maxSpeed) {
        System.out.println("his max speed " + maxSpeed + "km/h.");
    }

    public static void main(String[] args) {
        classMethod myTiger = new classMethod();
        myTiger.tiger();
        myTiger.speed(200);

    }
}
