package course.java;

public class MazdaRx7 extends Car{

    public MazdaRx7(String name, int cylinders) {
        super(name, cylinders);
    }

    @Override
    public String startEngine() {
        return "MazdaRx7 -> Start engine()";
    }

    @Override
    public String accelerate() {
        return "MazdaRx7 -> accelerate()";
    }

    @Override
    public String brake() {
        return "MazdaRx7 -> brake()";
    }
}
