package course.java;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int i = 0;


        do{
            System.out.println("Enter number #" + (i+1));
            boolean hasNextInt = scanner.hasNextInt();
            if(hasNextInt){
                sum = sum + scanner.nextInt();
                i++;
            }
            else{
                System.out.println("Invalid Number");
                scanner.nextLine();
            }
        if(i == 10){
            System.out.println("The sum is: " + sum);
        }
        } while (i < 10);

        scanner.close();
    }
}
