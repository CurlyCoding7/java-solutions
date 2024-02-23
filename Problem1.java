
class Problem1 {

    public static int getNumberOfDigits(int number) {
        
        // remove signs from the number
        number = Math.abs(number);

        // initialize count variable
        int count = 0;

        while (number > 0) {

            // remove last digit in every iteration
            number = number / 10;

            // increment count for every last digit
            count++;

        }

        return count;

    }

    public static void main(String args[]) {

        int number = 78; // sample input

        int numberOfDigits = getNumberOfDigits(number); // calling the method

        System.out.println("Number of digits: " + numberOfDigits); // displaying result

    }
}