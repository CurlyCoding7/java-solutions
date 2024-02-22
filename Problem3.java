// Write a program that accepts two numbers and returns the larger of the two.

public class Problem3 {

    public static int getLargerNumber(int number1, int number2){
        if(number1 > number2){
            return number1;
        }
        else{
            return number2;
        }
    }
    public static void main(String args[]){

        System.out.println(getLargerNumber(79, 90) + " is greater.");


    }
}
