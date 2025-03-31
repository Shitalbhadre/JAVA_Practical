
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

Is Palindrome or not 

 public static String isPali(int num){
   ...>         int rev = 0;
   ...>         int OriginalNumber = num;
   ...>         return getPali(num,rev,num);
   ...> }
   ...> public static String getPali(int num, int rev, int OriginalNumber){
   ...>         if(num == 0){
   ...>         return rev==OriginalNumber ? OriginalNumber+ " is a Palindrome..!" : OriginalNumber + " is not a Palindrome";
   ...>         }
   ...>         int digit = num%10;
   ...>         rev = rev*10+digit;
   ...>         return getPali(num/10,rev,OriginalNumber);
   ...>         }




public static String isPali(int num){
                int rev = 0;int i = 0; int j =0;
                String str = String.valueOf(num);
                String s = str;
                return getPali(num,rev,num,i,j);
        }
        public static String getPali(int num, int rev, String str,int i,int j ,String s){
                 if(num == 0){
                 if(String.valueOf(rev).equals(str)){ 
                 return str + " is a Palindrome..!" +"Because (Index"+i+")" str.charAt(0) + "is matches with (Index "+str.length()-(i+1) + ")"+
                 getPali(num,rev,str,i++,j++,(0, inputString.length()-1))
                 }
                 else{
                 return str + " is not a Palindrome";
                }
                int digit = num%10;
                rev = rev*10+digit;
                return getPali(num/10,rev,OriginalNumber);
                }
                
                
                
                
                
                
     

