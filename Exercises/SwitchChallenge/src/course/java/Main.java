package course.java;

public class Main {

    public static void main(String[] args) {
        testMethod();
    }

    public static void testMethod(){
        char switchValue = 'E';
        switch(switchValue){
            case 'A':
                System.out.println("Apple");
                break;
            case 'B':
                System.out.println("Boat");
                break;
            case 'C':
                System.out.println("Cucumber");
                break;
            case 'D':
                System.out.println("Door");
                break;
            case 'E':
                System.out.println("Elephant");
                break;
            default:
                System.out.println("Not found.");
                break;
        }
    }
}
