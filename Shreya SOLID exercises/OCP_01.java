package SOLID;

public class OCP_01 {

    //Define the strategy interface
    public interface DiscountStrategy {
        double getDiscount(double amount);
    }
   
    //Implement for each Regular customer type
    public static class RegularDiscount implements DiscountStrategy {
        @Override
        public double getDiscount(double amount) {
            return amount * 0.1;
        }
    }

    //Implement for each Premium customer type
    public static class PremiumDiscount implements DiscountStrategy {
        @Override
        public double getDiscount(double amount) {
            return amount * 0.2;
        }
    }

    //DiscountCalculator uses the strategy interface to calculate discounts
    public static class DiscountCalculator {
        public double calculateDiscount(DiscountStrategy strategy, double amount) {
            return strategy.getDiscount(amount);
        }
    }

      // Main method 
    public static void main(String[] args) {
        DiscountCalculator calculator = new DiscountCalculator();

        DiscountStrategy regular = new RegularDiscount();
        DiscountStrategy premium = new PremiumDiscount();

        double regularDiscount = calculator.calculateDiscount(regular, 100.0);
        double premiumDiscount = calculator.calculateDiscount(premium, 100.0);

        System.out.println("Regular Discount: " + regularDiscount);
        System.out.println("Premium Discount: " + premiumDiscount);
    }
}
