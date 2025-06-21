
public class FinancialForecast {

    // Recursive method to calculate future value
    public static double calculateFutureValue(double presentValue, double growthRate, int years) {
        if (years == 0|| presentValue==0) {
            return presentValue;
        }
        return calculateFutureValue(presentValue, growthRate, years - 1) * (1 + growthRate);
    }
    public static double calculateFutureValueMemo(double presentValue, double growthRate, int years, double[] memo) {
        if (years == 0 || presentValue == 0) return presentValue;
        if (memo[years] != 0) return memo[years]; 
        return memo[years] = calculateFutureValueMemo(presentValue, growthRate, years - 1, memo) * (1 + growthRate);        
    }
    public static void main(String[] args) {
        double presentValue = 10000; // ₹10,000
        double growthRate = 0.08;    // 8% annual growth
        int years = 5;

        double futureValue = calculateFutureValue(presentValue, growthRate, years);
        System.out.printf("Future value after %d years using Recursion: Rs. %.2f%n", years, futureValue);
        double[] memo = new double[years + 1];
        double futureValueMemo = calculateFutureValueMemo(presentValue, growthRate, years,memo);
        System.out.printf("Future Value after %d years using memo : Rs. %.2f%n",years, futureValueMemo);  
    }
}
