import java.util.Scanner;

public class output {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array:- ");
         int n = sc.nextInt();
         System.out.print("Enter the array elemnets :-");
        int[] arr = new int[n]; ///we can also use this "int[] arr= {10,20,3,4,2,67};" 
        //int n=arr.length;    //prints the length of an array.
        for(int i=0;i<=n-1;i++){

            arr[i] =sc.nextInt();
        }
        for(int i=0;i<=n-1;i++){
            System.out.println( arr[i] +":");
            
        }

    }
}
