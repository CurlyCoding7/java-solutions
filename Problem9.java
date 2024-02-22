// A two-digit special integer is obtained by adding its individual digits to the product of
// the digits. For example, the special two-digit integer “59” is obtained as “5 + 9 + 5 x 9
// = 5 + 9 + 45”.
// Write a program that accepts an integer and determines if it is a two-digit special
// integer.


public class Problem9 {

    public static boolean isSpecialInteger(int number){
        int sum = 0;
        int product = 1;
        int originalNumber = number;

        while (number > 0) {
            int lastDigit = number % 10;
            sum = sum + lastDigit;
            product = product * lastDigit;
            number = number / 10;

        }

        if(sum + product == originalNumber){
            return true;
        }

        return false;

    }
    public static void main(String args[]){
 
        System.out.println("Is it special integre? " + isSpecialInteger(59));
    }
    
}
