// A supermarket sells thousands of products. Every product is properly packaged and
// the product packaging shows the total price a customer must pay for the product.
// The total product price includes taxes and the rate of taxation varies from product to
// product. For legal reasons, the supermarket must provide invoices to every customer
// that show the price of each product before taxes, the tax rate and the tax amount.
// Write a program that takes the net price of a product including taxes and the tax rate,
// and computes the gross price before taxes. The table below shows some examples
// for the expected output of the program.


public class Problem2 {

    public static double getGrossAmount(double netAmount, double taxRate){
        
        double grossAmount = netAmount / (1 + taxRate);

        return grossAmount;

    }
    public static void main(String args[]){

        System.out.println("Gross Amount: " + String.format("%.2f", getGrossAmount(99.95, 0.12)) );
    }
}
