package course.java;

public class Main {

    public static void main(String[] args) {
        Bed mainBed = new Bed(2,1);
        Drawer drawer = new Drawer("steel", 6);
        TheMirror mirror = new TheMirror("vertical");
        OutdoorsWindow window = new OutdoorsWindow(2,false);

        Bedroom bedroom = new Bedroom(mainBed,drawer,mirror,window);

        bedroom.goingToSleep();
        bedroom.wakingUp();
        drawer.changeClothes();
        mirror.look();



    }
}
