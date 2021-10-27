package course.java;

public class Main {

    public static void main(String[] args) {
        Car car = new Car("test", 8);
        car.startEngine();
        car.accelerate();
        car.brake();
    }
}
