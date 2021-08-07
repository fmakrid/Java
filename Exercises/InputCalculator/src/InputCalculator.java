import java.util.Scanner;
public class InputCalculator {
    public static void inputThenPrintSumAndAverage(){
        Scanner scanner = new Scanner(System.in);
        int counter = 0;
        int sum = 0;
        int current;
        while(true){
            boolean hasNextInt = scanner.hasNextInt();
            if(hasNextInt){
                counter++;
                current = scanner.nextInt();
                sum += current;
            }
            else{
                if(counter == 0){
                    System.out.println("SUM = 0 AVG = 0");
                    break;
                }
                System.out.println("SUM = " + sum + " AVG = " + Math.round((double) sum/counter));
                break;
            }
        }
        scanner.close();
    }
}
