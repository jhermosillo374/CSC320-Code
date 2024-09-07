import java.util.Scanner;

public class GroceryBillCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter coupon amount as a decimal (e.g., .10): ");
        double coupon = scanner.nextDouble();
        
        if (coupon > 1.0 || coupon <= 0) {
            coupon = 0.10; 
        }
        
        double[] weeklyBills = new double[4];
        double totalMonthly = 0.0;
        
        for (int i = 0; i < 4; i++) {
            System.out.print("Enter grocery bill for week " + (i + 1) + ": ");
            weeklyBills[i] = scanner.nextDouble();
            totalMonthly += weeklyBills[i];
        }
        
        double weeklyAverage = totalMonthly / 4;
        double monthlyWithCoupon = totalMonthly * (1 - coupon);
        double weeklyAverageWithCoupon = weeklyAverage * (1 - coupon);
        
        System.out.printf("Monthly Total (without coupon): $%.2f%n", totalMonthly);
        System.out.printf("Weekly Average (without coupon): $%.2f%n", weeklyAverage);
        System.out.printf("Monthly Total (with coupon): $%.2f%n", monthlyWithCoupon);
        System.out.printf("Weekly Average (with coupon): $%.2f%n", weeklyAverageWithCoupon);
        
        scanner.close();
    }
}