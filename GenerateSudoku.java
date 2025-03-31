class Practical10{

       static String[][] result;
       static String[][] question;
          
       public static void main(String args[]){
          int size = Integer.parseInt(args[0]);
          result = new String[size][size];
          question = new String[size][size];
         
          generateArray(size);
          generateQuestion(size);
          PrintLayOut(size);
       } 
      
       public static String[][] generateArray(int size) {
           
           for (int i = 0; i < size; i++) {
               int col = 0;
               for (int j = i; j < size; j++) {
                    result[i][col] = String.format("%3d", j + 1);
                    col++;
               }
               for (int j = 0; j < i; j++) {
                    result[i][size - i + j] = String.format("%3d", j + 1);
               }
            }
            return result;
        }
      
        public static String[][] generateQuestion(int size){
    
        for (int i = 0; i < size; i++) {
         for (int j = 0; j < size; j++) {
<<<<<<< Updated upstream
            question[i][j] = result[i][j]; 
=======
            question[i][j] = result[i][j]; // Copy values
>>>>>>> Stashed changes
         }
        }

        for(int i = 0; i < (size * size) - 2 * (size - 1); i++) {
           int row = (int)(System.nanoTime() % size); 
           int col = (int)(System.nanoTime() % size); 
           question[row][col] = "   "; 
        }
        return question;
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
<<<<<<< Updated upstream
                  
=======
                  //String value = question[(line/2)-1][(verticalLine/2)-1];
>>>>>>> Stashed changes
                  System.out.print(s.replaceFirst("   ", question[(line/2)-1][(verticalLine/2)-1]));                
               }else{
                     System.out.print("|");
               }
               }
               }
               System.out.println();
               }
        }
}
