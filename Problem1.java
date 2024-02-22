// Write a program that prints the number of digits in an integer. For example, given the
// integer “34” (without quotes) as the input, the program must print “2” (without quotes)
// as the output, given “-7291” (without quotes), the program must print “4” (without
// quotes), and so on.


class Problem1 {
    
    public static int getNumberOfDigits(int number){
        
        number = Math.abs(number);

        int count = 0;

        while(number > 0){
            number = number / 10;
            count++;

        }

        return count;

    }

    public static void main(String args[]){

        System.out.println("Number of digits: " + getNumberOfDigits(78));
   
    }
}