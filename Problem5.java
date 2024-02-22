// Write a program that computes the income tax for a person having specified income,
// using the income tax rates shown below.

public class Problem5 {

    public static double calculateIncomeTax(double income){
        double incomeTax = 0.0;

        if(income <= 250000){
            incomeTax = 0;
        }else if(income > 250000 && income <= 500000){
            incomeTax = 0.10 * (income - 250000);
        }else if(income > 500000 && income <= 1000000){
            incomeTax = (0.10 * 250000) + 0.20 * (income - 500000);
        }else{
            incomeTax = (0.10 * 250000) + 0.20 * 500000 + 0.30 * (income - 1000000);
        }

        return incomeTax;

    }
    public static void main(String args[]){
       
        System.out.println("Income tax is: " + calculateIncomeTax(2400000));
    }
}
