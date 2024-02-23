// Write a program that finds the second largest number from an array of unsorted
// numbers.

public class Problem10 {

    public static int findSecondLargest(int[] arr) {
        int largest = Integer.MIN_VALUE; // initialize larget wth minimum value
        int secondLargest = Integer.MIN_VALUE; // initialize second largest wth minimum value

        for (int num : arr) {
            // check if the current number is greater than the largest number
            if (num > largest) {
                secondLargest = largest; // replace second larest with largest
                largest = num; // replace largest with the current numberr
            } else if (num > secondLargest && num != largest) { // check if the current number is greate than second largest and it is not the largest number
                secondLargest = num; // replace second largest with current number
            }
        }

        return secondLargest; // return second largest number
    }

    public static void main(String args[]){

        int[] numbers = {10, 5, 7, 18, 3, 20, 15}; // Sample array of numbers

        int secondLargest = findSecondLargest(numbers);

        System.out.println("The second largest number is: " + secondLargest);

    }
}
