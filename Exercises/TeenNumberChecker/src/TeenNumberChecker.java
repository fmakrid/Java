public class TeenNumberChecker {
    public static boolean hasTeen(int kid1, int kid2, int kid3){
        return (isTeen(kid1) || isTeen(kid2) || isTeen(kid3));
    }

    public static boolean isTeen(int age){
        if((age >= 13) && (age <= 19)){
            return true;
        }
        else{
            return false;
        }
    }
}
