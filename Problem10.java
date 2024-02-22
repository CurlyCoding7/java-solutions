// Write a program that finds the second largest number from an array of unsorted
// numbers.

public class Problem10 {

    public static int findSecondLargest(int[] arr) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num != largest) {
                secondLargest = num;
            }
        }

        return secondLargest;
    }

    public static void main(String args[]){

        int[] numbers = {10, 5, 7, 18, 3, 20, 15}; // Sample array of numbers

        int secondLargest = findSecondLargest(numbers);

        System.out.println("The second largest number is: " + secondLargest);
        
    }
}
