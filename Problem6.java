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
            String str = arr[i];
            int vowelsCount = 0;

            for(int j = 0; j < str.length(); j++){
                if(str.charAt(j) == 'a' || str.charAt(j) == 'e' || str.charAt(j) == 'i' || str.charAt(j) == 'o' || str.charAt(j) == 'u'){
                    vowelsCount++;
                }
            }

            if(max < vowelsCount){
                max = vowelsCount;
                strWithMaxVowels = arr[i];
            }

            vowelsCount = 0;
        }

        return strWithMaxVowels;
    }
    public static void main(String args[]){

        String arr[] = {"Sunshine", "Umbrella", "Major", "Resourceful", "Alphanumeric"};

        System.out.println("String with maximum vowels is: " + getStringWithMostVowels(arr));
    }
}
