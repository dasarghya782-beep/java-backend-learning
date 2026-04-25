package day11;

public final class MathUtils {
    private MathUtils() {
        throw new UnsupportedOperationException("Cannot instantiate MathUtils");
    }

    public static double roundToTwoDecimals(double value){
        return Math.round(value*100.0)/100.0;
    }

    public static boolean isValidAmount(double amount){
        return amount>0 && amount<=10000000;
    }

    public static double calculateSimpleInterest(double principal, double rate, int years){
        if(principal<=0 || rate<=0 || years<=0){
            throw new IllegalArgumentException("Invalid inputs.");
        }
        return (principal*rate*years)/100;
    }
    public static double calculateCompoundInterest(double principal, double rate, int years) {
        if (principal <= 0 || rate <= 0 || years <= 0) {
            throw new IllegalArgumentException("Invalid inputs");
        }
        return principal * Math.pow((1 + rate / 100), years) - principal;
    }
}
