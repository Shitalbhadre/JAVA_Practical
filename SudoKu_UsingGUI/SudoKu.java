
package sudoku;
import javax.swing.JTextField;
import java.util.Random;

public class SudoKu {
    static Random random = new Random();
  
   
    public static String[][] fillArray(int size, String[][] result) {
    

    for (int row = 0; row < size; row++) {
        for (int col = 0; col < size; col++) {
            String number;
            int attempts = 0;
            do {
                number = String.format("%3s", random.nextInt(size) + 1);
                attempts++;

                if (attempts > size * size) {
                    
                    col = -1; // go back to start of this row
                    break;
                }
            } while (!isUnique(row, col, number, result));

            if (attempts <= size * size) {
                result[row][col] = number;
            }
        }
    }
    return result;
    }
    public static boolean isUnique(int row, int col, String number, String result[][]) {
        
        for (int i = 0; i < col; i++) {
            if (result[row][i].equals(number) ) {
                return false;
            }
        }
     
        for (int i = 0; i < row; i++) {
            if ( result[i][col].equals(number) ) {
                return false;
            }
        }
        return true;
    }
  
    public static String[][] generateQuestion(int size, String[][] question, String[][] result){
    
        for (int i = 0; i < size; i++) {
        for (int j = 0; j < size; j++) {
            question[i][j] = result[i][j]; 
        }
        }

        for(int i = 0; i < (size * size)/2 ; i++) {
           int row = random.nextInt(size);
           int col = random.nextInt(size);
           question[row][col] = "   "; 
        }
        return question;
        }
    public static String[][] getSolver( int size, String solve[][], JTextField[][] textField){
        for(int i=0; i<size; i++){
            for(int j=0; j<size; j++){
                solve[i][j] =  textField[i][j].getText().trim();
            }
        }
        return solve;
    }
    public static void main(String[] args) {
        // TODO code application logic here
        new SudoKu().setVisible(true);
    }

    private void setVisible(boolean b) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
 
}
