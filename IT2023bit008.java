public class IT2023bit008 {
    
    // Implement the solution for Task 1
    public static String reverse(String inputString) {
           if(inputString != ""){
           return inputString.charAt(inputString.length()-1) + reverse(inputString.substring(0, inputString.length()-1));
           }
           return inputString;
     }

    // Implement the solution for Task 2
    public static int sumOfDigits(int number) {
           if (number == 0) {
           return 0;  // Base case: when number becomes 0, return sum as 0
           }
           return (number % 10) + sumOfDigits(number / 10);  
     }
    // Implement the solution for Task 3
    public static boolean isPalindrome(String inputString) {
           if (inputString.length() <= 1) {
           return true;
           }
           if (inputString.charAt(0) != inputString.charAt(inputString.length() - 1)) {
           return false;
           }
           return isPalindrome(inputString.substring(1, inputString.length() - 1));
    }
}
