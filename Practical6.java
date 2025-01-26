class Practical6{
      public static void main(String[] args){
            displayPattern1(3);
            displayPattern2(3);
            displayPattern3(4);
            
      }
      
      public static void displayPattern1(int size){
            for(int ln=1; ln<=size; ln++){
               for(int space=1; space<=(size-ln); space++){
                   System.out.print("  ");
               }
               for(int pattern=1; pattern<=(2*ln-1); pattern++){
                   if(pattern%2 != 0){
                   System.out.print("+"+" ");
                   
                   }else{
                   System.out.print(" "+" ");
                   }
                   
               }
               System.out.println();
           }
           for(int ln=size-1; ln>0; ln--){
               for(int space=(size-ln); space>0; space--){
                   System.out.print("  ");
               }
               for(int pattern=(2*ln-1); pattern>0; pattern--){
                   if(pattern%2 != 0){
                   System.out.print("*"+" ");
                   }else{
                   System.out.print(" "+" ");
                   }
               }
               System.out.println();
           }
           System.out.println("\n\n");
      }
      
      public static void displayPattern2(int size){
            for(int ln=1; ln<=size; ln++){
               for(int space=1; space<=(size-ln); space++){
                   System.out.print("  ");
               }
               for(int pattern=1; pattern<=(2*ln-1); pattern++){
                   System.out.print("+"+" ");
               }
               System.out.println();
            }
            for(int ln=size-1; ln>0; ln--){
               for(int space=(size-ln); space>0; space--){
                   System.out.print("  ");
               }
               for(int pattern=(2*ln-1); pattern>0; pattern--){
                   System.out.print("+"+" ");
               }
               System.out.println();
            }
            System.out.println("\n\n");
       }
                
        public static void displayPattern3(int size){
        for(int ln=1; ln<=size; ln++){
            for(int space=1; space<=(size-ln); space++){
                System.out.print("  ");
            }
            for(int pattern=1; pattern<=(2*ln-1); pattern++){
                if((ln+pattern)%2 == 0)
                System.out.print("*"+" ");
                else{
                System.out.print("+"+" ");
                }
            }
            System.out.println();
}

      for(int ln=size; ln>=1; ln--){
            for(int space=(size-ln); space>=1; space--){
                System.out.print("  ");
            }
            for(int pattern=(2*ln-1); pattern>=1; pattern--){
                if((ln+pattern)%2 != 0)
                System.out.print("*"+" ");
                else{
                System.out.print("+"+" ");
                }
            }
            System.out.println();
      }

}
}
      
      

              
              
