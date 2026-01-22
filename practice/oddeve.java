import java.util.Scanner;

public class oddeve {
        public static void main(String[] args) {

            int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    
            int sumOdd = 0;
            int sumEven = 0;
    
            for (int i = 0; i < numbers.length; i++) {
                if (numbers[i] % 2 == 0) {
                    sumEven += numbers[i];}
             else {

                    sumOdd += numbers[i];
                
            }
    
        
            
        }
        System.out.println("Sum of even numbers: " + sumEven);
            System.out.println("Sum of odd numbers: " + sumOdd);
    }
}