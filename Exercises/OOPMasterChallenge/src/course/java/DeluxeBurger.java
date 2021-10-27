package course.java;

public class DeluxeBurger extends Hamburger{

    public DeluxeBurger() {
        super("Deluxe Burger","Deluxe Meat", 19.10, "Deluxe Bread");
        super.addHamburgerAddition1("Chips", 0);
        super.addHamburgerAddition2("drink", 0);
    }

    @Override
    public void addHamburgerAddition1(String addition1Name, double addition1Price) {
        System.out.println("You can't add additional items to the Deluxe Burger");
    }

    @Override
    public void addHamburgerAddition2(String addition2Name, double addition2Price) {
        System.out.println("You can't add additional items to the Deluxe Burger");
    }

    @Override
    public void addHamburgerAddition3(String addition3Name, double addition3Price) {
        System.out.println("You can't add additional items to the Deluxe Burger");
    }

    @Override
    public void addHamburgerAddition4(String addition4Name, double addition4Price) {
        System.out.println("You can't add additional items to the Deluxe Burger");
    }
}
