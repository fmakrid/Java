package course.java;

public class OutdoorsWindow {
    private int numberOfWindows;
    private boolean isBlindsClosed;

    public OutdoorsWindow(int numberOfWindows, boolean isBlindsClosed) {
        this.numberOfWindows = numberOfWindows;
        this.isBlindsClosed = isBlindsClosed;
    }

    public void openWindow(){
        System.out.println("Opening window");
    }

    public void closeWindow(){
        System.out.println("Closing window");
    }

    public void closeBlinds() {
        if (isBlindsClosed == true) {
            System.out.println("Blinds are already closed");
        } else {
            isBlindsClosed = true;
            System.out.println("Closing blinds");
        }
    }

    public void openBlinds(){
        if(isBlindsClosed == false){
            System.out.println("Blinds are already open");
        }
        else{
            isBlindsClosed = false;
            System.out.println("Opening blinds");
        }
    }



}
