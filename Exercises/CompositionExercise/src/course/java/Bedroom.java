package course.java;

import com.sun.jdi.Mirror;

public class Bedroom {
    private Bed MainBed;
    private Drawer ClothsDrawer;
    private TheMirror Mirror;
    private OutdoorsWindow Window;

    public Bedroom(Bed mainBed, Drawer clothsDrawer, TheMirror mirror, OutdoorsWindow window) {
        MainBed = mainBed;
        ClothsDrawer = clothsDrawer;
        Mirror = mirror;
        Window = window;
    }

    public void goingToSleep(){
        ClothsDrawer.changeClothes();
        Window.closeWindow();
        Window.closeBlinds();
        MainBed.sleeping();
    }

    public void wakingUp(){
        MainBed.waking();
        Window.openBlinds();
        Window.openWindow();
        ClothsDrawer.changeClothes();
        Mirror.look();
    }


}

