// Write a program that finds the string having the most number of vowels from an array
// of strings. For example, given the array “Sunshine” (3 vowels), “Umbrella” (3
// vowels), “Major” (2 vowels), “Resourceful” (5 vowels), the program must return the
// string “Resourceful”.

public class Problem6 {

    public static String getStringWithMostVowels(String arr[]){

        if(arr.length == 0){
            return "Please provide a valid array!";
        }

        int max = Integer.MIN_VALUE;
        String strWithMaxVowels = "";
        
        for(int i = 0; i < arr.length; i++){
            // get the first string from the array
            String str = arr[i];
            int vowelsCount = 0;

            for(int j = 0; j < str.length(); j++){
                // check if the character in the string is equal to a,e,i,o or u
                if(str.charAt(j) == 'a' || str.charAt(j) == 'e' || str.charAt(j) == 'i' || str.charAt(j) == 'o' || str.charAt(j) == 'u'){
                    vowelsCount++;
                }
            }

            // compare max with vowel count
            if(max < vowelsCount){
                max = vowelsCount;
                strWithMaxVowels = arr[i]; // store the string with maximum voewl count
            }

            vowelsCount = 0; // reset vowel count to 0 for another string
        }

        return strWithMaxVowels;
    }
    public static void main(String args[]){

        String arr[] = {"Sunshine", "Umbrella", "Major", "Resourceful", "Alphanumeric"}; // sample array

        System.out.println("String with maximum vowels is: " + getStringWithMostVowels(arr));
    }
}
