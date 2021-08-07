package course.java;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int min = 9999;
        int max = -9999;
        int counter = 0;
        int currentNumber;
        Scanner scanner = new Scanner(System.in);

        while (true){
            System.out.println("Enter your next number, currently #" + (counter+1));
            boolean hasNextInt = scanner.hasNextInt();
            if(hasNextInt){
                currentNumber = scanner.nextInt();
                if(min > currentNumber){
                    min = currentNumber;
                }
                else if(max < currentNumber){
                    max = currentNumber;
                }
                else{
                    continue;
                }
            }
            else{
                System.out.println("The smallest number you gave is: " + min);
                System.out.println("The highest number you gave is: " + max);
                break;
            }
        }

        scanner.close();
    }
}
