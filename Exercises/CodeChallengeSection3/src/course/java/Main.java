package course.java;

public class Main {

    public static void main(String[] args) {
        double myFirstDouble = 20.00d;
        double mySecondDouble = 80.00d;
        boolean myBoolean;
        myBoolean = ((((myFirstDouble + mySecondDouble) * 100.00d) % 40.00d) == 0) ? true : false;
        System.out.println(myBoolean);
        if(!myBoolean){
            System.out.println("Got some remainder");
        }



    }
}
