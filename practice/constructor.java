import java.util.Scanner;

public class constructor {
    int a,b;
   void  add()
    {
        a=0;b=0;
    }
    void add(int x,int y)
    {
        a=x;
        b=y;
    }
    void inputdata()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number you want to add : ");
        a=sc.nextInt();
        System.out.println("Enter the second number you want to add : ");
        b=sc.nextInt();
    }
    void display()
    {
    System.out.println("a="+a+"b ="+b);
    }
    void getdata(){
        int c;
        c=a+b;
        System.out.println("Addition : " +c);
    }
    public static void main(String[] args) {
        constructor aa = new constructor();
        aa.display();
        aa.inputdata();
        aa.getdata();
        
    }

    
    
}
