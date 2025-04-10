package textanylyzer;
import java.util.*;

public class TextAnylyzer {
    public static String inputText;
    private static int lengthCount;
    private static int wordCount;
    public static int spaces;
    private static int lines;
    private static int tabs;
    private String dropDownOption;

    public TextAnylyzer(String inputText) {
        this.inputText = inputText;
        inputTextAnylyze();
    }
 
    public static int getLength() {
        return lengthCount;
    }

    public static int getWordCount() {
        return wordCount;
    }

    public static int getSpaces() {
        return spaces;
    }

    public int getLines() {
        return lines;
    }

    public static int getTabs() {
        return tabs;
    }
    
    static void inputTextAnylyze(){
        lengthCount = inputText.length();
        spaces = inputText.split("\s",-1).length-1;
        wordCount = inputText.split("[\s\n]",-1).length;
        lines = inputText.split("\n",-1).length;
        tabs = inputText.split("\t",-1).length-1;
       
    }

    public static String getInputText() {
        return inputText;
    }
      
    public String getUniqueString(String s){
        StringBuilder sb = new StringBuilder();
        sb.append(s.charAt(0));
        for(int i=1; i<s.length(); i++){
            if(!sb.toString().contains(Character.toString(s.charAt(i))) && s.charAt(i)!=('\s') && s.charAt(i)!=('\n') && s.charAt(i)!=('\t')){
             sb.append(s.charAt(i));
    }
        }return sb.toString();
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        new TextAnylyzerJframe().setVisible(true);
        System.out.println();
    }
    
}
