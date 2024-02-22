// Retail inflation is the average yearly increase in prices of common goods sold in
// retail. For example, if the prices of common goods increase on an average by 10% in
// a year, the retail inflation is said to be 10%.
// Write a program that accepts the rate of retail inflation and number of years, and
// prints the compounded inflation at the end of the specified number of years. For
// example, if the retail inflation rate is specified as 20% and number of years as 5, the
// compounded retail inflation at the end of 5 years will be 1.25 = 2.49 = 149%.

public class Problem7 {

    public static double calculateCompoundedInflation(double rate, int years) {
        // Convert the percentage rate to a decimal
        double rateDecimal = rate / 100;

        // Calculate compounded inflation
        double compounded = Math.pow((1 + rateDecimal), years);

        return Math.round((compounded - 1) * 100);
    }

    public static void main(String args[]){

        double compounded = calculateCompoundedInflation(20, 5);

        // Print the compounded inflation
        System.out.printf("The compounded retail inflation is: " + compounded + " percent");
    }
    
}
