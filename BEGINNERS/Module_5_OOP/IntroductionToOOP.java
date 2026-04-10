class Car {
    String color;

    void drive() {
        System.out.println("Car is driving");
    }
}

public class IntroductionToOOP {
    public static void main(String[] args) {
        Car c1 = new Car();
        c1.color = "Red";
        c1.drive();
    }
}