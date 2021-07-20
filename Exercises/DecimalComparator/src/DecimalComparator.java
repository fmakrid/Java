public class DecimalComparator {
    public static boolean areEqualByThreeDecimalPlaces(double number1, double number2){
        int x = (int) (number1 * 1000);
        int y = (int) (number2 * 1000);
        return (x == y);
    }
}
