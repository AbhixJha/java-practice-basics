

import java.util.Scanner;

public class addObj    
    {
    
        int a,b;
    void getdata()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter first number :");
        a = sc.nextInt();
        System.out.print("enter second number :");
        b=sc.nextInt();
     }
     void putdata()
     {
        System.out.print("addition :"+(a+b));
     }
     public static void main(String[] args)
    {
     addObj aa = new addObj();
     aa.getdata();
     aa.putdata();
    }

    }
