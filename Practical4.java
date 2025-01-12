public class Practical4 {
    public static void main(String[] args) {
        
        Practical4 obj = new Practical4();
        obj.getBytes(num);
        obj.getShort(num);
        
        
        obj.getNumber(num, type);
        
        obj.toXXSystem(num, XX);
        
    }

    public void getBytes(int num) {
        int ans;
        int temp;
        temp = (num / 128);

        if (num < 0) {
            if (temp % 2 != 0) {
                if (num % 128 == 0) {
                    ans = -((num % 128) + 128);
                } else {
                    ans = (num % 128) + 128;
                }
            } else {
                ans = num % 128;
            }
        } else {
            if (temp % 2 == 0) {
                ans = num % 128;
            } else {
                ans = (num % 128) - 128;
            }
        }
        System.out.println("Entered number in byte is: " + ans);
    }

    public void getShort(int num) {
        int ans;
        int temp = num / 32768;

        if (num > 0) {
            if (temp % 2 == 0) {
                ans = num % 32768;
            } else {
                ans = (num % 32768) - 32768;
            }
        } else {
            if (temp % 2 != 0) {
                if (num % 32768 == 0) {
                    ans = -((num % 32768) + 32768);
                } else {
                    ans = (num % 32768) + 32768;
                }
            } else {
                ans = num % 32768;
            }
        }
        System.out.println("Entered number in short is: " + ans);
    }

    public void getNumber(int num, String type) {
        if (type.equalsIgnoreCase("BYTES")) {
            getBytes(num);
        } else if (type.equalsIgnoreCase("SHORT")) {
            getShort(num);
        } else {
            System.out.println("Invalid type....!");
        }
    }
    

public String toXXSystem(String num, String XX) {

    if (!num.startsWith("0b") && !num.startsWith("0x") && !num.startsWith("0o") && XX.equals("b")) {
        int decimal = Integer.parseInt(num);
        return Integer.toString(DecimalToBinary(decimal));
        
    } else if (!num.startsWith("0b") && !num.startsWith("0x") && !num.startsWith("0o") && XX.equals("o")) {
        int decimal = Integer.parseInt(num);
        return Integer.toString(DecimalToOctal(decimal));
        
    } else if (!num.startsWith("0b") && !num.startsWith("0x") && !num.startsWith("0o") && XX.equals("h")) {
        int decimal = Integer.parseInt(num);
        return DecimalToHexadecimal(decimal);
    
    }else if(num.startsWith("0b") && XX.equals("d")){
        int binary = Integer.parseInt(num.substring(2));
        return Integer.toString(BinaryToDecimal(binary));
    
    }else if(num.startsWith("0b") && XX.equals("o")){
        int binary = Integer.parseInt(num.substring(2));
        return Integer.toString(BinaryToOctal(binary));

    }else if(num.startsWith("0b") && XX.equals("h")){
        int binary = Integer.parseInt(num.substring(2));
        return BinaryToHexadecimal(binary);
        
    }else if(num.startsWith("0o") && XX.equals("d")){
        int octal = Integer.parseInt(num.substring(2));
        return Integer.toString(OctalToDecimal(octal));
        
    }else if(num.startsWith("0o") && XX.equals("b")){
        int octal = Integer.parseInt(num.substring(2));
        return Integer.toString(OctalToBinary(octal));
        
    }else if(num.startsWith("0o") && XX.equals("h")){
        int octal = Integer.parseInt(num.substring(2));
        return OctalToHexadecimal(octal);
    
    }else if (num.startsWith("0x") && XX.equals("d")) {
    int hexadecimal = Integer.parseInt(num.substring(2), 16); 
    return Integer.toString(HexadecimalToDecimal(Integer.toString(hexadecimal)));

}else if (num.startsWith("0x") && XX.equals("b")) {
    int hexadecimal = Integer.parseInt(num.substring(2), 16); 
    return Integer.toString(HexadecimalToBinary(Integer.toString(hexadecimal)));
   
   }else if (num.startsWith("0x") && XX.equals("o")) {
    int hexadecimal = Integer.parseInt(num.substring(2), 16); 
    return Integer.toString(HexadecimalToOctal(Integer.toString(hexadecimal)));
   }
  return "Invalid input"; 
}

public int DecimalToBinary(int num) {
    int rem = 0;
    int Binary = 0;
    int places = 1;

    while (num > 0) {
        rem = num % 2;
        num = num / 2;
        Binary = Binary + rem * places;
        places = places * 10;
    }
    return Binary;
}

public int DecimalToOctal(int num) {
    int rem = 0;
    int Octal = 0;
    int place = 1;
    while (num > 0) {
        rem = num % 8;
        num = num / 8;
        Octal = Octal + rem * place;
        place = place * 10;
    }
    return Octal;
}

public String DecimalToHexadecimal(int num) {
    String ans = "";
    int rem = 0;
    while (num > 0) {
        rem = num % 16;
        if (rem > 9) {
            switch (rem) {
                case 10:
                    ans = "A" + ans;
                    break;
                case 11:
                    ans = "B" + ans;
                    break;
                case 12:
                    ans = "C" + ans;
                    break;
                case 13:
                    ans = "D" + ans;
                    break;
                case 14:
                    ans = "E" + ans;
                    break;
                case 15:
                    ans = "F" + ans;
                    break;
                default:
                    break;
            }
        } else {
            ans = rem + ans;
        }
        num = num / 16;
    }
    return ans;
}
public int BinaryToDecimal(int num) {
        int rem = 0;
        int dec = 0;
        int i = 0;
          while (num > 0) {
          rem = num % 10;
          dec = dec + (int)(Math.pow(2, i) * rem); 
          num = num / 10;
          i++;
      }
       return dec;
    }
       
public int BinaryToOctal(int num){
            int rem = 0;
            int dec = 0;
            int i = 0;
            while (num > 0) {
            rem = num % 10;
            dec = dec + (int)(Math.pow(2, i) * rem); 
            num = num / 10;
            i++;
            }
            int Octal = 0;
            int place = 1;
            while(dec>0){
               rem = dec%8;
               dec = dec/8;
               Octal = Octal+rem*place;
               place = place*10;
            }
            return Octal;
 }
        
 public String BinaryToHexadecimal(int num){
        int rem = 0;
        int dec = 0;
        int i = 0;
           while (num > 0) {
               rem = num % 10;
               dec = dec + (int)(Math.pow(2, i) * rem); 
               num = num / 10;
               i++;
           }
       
            String hexa = "";
            
                while(dec>0){
                rem = dec%16;
                if(rem>9){
                    switch(rem){
                        case 10: hexa = "A"+hexa;
                        break;
                        case 11: hexa = "B"+hexa;
                        break;
                        case 12: hexa = "C"+hexa;
                        break;
                        case 13: hexa = "D"+hexa;
                        break;
                        case 14: hexa = "E"+hexa;
                        break;
                        case 15: hexa = "F"+hexa;
                        break;
                        default:
                        break;
             }
             }
             else{
                 hexa = rem + hexa;
                 }
                 dec = dec/16;
             }
             return hexa;
 }
 
 public int OctalToDecimal(int num) {
    int rem = 0;
    int i = 0;
    int dec = 0;
    int temp = num;

    while (temp > 0) {
        int digit = temp % 10;
        if (digit < 0 || digit > 7) {
            return -1; 
        }
        temp /= 10;
    }
    while (num > 0) {
        rem = num % 10;
        dec = dec + rem * (int) Math.pow(8, i);
        num = num / 10;
        i++;
    }

    return dec;
}

public int OctalToBinary(int num){
        int rem = 0;
        int i = 0;
        int dec = 0;
        int temp = num;
    
        while (temp > 0) {
           int digit = temp % 10;
           if (digit < 0 || digit > 7) {
             throw new IllegalArgumentException("Invalid Octal number! Digits must be between 0 and 7."); 
           }
            temp /= 10;
       }
        while (num > 0) {
           rem = num % 10;
           dec = dec + rem * (int) Math.pow(8, i);
           num = num / 10;
           i++;
        }
         
        int Binary = 0;
        int places = 1;
        while(dec>0){
             rem = dec%2;
             dec = dec/2;
             Binary = Binary + rem*places;
             places = places * 10;
        }
        return Binary;
    }
 public String OctalToHexadecimal(int num){
        int rem = 0;
        int i = 0;
        int dec = 0;
        int temp = num;
    
        while (temp > 0) {
           int digit = temp % 10;
           if (digit < 0 || digit > 7) {
             throw new IllegalArgumentException("Invalid Octal number! Digits must be between 0 and 7."); 
           }
            temp /= 10;
    }
    while (num > 0) {
        rem = num % 10;
        dec = dec + rem * (int) Math.pow(8, i);
        num = num / 10;
        i++;
    }
     String ans = "";
            while(dec>0){
            rem = dec%16;
            if(rem>9){
                switch(rem){
                    case 10: ans = "A"+ans;
                    break;
                    case 11: ans = "B"+ans;
                    break;
                    case 12: ans = "C"+ans;
                    break;
                    case 13: ans = "D"+ans;
                    break;
                    case 14: ans = "E"+ans;
                    break;
                    case 15: ans = "F"+ans;
                    break;
                    default:
                    break;
                }
            }
            else{
                ans = rem + ans;
            }
            dec = dec/16;
        }
        return ans;
    }
    public int HexadecimalToDecimal(String num) {
        int dec = 0;
        int i, j = 0;
        int len = num.length();
        for (i = len - 1; i >= 0; i--) {
            char currentChar = num.charAt(i);
            if (currentChar >= '0' && currentChar <= '9') {
                dec = dec + (currentChar - 48) * (int) Math.pow(16, j);
                j++;
            } 
            else if (currentChar >= 'A' && currentChar <= 'F') {
                dec = dec + (currentChar - 55) * (int) Math.pow(16, j);
                j++;
            }
        }
        return dec;
   }
   
   public int HexadecimalToBinary(String hexa){
          int dec = 0;
          int i, j = 0;
          int len = hexa.length();
             for (i = len - 1; i >= 0; i--) {
             char currentChar = hexa.charAt(i);
             if (currentChar >= '0' && currentChar <= '9') {
                  dec = dec + (currentChar - 48) * (int) Math.pow(16, j);
                  j++;
              } 
              else if (currentChar >= 'A' && currentChar <= 'F') {
                  dec = dec + (currentChar - 55) * (int) Math.pow(16, j);
                  j++;
              }
             }
          int rem = 0;
          int Binary = 0;
          int places = 1;
          while(dec>0){
              rem = dec%2;
              dec = dec/2;
              Binary = Binary + rem*places;
              places = places * 10;
          }
          return Binary;
    }
    public int HexadecimalToOctal(String num) {
        int dec = 0;
        int i, j = 0;
        int len = num.length();
        for (i = len - 1; i >= 0; i--) {
            char currentChar = num.charAt(i);
            if (currentChar >= '0' && currentChar <= '9') {
                dec = dec + (currentChar - 48) * (int) Math.pow(16, j);
                j++;
            } 
            else if (currentChar >= 'A' && currentChar <= 'F') {
                dec = dec + (currentChar - 55) * (int) Math.pow(16, j);
                j++;
            }
        }
        int rem = 0;
        int Octal = 0;
        int place = 1;
        while(dec>0){
            rem = dec%8;
            dec = dec/8;
            Octal = Octal+rem*place;
            place = place*10;
        }
        return Octal; 
}
    
    
    
    
