import java.util.Random;
import java.io.*;

class SudoKuNextVersion {
    
    static int size;
    static String[][] result;    
    static Random random = new Random(); 
    static String[][] question;
    static String[][] solve;

    public static void main(String args[])throws IOException {
        size = Integer.parseInt(args[0]);
        result = new String[size][size];
        question = new String[size][size];
        solve = new String[size][size];
        
        fillArray();  
        generateQuestion(size);
        PrintLayOut(size);
        
        for (int i = 0; i < size; i++) {
          for (int j = 0; j < size; j++) {
            solve[i][j] = question[i][j]; 
          }
         }
         
          for(int row =0; row<size; row++){
          for(int col=0; col<size; col++){
          
          if((solve[row][col]).equals("   ")){
          getSolver(row, col);
          PrintLayOut1(size);
          }
          }  
          }
          boolean winner = true;  

    	  for (int i = 0; i < size; i++) {
    	  for (int j = 0; j < size; j++) {
              if (!isUnique(i, j, solve[i][j])) {  
              winner = false;  
          }
          }
          }


    	  if (winner) {
    	  System.out.println("You are Winner....!");
          } else {
   	  System.out.println("You are Loser, Please try again....");
  	  }

    }
    
    

    public static String[][] fillArray() {
        for (int row = 0; row < size; row++) {
            for (int col = 0; col < size; col++) {
                String number;
                do {
                    number = String.format("%3s", random.nextInt(size) + 1);
                } while (!isUnique(row, col, number));
                
                result[row][col] = number;
            }
        }
        return result;
        
    }

    public static boolean isUnique(int row, int col, String number) {
        
        for (int i = 0; i < col; i++) {
            if (result[row][i].equals(number)) {
                return false;
            }
        }
     
        for (int i = 0; i < row; i++) {
            if (result[i][col].equals(number)) {
                return false;
            }
        }
        return true;
    }

    public static String[][] generateQuestion(int size){
    
        for (int i = 0; i < size; i++) {
         for (int j = 0; j < size; j++) {

            question[i][j] = result[i][j]; 

            question[i][j] = result[i][j]; 

         }
        }

        for(int i = 0; i < (size * size) - 2 * (size - 1); i++) {
           int row = (int)(System.nanoTime() % size); 
           int col = (int)(System.nanoTime() % size); 
           question[row][col] = "   "; 
        }
        return question;
        }
       
  
    
    public static String[][] getSolver(int row, int col)throws IOException{
      
          System.out.println("Enter the number in grid " + (size*row+1+col));
          
          InputStreamReader in = new InputStreamReader(System.in);
          BufferedReader bf = new BufferedReader(in);
          String num = bf.readLine();
          
          solve[row][col] = String.format("%3s",(num));
          
     
          return solve;
    }
    
    public static void PrintLayOut(int size){
               String s = "   ";
               for(int line=1; line<=(size*2+1); line++){
               if(line%2 !=0){
               for(int horizontalLine = 1; horizontalLine<=size*2; horizontalLine++){
               if(horizontalLine%2==0){
                    System.out.print("---");
               }else{
                    System.out.print(" ");
               }
               }
               }else{
               for(int verticalLine = 1; verticalLine<=size*2+1; verticalLine++){
               if(verticalLine%2 == 0){
                   
                     System.out.print(s.replaceFirst("   ", question[(line/2)-1][(verticalLine/2)-1]));                
               }else{
                     System.out.print("|");
               }
               }
               }
               System.out.println();
               }
        }
          
    
    public static void PrintLayOut1(int size){
               String s = "   ";
               for(int line=1; line<=(size*2+1); line++){
               if(line%2 !=0){
               for(int horizontalLine = 1; horizontalLine<=size*2; horizontalLine++){
               if(horizontalLine%2==0){
                    System.out.print("---");
               }else{
                    System.out.print(" ");
               }
               }
               }else{
               for(int verticalLine = 1; verticalLine<=size*2+1; verticalLine++){
               if(verticalLine%2 == 0){
                    String value = solve[(line/2)-1][(verticalLine/2)-1];
                    System.out.print(s.replaceFirst("   ", (value != null) ? value : " _ "));  
                                   
               }else{
                     System.out.print("|");
               }
               }
               }
               System.out.println();
               }
        }
}

