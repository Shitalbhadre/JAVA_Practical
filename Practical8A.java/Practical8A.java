class Practical8B {
    public static void main(String args[]) {
        getPatternA1(1, 3);
        System.out.println();
        getPatternB1(1, 3);
        System.out.println();
        getPatternC1(1, 5);
        getPatternC2(1, 5);
    }

    // Pattern A
    public static void getPatternA1(int line, int size) {
        if (line > size) {
            return;
        }
        printStars(line);
        System.out.println();
        getPatternA1(line + 1, size);
        if (line < size) {
            printStars(line);
            System.out.println();
        }
    }

    // Pattern B
    public static void getPatternB1(int line, int size) {
        if (line > size + 1) {
            return;
        }
        if (line == size + 1) {
            printPlus(size + 1);
        } else {
            printSpaces((size + 1) - line);
            printStars(line);
        }
        System.out.println();
        getPatternB1(line + 1, size);

        if (line <= size) {
            printSpaces((size + 1) - line);
            printSlash(line);  
            System.out.println();
        }
    }
    //pattern c 
    public static void getPatternC1(int line, int size) {
      if (line <= Math.ceil(size / 2f)) {
         printSpaces((int) Math.ceil(size / 2f) - line);
         printStars(2 * line - 1);
         System.out.println();
         getPatternC1(line + 1, size);
      }
      if (line <= Math.floor(size / 2f)) {
         printSpaces((int) Math.ceil(size / 2f) - line);
         printStars(2 * line - 1);
         System.out.println();
         
      }
    }
    public static void getPatternC2(int line, int size) {
      if (line > size) {  
         return;
      }
      printSpaces((int) Math.ceil(size / 2f) - 1);
      printPlus(1);
      System.out.println();
      getPatternC2(line + 1, size);
   }
    
   public static void printStars(int star) {
        if (star == 0) {
            return;
        }
        System.out.print("* ");
        printStars(star - 1);
    }

    public static void printPlus(int plus) {
        if (plus == 0) {
            return;
        }
        System.out.print("+ ");
        printPlus(plus - 1);
    }

    public static void printSpaces(int space) {
        if (space == 0) {
            return;
        }
        System.out.print("  ");
        printSpaces(space - 1);
    }

    public static void printSlash(int slash) {
        if (slash == 0) {
            return;
        }
        System.out.print("/ ");
        printSlash(slash - 1);
    }
}


    
   

  
   
   





