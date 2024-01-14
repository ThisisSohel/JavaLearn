abstract class myInfo {
    public String name = "Sohel";
    public int age = 24;

    public abstract void myStudy();
}

class Student extends myInfo {
    public int graduationYear = 2023;

    public void myStudy() {
        System.out.println("Not studying all day long");
    }
}

class myAbstract {
    public static void main(String[] args) {
        Student myObj = new Student();

        System.out.println("Name: " + myObj.name);
        System.out.println("Age: " + myObj.age);
        System.out.println("Graduation year: " + myObj.graduationYear);
        myObj.myStudy();
    }
}
