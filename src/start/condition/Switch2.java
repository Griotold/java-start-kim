package start.condition;

public class Switch2 {
    public static void main(String[] args) {
        // grade 1 : 1000, 2 : 2000, 3 : 3000
        int grade = 4;
        int coupon;

        switch (grade) {
            case 1 :
                coupon = 1000;
                break;
            case 2 :
                coupon = 2000;
                break;
            case 3 :
                coupon = 3000;
                break;
            default :
                coupon = 500;
        }
        System.out.println(coupon);
    }
}
