public class Practical7{
       public static void main(String a[]){
           //int size = 3;
           Practical7 obj = new Practical7();
           int size = Integer.parseInt(a[0]);
           size = size+3;
           if(size%2!=0){
              size = size+1;
           }
           for(int line=1; line<=size; line++){
               System.out.println(obj.displayS1(line,size) + " "+ obj.displayH1(line, size) +" "+ obj.displayI1(line, size)+" "
               + obj.displayT1(line, size) +" "+obj.displayA1(line, size)+" "+obj.displayL1(line, size));
           }
           for(int line=1; line<=size-1; line++){
               System.out.println(obj.displayS2(line, size)+ " "+ obj.displayH2(line, size)+ " " + obj.displayI2(line, size) +" "
               + obj.displayT2(line, size)+" "+obj.displayA2(line, size)+" "+displayL2(line, size));
           }
       }
     
       public static String displayS1(int line, int size){
              
              String pattern = "";
              if(line==1 || line==size){
              for(int star=1; star<=size+1; star++){
                  pattern+=" *";
              }
              }else{
              pattern+=" *";
              for(int space=1; space<=size; space++){
                  pattern+="  ";
              }
              }
              return pattern;
              }
        
        public static String displayS2(int line, int size){
              
              String pattern = "";
              if(line==size-1){
               for(int star=1; star<=size+1; star++){
                  pattern+=" *";
              }
              }else{
              
              for(int space=1; space<=size; space++){
                  pattern+="  ";
              }
              pattern+=" *";
              }
              return pattern;
       }
         
       public static String displayH1(int line, int size){
              
              String pattern = "";
              if(line==size){
              for(int star=1; star<=size+1; star++){
                  pattern+=" *";
              }
              }else{
              pattern+=" *";
              for(int space=1; space<size; space++){
              pattern+="  ";
              }
              pattern+=" *";
              }
              return pattern;
              }
              
         public static String displayH2(int line, int size){
             
              String pattern = "";
              pattern+=" *";
              for(int space=1; space<size; space++){
              pattern+="  ";
              }
              pattern+=" *";
              
              return pattern;
        }
        
        public static String displayI1(int line, int size){
              
              String pattern = "";
              
              if(line==1){
              for(int star=1; star<=size+1; star++){
              pattern+=" *";
              }
              }else{
              for(int space=1; space<=(size/2); space++){
              pattern+="  ";
              }
              pattern+=" *";
              for(int space=1; space<=(size/2); space++){
              pattern+="  ";
              }
              }
              
              
              
              
              return pattern;
        }
      

        
        public static String displayI2(int line, int size){
             
              String pattern = "";
              if(line==size-1){
              for(int star=1; star<=size+1; star++){
              pattern+=" *";
              }
              }else{
              for(int space=1; space<=(size/2); space++){
              pattern+="  ";
              }
              pattern+=" *";
              for(int space=1; space<=(size/2); space++){
              pattern+="  ";
              }
              }
              return pattern;
        }
        
        public static String displayT1(int line, int size){
             
              String pattern = "";
              if(line==1){
              for(int star=1; star<=size+1; star++){
              pattern+=" *";
              }
              }else{
              for(int space=1; space<=(size/2); space++){
              pattern+="  ";
              }
              pattern+=" *";
              for(int space=1; space<=(size/2); space++){
              pattern+="  ";
              }
              }
              return pattern;
        }
        public static String displayT2(int line, int size){
             
              String pattern = "";
              for(int space=1; space<=(size/2); space++){
              pattern+="  ";
              }
              pattern+=" *";
              for(int space=1; space<=(size/2); space++){
              pattern+="  ";
              }
              return pattern;
        }
        
         public static String displayA1(int line, int size){
              
              String pattern ="";
              if(line==1 || line==size){
              for(int star=1; star<=size+1; star++){
              pattern+=" *";
              }
              }else{
              pattern+=" *";
              for(int space=1; space<size; space++){
              pattern+="  ";
              }
              pattern+=" *";
              }
              return pattern;
        }
        public static String displayA2(int line, int size){
              
              String pattern ="";
              pattern+=" *";
              for(int space=1; space<size; space++){
              pattern+="  ";
              }
              pattern+=" *";
              
              return pattern;
        }
        public static String displayL1(int line, int size){
              
              String pattern = "";
              pattern+=" *";
              for(int space=1; space<=size; space++){
              pattern+="  ";
              }
              return pattern;
        }
        public static String displayL2(int line, int size){
              
              String pattern = "";
              if(line==size-1){
              for(int star=1; star<=size+1; star++){
              pattern+=" *";
              }
              }else{
              pattern+=" *";
              for(int space=1; space<=size; space++){
              pattern+="  ";
              }
              }
              return pattern;
        }
 }             
              
              
              
              
       

        
              
              
                  
