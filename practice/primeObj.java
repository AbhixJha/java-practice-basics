import java.util.Scanner;

public class primeObj {
    int n;

     void getdata()
     {
       try (Scanner sc = new Scanner(System.in)) {
         System.out.println("Enter a Number : ");
         n=sc.nextInt();
       }
     }
     void putdata(){
        int count =0;
        for(int i=1;i<=n;i++){
         if(n%i==0){
            count =count+1;
         }
        }
        if (count==2)
        {
            System.out.print("prime");
        }
        else{
            System.out.println("The number is not prime");
        }
     }
     public static void main(String[] args) {
        primeObj aa = new primeObj();
        aa.getdata();
        aa.putdata();
     }
}
