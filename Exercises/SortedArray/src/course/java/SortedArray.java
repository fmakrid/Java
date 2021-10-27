package course.java;

import java.util.Scanner;

public class SortedArray {


    public static int[] getIntegers(int arraySize) {
        int[] intArray = new int[arraySize];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter " + arraySize + " numbers\r");

        for(int i = 0; i<arraySize; i++){
            intArray[i] = scanner.nextInt();
        }
        scanner.close();
        return intArray;
    }

    public static void printArray(int[] intArray) {
        for(int i = 0; i<intArray.length; i++) {
            System.out.println("Element " + i + " contents " + intArray[i]);
        }
    }

    public static int[] sortIntegers(int[] intArray) {
        int[] sortedArray = new int[intArray.length];

        for(int i = 0; i < intArray.length; i++) {
            sortedArray[i] = intArray[i];
        }

        boolean flag = true;
        int temp;

        while(flag){
            flag = false;
            for(int i = 0; i < sortedArray.length-1; i++) {
                if(sortedArray[i] < sortedArray[i+1]) {
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i+1];
                    sortedArray[i+1] = temp;
                    flag = true;
                }
            }
        }
        return sortedArray;
    }
}
