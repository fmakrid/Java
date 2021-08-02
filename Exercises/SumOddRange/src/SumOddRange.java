public class SumOddRange {
    public static boolean isOdd(int number){
        if(number <= 0){
            return false;
        }
        else if(number % 2 != 0){
            return true;
        }
        else{
            return false;
        }
    }
    public static int sumOdd(int start, int end){
        if((end < start) || (start <= 0)){
            return -1;
        }
        int sum = 0;
        for(; start <= end; start++){
            if(isOdd(start)){
                sum = sum + start;
            }
        }
        return sum;
    }
}
