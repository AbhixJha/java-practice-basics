import java.util.Scanner;

public class SecMax {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the array size:");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int mx = Integer.MIN_VALUE; //FOR MINIMUM VALUE OF ARRAY
        for (int i = 1; i < n; i++) {
            if (arr[i] > mx) {
                mx = arr[i];
            }
        }
        int smx=Integer.MIN_VALUE;
        for(int i=0;i<n;i++)
        {
            if(arr[i] !=mx)
            smx=Math.max(smx,arr[i]);
        }
    

        System.out.println("Maximum value is: " + mx);
        System.out.println("Second max value is : "+smx);
        sc.close();
    }
}


