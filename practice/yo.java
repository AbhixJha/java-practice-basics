import java.util.Scanner;

public class yo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the target elemment");
        int x=sc.nextInt();
        System.out.println("Enter the size of the array");
        int n=sc.nextInt();
        int [] arr =new int[n];
        System.out.println("Enter the Elements of the Array");
        for(int i=0;i<n;i++){
        arr[i] = sc.nextInt();
        }
        for(int i=0;i<n;i++){
            if (arr[i]==x){
                System.out.println("element found");
            }
            else
            {System.out.println("Element not found");}
            break;
        }
    }
}
