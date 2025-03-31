  class IT2023BIT008{
  
  //Implement the solution for Task 1
  public static String getSumOfDigits(int number) {
            int sum = 0;
            StringBuilder sb = new StringBuilder();if(number == 0) return number+"="+ number;
            return getSum(number, sum, sb);
}
    
        public static String getSum(int number, int sum, StringBuilder sb) {
            if (number == 0) {
                sb.deleteCharAt(sb.length() - 1); 
                return sb.reverse()+"="+ String.valueOf(sum);
            }
    
            int digit = number % 10;
            sb.append(digit).append("+");
            sum += digit;
    
            return getSum(number / 10, sum, sb);
        }
  
  
  
 //  Implement the solution for Task 2 
 public static String isPali(int num) {
        int rev = 0;
        String str = String.valueOf(num);
        return checkPalindrome(num, rev, str, 0, str.length() - 1, str, "");
 }

  public static String checkPalindrome(int num, int rev, String str, int i, int j, String original, String matches) {
        if (num == 0) {
            if (String.valueOf(rev).equals(str)) {
                return str + " is a Palindrome..!"+"\n" + matches;
            } else {
                return str + " is not a Palindrome..! \n" + matches;
            }
         }

        int digit = num % 10;
        rev = rev * 10 + digit;

        if (i < j) {
            if (original.charAt(i) == original.charAt(j)) {
                matches += "(Index " + i + ") '" + original.charAt(i) + 
                           "' matches with (Index " + j + ") '" + original.charAt(j) + "'\n";
            } else {
                matches += "(Mismatch) (Index " + i + ") '" + original.charAt(i) + 
                           "' does not match with (Index " + j + ") '" + original.charAt(j) + "'\n";
         }
         }

         return checkPalindrome(num / 10, rev, str, i + 1, j - 1, original, matches);
  }
   
//Implement the solution for Task 3

  
  public static int countPalindromeSubstring(String str){
        int count = 1;
        for(int i=0; i<str.length(); i++){
            for(int j=i+1; j<=str.length(); j++){
                String Substring = str.substring(i,j);
                String reverseResult = new StringBuilder(Substring).reverse().toString();
                if(Substring.equals(reverseResult)){
                    count++;
                }
          }
        }
        return count++;
    }

  }
