public class Practical5 {
    public static void main(String[] args) {
        int num = 5; 
        calculateFactorials(num);

        int[] array = {10, 20, 30, 40};
        calculateSum(array);
    }

    
    public static void calculateFactorials(int num) {
        System.out.println("Factorial using for loop: " + getFactorial1(num));
        System.out.println("Factorial using while loop: " + getFactorial2(num));
        System.out.println("Factorial using recursion: " + getFactorial3(num));
    }

    public static int getFactorial1(int num) {
        int factorial = 1;
        for (int i = 1; i <= num; i++) {
            factorial *= i;
        }
        return factorial;
    }

    public static int getFactorial2(int num) {
        int factorial = 1;
        while (num > 0) {
            factorial *= num;
            num--;
        }
        return factorial;
    }

    public static int getFactorial3(int num) {
        if (num < 0) {
            return -1; 
        } else if (num == 0 || num == 1) {
            return 1; 
        } else {
            return num * getFactorial3(num - 1); 
        }
    }

   
    public static void calculateSum(int[] array) {
        int sumUsingRecursion = getSum1(array, 0); 
        System.out.println("Sum of array elements using recursion: " + sumUsingRecursion);

        int sumUsingWhileLoop = getSum2(array);
        System.out.println("Sum of array elements using while loop: " + sumUsingWhileLoop);
    }

    public static int getSum2(int[] num) {
        int sum = 0;
        int i = 0;
        int len = num.length;
        while (i < len) {
            sum += num[i];
            i++;
        }
        return sum;
    }

    public static int getSum1(int[] arr, int i) {
        if (i == arr.length) { 
            return 0;
        } else {
            return arr[i] + getSum1(arr, i + 1); 
        }
    }
}

