// Write a program that finds the median of a sorted array of numbers, where the
// median of an array is defined as the number exactly in the middle of the sorted array.
// When the array contains an odd number of numbers, the median is the number
// exactly in the middle and when the array contains an even number of numbers, the
// median is the average of the two numbers exactly in the middle. The table below
// shows some sorted arrays, their middle elements and their medians.



public class Problem4 {

    public static double getMiddleElement(double arr[]){
        // if array is empty, return -1.0
        if(arr.length == 0) return -1.0;
    
        // first position of the array
        int first = 0;

        // last position of the array
        int last = arr.length - 1;

        // deriving the mid position
        int mid = (first + last) / 2;
    
        // there is even number of elements in the array
        if(arr.length % 2 == 0){
            double median = (arr[mid] + arr[mid+1]) / 2; // here median is the average of two middle elements
            return median;
        }
        else{ // array with odd number of elements
            return arr[mid];
    
        }
        
    }

    public static void main(String args[]){

        double arr[] = {17.4, 21.1, 39.7, 48.0}; // sample array
        double result = getMiddleElement(arr);
        System.out.println("Result is: " + String.format("%.1f", result));


    }
}
