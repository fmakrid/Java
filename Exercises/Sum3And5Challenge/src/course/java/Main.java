package course.java;

public class Main {

    public static void main(String[] args) {
        for (int i=1,summer=0,guard = 0; i<1001; i++) {
            if ((i % 3 == 0) && (i % 5 == 0)) {
                summer = summer + i;
                System.out.println(i);
                guard++;
            }
            if (guard >= 5) {
                System.out.println(summer);
                break;
            }
        }
    }
}
