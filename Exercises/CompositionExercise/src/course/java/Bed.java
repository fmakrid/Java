package course.java;

public class Bed {
    private int pillows;
    private int bedSheet;

    public Bed(int pillows, int bedSheet) {
        this.pillows = pillows;
        this.bedSheet = bedSheet;
    }

    public void sleeping(){
        System.out.println("Laying down to bed and sleeping");
    }

    public void waking(){
        System.out.println("Waking up and getting ouf of bed");
    }
}
