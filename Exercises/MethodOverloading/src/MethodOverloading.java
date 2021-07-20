public class MethodOverloading {

    public static void main(String[] args) {
        System.out.println(calcFeetAndInchesToCentimeters(6,0));
    }


    public static double calcFeetAndInchesToCentimeters(double feet, double inches){
        if(feet >= 0){
            if(inches >=0 && inches <=12){
                double convInches = (feet * 12) + inches;
                double cm = convInches * 2.54;
                return cm;
            }

        }

        return -1;
    }

    public static double calcFeetAndInchesToCentimeters(double inches){
        if(inches >= 0){
            int feetResult = (int) inches / 12;
            double leftover = inches % 12;
            calcFeetAndInchesToCentimeters(feetResult,leftover);

        }
        return -1;
    }

}

