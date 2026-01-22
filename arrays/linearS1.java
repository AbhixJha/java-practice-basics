//find the element 'x' in the array. take array and x as input.

import java.util.Scanner;

public class linearS1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter target elements : ");
        int x = sc.nextInt();
        System.out.println("Enter the array size : ");
        int n = sc.nextInt();
        int[] arr =new int[n];
        System.out.println("Enter the elements of the array :  ");
         for(int i=0;i<n;i++)
         {
            arr[i] = sc.nextInt();
         }
        boolean flag = false;
        for(int i=0;i<n;i++)
        {
            if(arr[i]==x)
        {
            flag=true;
            break;
        }
        } 
        if(flag==true)System.out.println("element found");
        else System.out.println("element not found");
}
    
}
