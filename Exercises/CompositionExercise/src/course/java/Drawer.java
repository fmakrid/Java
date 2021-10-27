package course.java;

public class Drawer {
    private String material;
    private int multitude;

    public Drawer(String material, int multitude) {
        this.material = material;
        this.multitude = multitude;
    }

    public void changeClothes(){
        System.out.println("Open drawer and change clothes");
    }
}
