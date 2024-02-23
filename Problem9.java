// A two-digit special integer is obtained by adding its individual digits to the product of
// the digits. For example, the special two-digit integer “59” is obtained as “5 + 9 + 5 x 9
// = 5 + 9 + 45”.
// Write a program that accepts an integer and determines if it is a two-digit special
// integer.


public class Problem9 {

    public static boolean isSpecialInteger(int number){
        int sum = 0;
        int product = 1;
        // store the original number to compare later
        int originalNumber = number;

        while (number > 0) {
            // get the last digit of the number
            int lastDigit = number % 10;
            // add last digit to the sum of digits
            sum = sum + lastDigit;
            // multiply last digit to the product of digits
            product = product * lastDigit;
            // remove last digit from the number
            number = number / 10;

        }

        // check if the original number is equal to the number obtained by addition of sum of indivial digits to the product of the digits
        if(sum + product == originalNumber){
            return true;
        }

        return false;

    }
    public static void main(String args[]){
 
        int number = 59;
        boolean result = isSpecialInteger(number);
        System.out.println("Is it special integre? " + result);
    }
    
}
